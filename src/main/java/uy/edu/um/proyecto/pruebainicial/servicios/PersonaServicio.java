package uy.edu.um.proyecto.pruebainicial.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.edu.um.proyecto.pruebainicial.modelos.Persona;
import uy.edu.um.proyecto.pruebainicial.repositorios.PersonaRepositorio;

@Service
public class PersonaServicio {
    
    private PersonaRepositorio personRepository;

    @Autowired
    public PersonaServicio(PersonaRepositorio personRepository) {
        this.personRepository = personRepository;
    }

    public Persona createPerson(String firstName, String lastName) {
        Persona person = new Persona();
        person.setNombre(firstName);
        person.setApellido(lastName);
        return personRepository.save(person);
    }
}
