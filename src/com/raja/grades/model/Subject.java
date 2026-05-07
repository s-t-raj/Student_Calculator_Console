package com.raja.grades.model;

public class Subject {
    private int tamil;
    private int english;
    private int math;
    private int science;
    private int social;

    public Subject(int tamil, int english, int math, int science, int social) {
        this.tamil = tamil;
        this.english = english;
        this.math = math;
        this.science = science;
        this.social = social;
    }

    public void setTamil(int tamil) {
        this.tamil = tamil;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public int getTamil() {
        return tamil;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public int getScience() {
        return science;
    }

    public int getSocial() {
        return social;
    }
}
