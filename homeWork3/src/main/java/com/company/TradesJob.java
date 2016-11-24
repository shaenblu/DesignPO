package com.company;

import com.company.*;

import javax.annotation.PostConstruct;
import java.io.IOException;

public class TradesJob {

    private final TradesDAO tradesDAO;

    public TradesJob(TradesDAO tradesDAO) {
        this.tradesDAO = tradesDAO;
    }

    public void run() throws IOException {
        //Downloader d = new FTPDownloader();
        //String f = (String)d.downloadTradesFile();
        Downloader dd = new DummyDownloader();
        dd.print();

        //Parser<Trade> p = new CSVParser();
        //Iterable<Trade> trades = p.parse(f);
        Parser<String> s = new DummyParser();
        s.print();

        TradesDAO td = new TradesDAO();
        //td.updateTrades(trades);
    }

    @PostConstruct
    public void init()throws IOException{
        run();
    }


}
