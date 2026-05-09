package com.raja.grades.model;

public class Student {
    private int studentId;
    private String studentName;
    private String studentCourse;
    private String studentGrade;
    private double studentAvg;
    private Subject subject;
    private String passOrFailInfo;

    public Student(int studentId , String studentName , String studentCourse , Subject subject){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCourse = studentCourse;
        this.subject = subject;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public void setStudentAvg(double studentAvg) {
        this.studentAvg = studentAvg;
    }

    public String getPassOrFailInfo() {
        return passOrFailInfo;
    }

    public void setPassOrFailInfo(String passOrFailInfo) {
        this.passOrFailInfo = passOrFailInfo;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public double getStudentAvg() {
        return studentAvg;
    }

    @Override
    public String toString(){
        return "ID: " + studentId +
                " | Name: " + studentName +
                " | Course: " + studentCourse +
                " | Grade: " + studentGrade +
                " | Avg: " + studentAvg +
                " | Subject: " + subject;
    }


}

