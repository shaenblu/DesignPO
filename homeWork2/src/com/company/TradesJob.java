package com.company;


import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.List;

public class TradesJob {

    private final TradesDAO tradesDAO;

    public TradesJob(TradesDAO tradesDAO) {

        this.tradesDAO = tradesDAO;
    }

    public void run() throws IOException {
        Downloader d = new FTPDownloader();
        String f = (String)d.downloadTradesFile();
        Parser<Trade> p = new CSVParser();
        Iterable<Trade> trades = p.parse(f);
        TradesDAO td = new TradesDAO();
        td.updateTrades(trades);
    }
}