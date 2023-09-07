package uy.edu.um.proyecto.pruebainicial.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="persona")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String apellido;
    private String password;

    

}
