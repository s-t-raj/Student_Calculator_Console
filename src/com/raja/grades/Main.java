package com.raja.grades;

import com.raja.grades.exception.DuplicateStudentException;
import com.raja.grades.exception.InputIdValidation;
import com.raja.grades.exception.InvalidInputException;
import com.raja.grades.exception.InvalidMarkException;
import com.raja.grades.model.Student;
import com.raja.grades.model.Subject;
import com.raja.grades.service.StudentService;
import com.raja.grades.service.ValidationService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        ValidationService validationService = new ValidationService();
            while(true){
                System.out.println("======== Student Grade Calculator ==========");
                System.out.println("1. Add Student");
                System.out.println("2. Update Student");
                System.out.println("3. List All Students");
                System.out.println("4. Search Student By using ID");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");
                System.out.println("=============================================");

                System.out.println();
                System.out.println();

                try {
                    System.out.println("-------------------------");
                    System.out.println("Enter Your Choice : ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    System.out.println("--------------------------");
                    int studentId = 0;
                    String studentName = "";
                    String studentCourse = "";
                    int tamil = 0 , english = 0 , maths = 0 , science = 0 , social = 0;


                    switch (choice){
                        case 1 :

                            System.out.println();
                            System.out.println("=== ADD STUDENT ===");

                            try{
                                System.out.println("Enter the Student ID : ");
                                studentId =Integer.parseInt(scanner.nextLine());
                                validationService.idValidation(studentId);
                            }
                            catch (NumberFormatException e){
                                System.out.println("Invalid Number....");
                                break;
                            }
                            catch (InputIdValidation e){
                                System.out.println(e.getMessage());
                                break;
                            }


                            try{
                                System.out.println("Enter the Student Name : ");
                                studentName = scanner.nextLine();
                                validationService.stringValidation(studentName);
                            }
                            catch (InvalidInputException e){
                                System.out.println(e.getMessage());
                                break;
                            }


                            try{
                                System.out.println("Enter the Student Course : ");
                                studentCourse = scanner.nextLine();
                                validationService.stringValidation(studentCourse);
                            }
                            catch (InvalidInputException e){
                                System.out.println(e.getMessage());
                                break;
                            }

                            System.out.println("======================================");


                            try{

                                System.out.println("Enter Tamil Mark : ");
                                tamil = Integer.parseInt(scanner.nextLine());
                                validationService.isMarkValidOrNot(tamil);

                                System.out.println("Enter English Mark : ");
                                english = Integer.parseInt(scanner.nextLine());
                                validationService.isMarkValidOrNot(english);

                                System.out.println("Enter Maths Mark : ");
                                maths = Integer.parseInt(scanner.nextLine());
                                validationService.isMarkValidOrNot(maths);

                                System.out.println("Enter Science Mark : ");
                                science = Integer.parseInt(scanner.nextLine());
                                validationService.isMarkValidOrNot(science);

                                System.out.println("Enter Social Mark : ");
                                social = Integer.parseInt(scanner.nextLine());
                                validationService.isMarkValidOrNot(social);
                            }
                            catch (NumberFormatException e){
                                System.out.println("Enter a valid Number ......");
                                break;
                            }
                            catch (InvalidMarkException e){
                                System.out.println(e.getMessage());
                                break;
                            }



                            Subject subject = new Subject(tamil , english , maths , science , social);
                            Student student = new Student(studentId , studentName , studentCourse , subject);

                            try {
                                studentService.addStudentService(student);
                                System.out.println("Student Added Sucessfully ✓✓✓✓✓✓");
                            }
                            catch (DuplicateStudentException e){
                                System.out.println(e.getMessage());
                                break;
                            }


                            break;




                        case 2 :

                            System.out.println();
                            System.out.println("=== UPDATE STUDENT ===");

                            try{
                                System.out.println("Enter the Student ID : ");
                                studentId =Integer.parseInt(scanner.nextLine());
                                validationService.idValidation(studentId);
                            }
                            catch (NumberFormatException e){
                                System.out.println("Invalid Number....");
                                break;
                            }
                            catch (InputIdValidation e){
                                System.out.println(e.getMessage());
                                break;
                            }


                            try{
                                System.out.println("Enter the Student Name : ");
                                studentName = scanner.nextLine();
                                validationService.stringValidation(studentName);
                            }
                            catch (InvalidInputException e){
                                System.out.println(e.getMessage());
                                break;
                            }


                            try{
                                System.out.println("Enter the Student Course : ");
                                studentCourse = scanner.nextLine();
                                validationService.stringValidation(studentCourse);
                            }
                            catch (InvalidInputException e){
                                System.out.println(e.getMessage());
                                break;
                            }

                            System.out.println("======================================");


                            try{

                                System.out.println("Enter Tamil Mark : ");
                                tamil = Integer.parseInt(scanner.nextLine());
                                validationService.isMarkValidOrNot(tamil);

                                System.out.println("Enter English Mark : ");
                                english = Integer.parseInt(scanner.nextLine());
                                validationService.isMarkValidOrNot(english);

                                System.out.println("Enter Maths Mark : ");
                                maths = Integer.parseInt(scanner.nextLine());
                                validationService.isMarkValidOrNot(maths);

                                System.out.println("Enter Science Mark : ");
                                science = Integer.parseInt(scanner.nextLine());
                                validationService.isMarkValidOrNot(science);

                                System.out.println("Enter Social Mark : ");
                                social = Integer.parseInt(scanner.nextLine());
                                validationService.isMarkValidOrNot(social);
                            }
                            catch (NumberFormatException e){
                                System.out.println("Enter a valid Number ......");
                                break;
                            }
                            catch (InvalidMarkException e){
                                System.out.println(e.getMessage());
                                break;
                            }



                            Subject updateSubject = new Subject(tamil , english , maths , science , social);
                            Student updateStudent = new Student(studentId , studentName , studentCourse , updateSubject);


                            studentService.updateStudentService(updateStudent);
                            System.out.println("Student Updated Sucessfully ✓✓✓✓✓✓");
                            break;


                        case 3:
                            System.out.println("=========== ALL STUDENTS LIST =================");
                            ArrayList<Student> studentList = studentService.getAllStudentsService();
                            System.out.println("Total students: " + studentList.size());

                            if(studentList.isEmpty()){
                                System.out.println("Student records Not Found .....");
                            }
                            else {
                                for (Student s : studentList) {
                                    System.out.println(s);
                                }
                            }

                            break;

                        case 4:
                            System.out.println("============SEARCH STUDENT BY USING ID================");
                            int searchId = 0;
                            try{
                                System.out.println("Enter an ID : ");
                                searchId = Integer.parseInt(scanner.nextLine());
                            }
                            catch (NumberFormatException e){
                                System.out.println("Enter Numbers Only ...........");
                                break;
                            }
                            Student foundStudent = studentService.getStudentByIdService(searchId);
                            if(foundStudent == null){
                                System.out.println("Student Not Found....");
                            }
                            else {
                                System.out.println(foundStudent);
                            }
                            break;


                        case 5:
                            System.out.println("================ DELETE STUDENT ====================");
                            int deleteId = 0;
                            try{
                                System.out.println("Enter an ID : ");
                                deleteId = Integer.parseInt(scanner.nextLine());
                            }
                            catch (NumberFormatException e){
                                System.out.println("Enter Numbers Only ...........");
                                break;
                            }

                            String message = studentService.deleteStudentService(deleteId);
                            System.out.println(message);
                            break;

                        case 6:
                            System.out.println(" THANKYOU ......");
                            return;

                        default:
                            System.out.println("Entered Wrong Number.........");
                    }
                }
                catch (NumberFormatException e){
                    System.out.println("Invalid Choice Enter the valid Choice (1 to 6) ........");
                }

            }
    }
}