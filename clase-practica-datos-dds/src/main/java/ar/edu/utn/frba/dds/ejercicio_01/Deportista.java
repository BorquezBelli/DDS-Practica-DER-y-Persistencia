package ar.edu.utn.frba.dds.ejercicio_01;

import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Motivacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Deportista")
public class Deportista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", columnDefinition = "varchar(50)")
    private String nombre;
    @Column(name = "apellido", columnDefinition = "varchar(50)")
    private String apellido;
    // considero que no es importante para el gimnasio guardar los contactos de sus deportistas
    @Transient
    private List<String> contactos;
    //Mapeo de interfaz stateless
    @Convert(converter = motivacionPrincipalConverter.class)
    @Column(name = "motivacionPrincipal")
    private Motivacion motivacionPrincipal;
    @Column(name = "pesoInicialEnKilos", columnDefinition = "double")
    private Double pesoInicialEnKilos;

    public void agregarContacto(String contacto) {
        contactos.add(contacto);
    }

    public Deportista(){
        this.contactos = new ArrayList<>();
    }

}
