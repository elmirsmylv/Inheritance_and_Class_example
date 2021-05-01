package com.company;

public class UserManager {
    public void addToDB(User student,User instructor, Courses course){
        System.out.println("\nÖğrenci Adı: " + student.fullName + "\nEğitmen: " + instructor.fullName + "\nAldığı Ders: " + course.courseName);
        System.out.println("-----------------------------");
    }

    public void addToDBMultiple(User student,User instructor, Courses course){
        StudentManager studentManager = new StudentManager();
        studentManager.addStudentForUser(student);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addInstructorForUser(instructor);

        CourseManager courseManager = new CourseManager();
        courseManager.addCourseForUser(course);

        System.out.println("-----------------------------");
    }
}
