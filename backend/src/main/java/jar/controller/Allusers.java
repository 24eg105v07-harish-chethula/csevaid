package jar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;
import jar.repo.StudentRepo;

@RestController
public class Allusers {

    @Autowired
    StudentRepo db;

    @GetMapping("/api/all")
    List<Student> f() {
        return db.findAll();
    }

}
