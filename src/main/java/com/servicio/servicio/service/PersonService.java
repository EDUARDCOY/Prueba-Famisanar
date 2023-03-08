
package com.servicio.servicio.service;

import com.servicio.servicio.entity.Person;
import com.servicio.servicio.repo.PersonRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService{
    
    @Autowired
    private PersonRepo personrepo;
    
    public Person insetar(Person per){
        return personrepo.save(per);
    }
    public Person actualizar(Person per){
        return personrepo.save(per);
    }
    public List<Person> listar(){
        return personrepo.findAll();
    }
    public void eliminar(Person per){
        personrepo.delete(per);
    }
}
