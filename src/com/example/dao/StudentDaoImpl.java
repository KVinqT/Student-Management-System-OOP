package com.example.dao;

import com.example.model.Student;

public class StudentDaoImpl implements StudentDao {
  	private static Student[] studentsList = new Student[Student.maxStudentCount];

    public static Student[] getStudentsList(){
      return studentsList;
    }

    @Override
    public void create(Student student) {
      studentsList[Student.getStudentCount() -1] = student;
    }

    @Override
    public Student getStudentById(int id){
      for(int i =0; i<Student.getStudentCount(); i++){
        if(studentsList[i].getId()==id){
          return studentsList[i];
        }
      }
      return null;
    }


}
