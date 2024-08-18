package com.example.dao;

import com.example.model.Student;

public interface StudentDao {
  void create(Student student);
  Student getStudentById(int id);
}
