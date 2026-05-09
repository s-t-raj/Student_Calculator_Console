package com.raja.grades.service;

import com.raja.grades.dao.StudentDAO;
import com.raja.grades.exception.InputIdValidation;
import com.raja.grades.exception.InvalidInputException;
import com.raja.grades.exception.InvalidMarkException;
import com.raja.grades.model.Subject;

public class ValidationService {

    public void isMarkValidOrNot(int mark)
                throws InvalidMarkException {
                    if (mark > 100 || mark < 0) {
                        throw new InvalidMarkException("Invalid mark enter the marks between 0 - 100 Only ...");
                    }
                }


    public void stringValidation(String value)
    throws InvalidInputException {
        if(value == null || value.trim().isEmpty()){
            throw new InvalidInputException("Enter the Correct Input you entered Some Numbers in Input Field......");
        }
    }



    public void idValidation(int value)
    throws InputIdValidation {
        if(value <= 0){
            throw new InputIdValidation("Enter the Valid User ID .....");
        }
    }

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
