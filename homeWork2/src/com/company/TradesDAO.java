package com.company;

import org.apache.commons.csv.CSVRecord;

import java.util.Collection;

public class TradesDAO{


    public Collection<Trade> findAll() {
        // read all records from database
        return null;
    }

    public void deleteAll() {
        // remove all records from database
    }

    public void save(Trade trade) {
        // save Trade in database
    }
    public void updateTrades(Iterable<Trade> trades) {
        deleteAll();
        for (Trade trade: trades) {
            save(trade);
        }
    }
}