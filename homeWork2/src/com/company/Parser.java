package com.company;

import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.*;

public interface Parser<T> {
    Iterable<T> parse(String filename) throws IOException;
}
