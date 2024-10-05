package com.batucakmak.starter.controller;

import com.batucakmak.starter.dto.DtoStudent;
import com.batucakmak.starter.dto.DtoStudentIU;
import com.batucakmak.starter.entities.Student;

import java.util.List;

public interface IStudentController {
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
    public List<DtoStudent>getAllStudent();

    public DtoStudent getStudentById(Integer id);

    public void deleteStuden(Integer id);

    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);
}
