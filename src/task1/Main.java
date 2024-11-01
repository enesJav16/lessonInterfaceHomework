package task1;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EducationCenter educationCenter1=new School("Peaksoft","KG",LocalDate.of(2020,1,1));
        EducationCenter educationCenter2=new University("Ala-Too","KG",LocalDate.of(1998,1,1));
        EducationCenter educationCenter3=new Collage("Compass","KG",LocalDate.of(2018,1,1));

        Student []students={
                new Student("name1","surname1","gender1", LocalDate.of(2022,8,1),educationCenter1),
                new Student("name2","surname2","gender2", LocalDate.of(2020,8,2),educationCenter1),
                new Student("name3","surname3","gender3", LocalDate.of(2024,8,3),educationCenter1),
                new Student("name4","surname4","gender4", LocalDate.of(2021,8,4),educationCenter2),
                new Student("name5","surname5","gender5", LocalDate.of(2018,8,5),educationCenter2),
                new Student("name6","surname6","gender6", LocalDate.of(2019,8,6),educationCenter2),
                new Student("name7","surname7","gender7", LocalDate.of(2022,8,7),educationCenter2),
                new Student("name8","surname8","gender8", LocalDate.of(2020,8,8),educationCenter3),
                new Student("name9","surname9","gender9", LocalDate.of(2010,8,9),educationCenter3),
                new Student("name10","surname10","gender10", LocalDate.of(2012,8,10),educationCenter3),
        };
        print(students);


    }
    public static void printEducationCenter(EducationCenter educationCenter){
        System.out.println("Name              : "+educationCenter.getName()+
                           "\nCountry           : "+educationCenter.getCountry()+
                           "\nDate of foundation: "+educationCenter.getFoundationDate() );
    }

    public static void print(Student []student){
        for(Student student1:student){
            System.out.println("\n=====================================");
            System.out.println("Name       : "+student1.getName()+
                               "\nSurname    : "+student1.getSurname()+
                               "\nGender     : "+student1.getGender()+
                               "\nStart Date : "+student1.getStartDate() +
                               "\nStudy years: "+student1.getStudentStudyingYear() +
                               "\nEducation center: ");
            printEducationCenter(student1.getStudentEducationCenter());
        }
    }
}