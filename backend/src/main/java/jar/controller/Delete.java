package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jar.repo.StudentRepo;
import jar.services.Dservice;

@RestController
public class Delete {
  
    @Autowired
    Dservice obj;
    
    @DeleteMapping("/delete/{id}")
    public Map<Object, Object> deleteStudent(@PathVariable long id) {
       
       return obj.ds(id);
    }
}
