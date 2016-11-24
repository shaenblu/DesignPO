package com.company;

import java.io.IOException;


public interface Parser<T> {
    Iterable<T> parse(String filename) throws IOException;
    void print();
}