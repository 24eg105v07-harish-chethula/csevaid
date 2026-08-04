package jar.controller;

import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;
import jar.repo.StudentRepo;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Update {

    @Autowired
    StudentRepo db;

    @PutMapping("/api/{id}")
    public String putMethodName(@PathVariable long id, @RequestBody Student dto) {
        Student d=db.findById(id).orElse(null);

        d.setName(dto.getName());
        d.setEmail(dto.getEmail());
        d.setIp(dto.getIp());

        db.save(d);
        
        return "Student updated successfully";
    }
}
