package com.hsiangyu.example.demo.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchObj implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("SEARCH_TYPE")
    private int searchType = 0;

    @JsonProperty("SEARCH_NAME")
    private String searchName = "";

    @JsonProperty("SEARCH_AGE")
    private int searchAge = 0;

    public int getSearchType() {
        return searchType;
    }

    public void setSearchType(int searchType) {
        this.searchType = searchType;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public int getSearchAge() {
        return searchAge;
    }

    public void setSearchAge(int searchAge) {
        this.searchAge = searchAge;
    }

}
