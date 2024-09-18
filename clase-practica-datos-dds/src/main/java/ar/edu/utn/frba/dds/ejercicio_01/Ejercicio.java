package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table
@Entity(name = "Ejercicio")
public class Ejercicio {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", columnDefinition = "varchar(50)")
    private String nombre;
    @Column(name = "detalle", columnDefinition = "varchar(50)")
    private String detalle;
}
