package uy.edu.um.proyecto.pruebainicial.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String apellido;

    public Long getId (){
        return id;
    }
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }
    public void setApellido(String nuevoApellido){
        apellido=nuevoApellido;
    }

}
