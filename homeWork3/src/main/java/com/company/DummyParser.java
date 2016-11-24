package com.company;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by gulnur on 23.11.16.
 */
public class DummyParser implements Parser<String> {
    @Override
    public void print(){
        System.out.println("File parsed successfully");
    }

    @Override
    public Iterable<String> parse(String filename) throws IOException{
        Iterable<String> tt = new ArrayList<String>();
        return tt;
    }
}
