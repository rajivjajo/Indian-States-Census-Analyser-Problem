package com.bridgelabz.src.main.java.com.bridgelabz.statecensusanalyser;

import java.util.*;
import java.io.*;

class CSVStateCensus {
    public List<StateCensusData> loadCSVData() throws IOException {
        String csvFilePath = "D:\\Day29-practiceProblem\\src\\main\\java\\com\\bridgelabz\\statecensusanalyser\\A-1_NO_OF_VILLAGES_TOWNS_HOUSEHOLDS_POPULATION_AND_AREA.xlsx";
        List<StateCensusData> censusDataList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFilePath));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");
            StateCensusData censusData = new StateCensusData(data[0]);
            censusDataList.add(censusData);
        }
        bufferedReader.close();
        return censusDataList;
    }
}


