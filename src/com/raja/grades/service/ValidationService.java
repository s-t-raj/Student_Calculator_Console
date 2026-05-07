package com.raja.grades.service;

import com.raja.grades.model.Subject;

public class ValidationService {

    public String isPassOrFail(Subject subject){
        if(     subject.getTamil() >= 35 &&
                subject.getEnglish() >= 35 &&
                subject.getMath() >= 35 &&
                subject.getScience() >= 35 &&
                subject.getSocial() >= 35) {

            return "Passed In All Subjects.....";
        }
        else {
            return "Sorry you are not passed in all subjects";
        }
    }
}
