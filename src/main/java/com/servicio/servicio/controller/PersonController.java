
package com.servicio.servicio.controller;

import com.servicio.servicio.entity.Person;
import com.servicio.servicio.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persons")
public class PersonController {
    @Autowired
    private PersonService personservice;
    
    @GetMapping
    public List<Person> listar(){
        return personservice.listar();
    }
    
    @PostMapping
    public Person insertar(@RequestBody Person per){
        return personservice.insetar(per);
    }
    
    @PutMapping
    public Person actualizar(@RequestBody Person per){
        return personservice.actualizar(per);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Person per){
        personservice.eliminar(per);
    }
    
}
