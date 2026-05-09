package com.raja.grades.service;

import com.raja.grades.dao.StudentDAO;
import com.raja.grades.exception.DuplicateStudentException;
import com.raja.grades.model.Student;

import java.util.ArrayList;

public class StudentService {
    private StudentDAO studentDAO = new StudentDAO();
    private AverageService averageService = new AverageService();
    private GradeService gradeService = new GradeService();
    private ValidationService validationService = new ValidationService();

    public void addStudentService(Student student)
    throws DuplicateStudentException {
       if(studentDAO.isDuplicateId(student.getStudentId())){
           throw new DuplicateStudentException("Student Already Exist....");
       }
       student.setPassOrFailInfo(validationService.isPassOrFail(student.getSubject()));
       double avg = averageService.calAverage(student.getSubject());
       student.setStudentGrade(gradeService.calGrade(avg));
       student.setStudentAvg(avg);

       studentDAO.addStudent(student);
    }

    public ArrayList<Student> getAllStudentsService(){
        return studentDAO.getAllStudents();
    }

    public Student getStudentByIdService(int id){
        return studentDAO.getStudentById(id);
    }

    public void updateStudentService(Student student){
        student.setPassOrFailInfo(validationService.isPassOrFail(student.getSubject()));
        double avg = averageService.calAverage(student.getSubject());
        student.setStudentGrade(gradeService.calGrade(avg));
        student.setStudentAvg(avg);
        studentDAO.updateStudent(student.getStudentId() , student);
    }

    public String deleteStudentService(int id){
        return studentDAO.deleteStudent(id);
    }
}
