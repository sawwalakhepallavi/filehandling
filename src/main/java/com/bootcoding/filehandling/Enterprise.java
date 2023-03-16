package com.bootcoding.filehandling;

public class Enterprise {
    private int year;
    private int value;
    private String VariableCode;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getVariableCode() {
        return VariableCode;
    }

    public void setVariableCode(String variableCode) {
        VariableCode = variableCode;
    }

    public String getVariableCategory() {
        return VariableCategory;
    }

    public void setVariableCategory(String variableCategory) {
        VariableCategory = variableCategory;
    }

    private String VariableCategory;
}
