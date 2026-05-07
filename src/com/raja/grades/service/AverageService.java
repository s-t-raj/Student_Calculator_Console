package com.raja.grades.service;

import com.raja.grades.model.Subject;

public class AverageService {
    public double calAverage (Subject subject){
      double average = (subject.getTamil()+ subject.getEnglish()+ subject.getMath()+ subject.getScience()+ subject.getSocial())/5;
      return average;
    }
}
