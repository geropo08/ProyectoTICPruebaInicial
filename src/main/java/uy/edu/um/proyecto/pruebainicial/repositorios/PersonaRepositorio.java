package uy.edu.um.proyecto.pruebainicial.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import uy.edu.um.proyecto.pruebainicial.modelos.Persona;

public interface PersonaRepositorio extends JpaRepository<Persona,Long>{
    
}

