package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Rutina")
public class Rutina {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "deportista_id", referencedColumnName = "id")
    private Deportista deportista;
    @OneToMany
    @JoinColumn(name = "diaDeEntrenamiento_id", referencedColumnName = "id")
    private List<DiaDeEntrenamiento> diasDeEntrenamiento;
    @OneToOne
    @JoinColumn(name = "rutinaAnterior_id", referencedColumnName = "id")
    private Rutina rutinaAnterior;

    public Rutina() {
        this.diasDeEntrenamiento = new ArrayList<>();
    }

    public void agregarDiaDeEntrenamiento(DiaDeEntrenamiento diaDeEntrenamiento) {
        this.diasDeEntrenamiento.add(diaDeEntrenamiento);
    }
}
