package com.bridgelabz.src.main.java.com.bridgelabz.statecensusanalyser;

class StateCodeData {
    private String state;
    private String population;
    private String area;
    private String density;

    public StateCodeData(String state, String population, String area, String density) {
        this.state = state;
        this.population = population;
        this.area = area;
        this.density = density;
    }

    public StateCodeData(String state) {
        this.state = state;
    }


}