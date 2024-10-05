package com.batucakmak.starter.controller.impl;

import com.batucakmak.starter.controller.IStudentController;
import com.batucakmak.starter.dto.DtoStudent;
import com.batucakmak.starter.dto.DtoStudentIU;
import com.batucakmak.starter.entities.Student;
import com.batucakmak.starter.services.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")

public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public DtoStudent saveStudent(@RequestBody @Valid DtoStudentIU dtoStudentIU) {
        return studentService.saveStudent(dtoStudentIU);
    }

    @GetMapping(path = "/list")
    @Override
    public List<DtoStudent> getAllStudent() {
        return studentService.getAllStudents();

    }

    @Override
    @GetMapping(path = "/list/{id}")
    public DtoStudent getStudentById(@PathVariable(name = "id") Integer id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteStuden(@PathVariable(name = "id") Integer id) {
        studentService.deleteStudent(id);

    }

    @Override
    @PutMapping(path = "/update/{id}")
    public DtoStudent updateStudent(@PathVariable(name = "id") Integer id,@RequestBody DtoStudentIU dtoStudentIU) {
        return studentService.updateStudent(id,dtoStudentIU);
    }
}
