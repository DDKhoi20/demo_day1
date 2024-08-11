package student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService studentService = context.getBean(StudentService.class);


        System.out.println("----Student----");
        studentService.getAllStudents().forEach(System.out::println);


        Student newStudent = new Student(3, "New Student");
        studentService.addStudent(newStudent);
        System.out.println("----Add new student----");
        studentService.getAllStudents().forEach(System.out::println);


        newStudent.setName("Updated Student");
        studentService.updateStudent(newStudent);
        System.out.println("----- Student -----");
        studentService.getAllStudents().forEach(System.out::println);


        studentService.deleteStudent(1);
        System.out.println("----- Delete student -----");
        studentService.getAllStudents().forEach(System.out::println);

        context.close();
    }
}
