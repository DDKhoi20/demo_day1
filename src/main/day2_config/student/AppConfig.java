package student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean
    public StudentRepository studentRepository() {
        return new StudentRepositoryImpl();
    }

    @Bean
    public StudentService studentService() {
        StudentService studentService = new StudentService();
        studentService.setStudentRepository(studentRepository());
        return studentService;
    }
}
