package com.manisha.studentmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.manisha.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
