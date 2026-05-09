package com.raja.grades.dao;

import com.raja.grades.model.Student;

import java.util.ArrayList;

public class StudentDAO {
    ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){
        studentList.add(student);
    }

    public ArrayList<Student> getAllStudents(){
        return studentList;
    }

    public Student getStudentById(int id){
        for(Student s : studentList){
            if(s.getStudentId()==id){
                return s;
            }
        }
        return null;
    }

    public String updateStudent(int id , Student updatedStudent){
        for(int i = 0 ; i < studentList.size() ; i++){
            if(studentList.get(i).getStudentId() == id){
                studentList.set(i, updatedStudent);
                return "Student Updated Sucessfully....";
            }
        }
        return "Student Not Found... or Mismatch ID...";
    }

    public String deleteStudent(int id){
        for(int i = 0; i < studentList.size() ; i++){
            if(studentList.get(i).getStudentId() == id){
                studentList.remove(i);
                return "Student Deleted Sucessfully...";
            }
        }
        return "Student Not Found or Already Deleted...";
    }

    public boolean isDuplicateId(int id){
        for(Student s : studentList){
            if(id == s.getStudentId()){
                return true;
            }
        }
        return false;
    }


}
