package com.batucakmak.starter.services;

import com.batucakmak.starter.dto.DtoStudent;
import com.batucakmak.starter.dto.DtoStudentIU;
import com.batucakmak.starter.entities.Student;

import java.util.List;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public DtoStudent updateStudent(Integer id ,DtoStudentIU dtoStudentIU);
}
