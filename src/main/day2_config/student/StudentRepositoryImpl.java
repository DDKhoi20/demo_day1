package student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private List<Student> students = new ArrayList<>();

    {
        // Initialize with 2 students
        students.add(new Student(1, "Student One"));
        students.add(new Student(2, "Student Two"));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void insert(Student student) {
        students.add(student);
    }

    @Override
    public void update(Student student) {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                s.setName(student.getName());
                break;
            }
        }
    }

    @Override
    public void delete(long id) {
        students.removeIf(student -> student.getId() == id);
    }

    @Override
    public Student findById(long id) {
        return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }
}
