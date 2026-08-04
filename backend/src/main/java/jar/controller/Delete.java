package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jar.repo.StudentRepo;

@RestController
public class Delete {
    @Autowired
    StudentRepo db;

    @DeleteMapping("/delete/{id}")
    public Map<Object, Object> deleteStudent(@PathVariable long id) {

        Map<Object, Object> res = new HashMap<>();

        if (db.existsById(id)) {
            db.deleteById(id);

            res.put("msg", "Student Deleted Successfully");
            res.put("status", 204);

        } else {

            res.put("msg", "Student Not Found");
            res.put("status", 404);
        }

        return res;
    }
}
