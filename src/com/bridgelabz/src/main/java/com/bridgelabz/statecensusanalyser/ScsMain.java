package com.bridgelabz.src.main.java.com.bridgelabz.statecensusanalyser;

public class ScsMain {
    public static void main(String[] args) throws CensusAnalyserException {

        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            int numberOfRecords = stateCensusAnalyser.loadStateCensusData();
            System.out.println("Number of records: " + numberOfRecords);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            int numberOfStateCodes = stateCensusAnalyser.loadStateCodeData();
            System.out.println("Number of records: " + numberOfStateCodes);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        // other data analysis operations
    }
}
