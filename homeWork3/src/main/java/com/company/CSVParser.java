package com.company;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class CSVParser implements Parser<Trade> {

    @Override
    public Iterable<Trade> parse(String filename) throws IOException{
        try {
            Reader in = new FileReader(filename);
            Collection<Trade> records = new ArrayList<Trade>();
            for (CSVRecord record:CSVFormat.EXCEL.parse(in)){
                records.add(new Trade(record.toMap()));
            }
            return records;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("There was an error while parsing CSV file");
        }
    }

    @Override
    public void print(){
        System.out.println("");
    }
}