package com.company;

import com.company.*;

import javax.annotation.PostConstruct;
import java.io.IOException;

public class TradesJob {
    private final TradesDAO tradesDAO;
    private final Downloader dd;
    private final Parser<String> s;

    public TradesJob(TradesDAO tradesDAO, DummyDownloader dd, DummyParser s) {
        this.tradesDAO = tradesDAO;
        this.dd = dd;
        this.s = s;
    }
    
    public void run() throws IOException {
        //Downloader d = new FTPDownloader();
        //String f = (String)d.downloadTradesFile();
        dd.print();

        //Parser<Trade> p = new CSVParser();
        //Iterable<Trade> trades = p.parse(f);
        s.print();
        tradesDAO.deleteAll();
        //td.updateTrades(trades);
    }

    @PostConstruct
    public void init()throws IOException{
        run();
    }


}
