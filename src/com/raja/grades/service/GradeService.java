package com.raja.grades.service;

public class GradeService {
    public String calGrade(double avg){
        if(avg >= 90){
            return "O";
        } else if(avg >= 80){
            return "A+";
        } else if(avg >= 70){
            return "A";
        } else if(avg >= 60){
            return "B+";
        } else if(avg >= 50){
            return "B";
        } else {
            return "C";
        }
    }
}
