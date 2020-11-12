package com.example.TestRun;


import java.util.ArrayList;
import java.util.List;

public class TheModel {

    public String status;
    public String copyright;
    public String section;
    public String last_updated;
    public long num_results;
    public List<Result> results = new ArrayList<>();

    public TheModel() {

        Result newResult = new Result();
        results.add(newResult);
    }

    public TheModel(String status, String copyright,
                    String section, String last_updated,
                    long num_results) {

        this.status = status;
        this.copyright = copyright;
        this.section = section;
        this.last_updated = last_updated;
        this.num_results = num_results;

    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getSection() {
        return section;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public long getNum_results() {
        return num_results;
    }
}
