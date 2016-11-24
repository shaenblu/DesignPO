package com.company;


public class DummyDownloader implements Downloader{

    @Override
    public void print(){
        System.out.println("File downloaded successfully");
    }

    @Override
    public String downloadTradesFile() {
        String v = "return";
        return  v;

    }

}
