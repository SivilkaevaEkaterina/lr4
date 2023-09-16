package com.example.lr4.dao;

import com.example.lr4.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO {
    List<Student> getAllStudents();

    Student saveStudent (Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}