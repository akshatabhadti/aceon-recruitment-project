package com.example.aceonapp;

public class JobModal {

    private String jName ;
    private String jEmail;
    private int id;

    public JobModal(String jName, String jEmail) {
        this.jName = jName;
        this.jEmail = jEmail;
    }


    public String getjobName() {
        return jName;
    }

    public void setJobName(String jName) {
        this.jName = jName;
    }

    public String getjobEmail() {
        return jEmail;
    }

    public void setJobEmail(String jEmail) {
        this.jEmail = jEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
