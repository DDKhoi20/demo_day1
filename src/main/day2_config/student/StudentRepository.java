package student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    void insert(Student student);
    void update(Student student);
    void delete(long id);
    Student findById(long id);
}
