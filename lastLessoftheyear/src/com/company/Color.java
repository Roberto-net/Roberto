package com.company;

public enum Color {
    BLACK("rgb(0,0,0)"),
    GREEN("rgb(0,255,0)"),
    RED("rgb(255,0,0)"),
    YELLOW("rgb(255,252,15)"),
    GRAY("rgb(0,83,78)");
    private String value;
        Color(String value){
            this.value=value;
        }

    public String getValue() {
        return value;
    }

}
