package com.bridgelabz.src.main.java.com.bridgelabz.statecensusanalyser;

class StateCensusData {
    private String stateCode;
    private String districtCode;
    private String subDistrictCode;
    private String isuds;
    private String name;
    private String totalRuralUrban;
    private String Inhabited;
    private String Uninhabited;
    private String Numberoftowns;
    private String Numberofhouseholds;
    private String Persons;
    private String Males;
    private String Females;
    private String Area;
    private String Population;

    public StateCensusData(String stateCode, String districtCode, String subDistrictCode, String isuds, String name, String totalRuralUrban, String inhabited, String uninhabited, String numberoftowns, String numberofhouseholds, String persons, String males, String females, String area, String population) {
        this.stateCode = stateCode;
        this.districtCode = districtCode;
        this.subDistrictCode = subDistrictCode;
        this.isuds = isuds;
        this.name = name;
        this.totalRuralUrban = totalRuralUrban;
        Inhabited = inhabited;
        Uninhabited = uninhabited;
        Numberoftowns = numberoftowns;
        Numberofhouseholds = numberofhouseholds;
        Persons = persons;
        Males = males;
        Females = females;
        Area = area;
        Population = population;
    }

    public StateCensusData(String datum) {
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getSubDistrictCode() {
        return subDistrictCode;
    }

    public void setSubDistrictCode(String subDistrictCode) {
        this.subDistrictCode = subDistrictCode;
    }

    public String getIsuds() {
        return isuds;
    }

    public void setIsuds(String isuds) {
        this.isuds = isuds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalRuralUrban() {
        return totalRuralUrban;
    }

    public void setTotalRuralUrban(String totalRuralUrban) {
        this.totalRuralUrban = totalRuralUrban;
    }

    public String getInhabited() {
        return Inhabited;
    }

    public void setInhabited(String inhabited) {
        Inhabited = inhabited;
    }

    public String getUninhabited() {
        return Uninhabited;
    }

    public void setUninhabited(String uninhabited) {
        Uninhabited = uninhabited;
    }

    public String getNumberoftowns() {
        return Numberoftowns;
    }

    public void setNumberoftowns(String numberoftowns) {
        Numberoftowns = numberoftowns;
    }

    public String getNumberofhouseholds() {
        return Numberofhouseholds;
    }

    public void setNumberofhouseholds(String numberofhouseholds) {
        Numberofhouseholds = numberofhouseholds;
    }

    public String getPersons() {
        return Persons;
    }

    public void setPersons(String persons) {
        Persons = persons;
    }

    public String getMales() {
        return Males;
    }

    public void setMales(String males) {
        Males = males;
    }

    public String getFemales() {
        return Females;
    }

    public void setFemales(String females) {
        Females = females;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getPopulation() {
        return Population;
    }

    public void setPopulation(String population) {
        Population = population;
    }
}