package student;

import java.util.List;

public class StudentService {

    private StudentRepository studentRepository;

    // Dependency injection via setter method
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        studentRepository.insert(student);
    }

    public void updateStudent(Student student) {
        studentRepository.update(student);
    }

    public void deleteStudent(long id) {
        studentRepository.delete(id);
    }

    public Student getStudentById(long id) {
        return studentRepository.findById(id);
    }
}
