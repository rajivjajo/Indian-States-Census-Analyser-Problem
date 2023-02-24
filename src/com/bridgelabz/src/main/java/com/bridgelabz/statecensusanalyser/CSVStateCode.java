package com.bridgelabz.src.main.java.com.bridgelabz.statecensusanalyser;
import java.util.*;
import java.io.*;

class CSVStateCode {
    public static List<StateCodeData> loadCSVData() throws IOException {
        String csvFilePath = "D:\\Day29-practiceProblem\\src\\main\\java\\com\\bridgelabz\\statecensusanalyser\\A-1_NO_OF_VILLAGES_TOWNS_HOUSEHOLDS_POPULATION_AND_AREA.xlsx";
        List<StateCodeData> stateCodeList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                StateCodeData stateCode = new StateCodeData(values[0]);
                stateCodeList.add(stateCode);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());        }
        return stateCodeList;
    }
}
