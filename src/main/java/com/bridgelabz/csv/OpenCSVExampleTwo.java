package com.bridgelabz.csv;


import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/*
Retrive each record as string array
 */
public class OpenCSVExampleTwo {
    private static final String CSV_PATH = "/home/admin1/IdeaProjects/CSV-Example/user.csv";

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(CSV_PATH));
                CSVReader csvReader = new CSVReader(reader);
        ) {
            // Reading All Records At once using list
            List<String[]> records =csvReader.readAll();
            for (String[] record  :records) {
                System.out.println("Name : "+ record[0]);
                System.out.println("Email : "+record[1]);
                System.out.println("Phone : " +record[2]);
                System.out.println("Country : "+record[3]);
                System.out.println("=============================");
            }
        }
    }
}
