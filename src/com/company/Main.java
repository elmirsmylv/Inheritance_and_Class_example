package com.company;

public class Main {

    public static void main(String[] args) {
        Instructor instructor1 = new Instructor();
        instructor1.id = 1;
        instructor1.fullName = "Engin DEMIROĞ";
        instructor1.age = 28;
        instructor1.email = "engindemirog@gmail.com";
        instructor1.courseAmount = 3;
        instructor1.resume = "Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarına sahip.";
        instructor1.studentAmount = 10000;

        Courses course1 = new Courses();
        course1.id = 1;
        course1.instructor = instructor1.fullName;
        course1.courseName = "JAVA & React Bootcamp";

        Courses course2 = new Courses();
        course2.id = 2;
        course2.instructor = instructor1.fullName;
        course2.courseName = "C# & Angular Bootcamp";

        Student student1 = new Student();
        student1.id = 1;
        student1.fullName = "Elmir ISMAYILOV";
        student1.age = 20;
        student1.email = "elmir@gmail.com";
        student1.lesson = course1.courseName;

        Student student2 = new Student();
        student2.id = 2;
        student2.fullName = "Deniz YIKAR";
        student2.age = 20;
        student2.email = "denizyikar@gmail.com";
        student2.lesson = course2.courseName;

        UserManager userManager = new UserManager();

        userManager.addToDB(student1,instructor1, course1);
        userManager.addToDBMultiple(student2,instructor1, course2);

    }
}
