package com.bridgelabz.src.main.java.com.bridgelabz.statecensusanalyser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StateCensusAnalyser {

    public int loadStateCensusData() throws CensusAnalyserException {
        try {
            CSVStateCensus csvStateCensus = new CSVStateCensus();
            List<StateCensusData> censusDataList = csvStateCensus.loadCSVData();
            return censusDataList.size();
        } catch (IOException e) {
            throw new CensusAnalyserException("Error while reading file", e);
        }
    }

    public int loadStateCodeData() throws CensusAnalyserException {
        try {
            CSVStateCode csvStates = new CSVStateCode();
            List<StateCodeData> stateCodeList = CSVStateCode.loadCSVData();
            return stateCodeList.size();
        } catch (IOException e) {
            throw new CensusAnalyserException("Error while reading file", e);
        }
    }
}