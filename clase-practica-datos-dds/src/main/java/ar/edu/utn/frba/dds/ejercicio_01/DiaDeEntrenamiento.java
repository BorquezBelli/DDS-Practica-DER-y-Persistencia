package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "DiaDeEntrenamiento")
public class DiaDeEntrenamiento {
  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
  private Long id;
  @OneToMany
    @JoinColumn(name = "ejercicio_id", referencedColumnName = "id")
  private List<Ejercicio> ejercicios;
    @Column(name = "numero", columnDefinition = "int")
  private Integer numero; // representa el orden en la duracion de la rutina.
    @OneToOne
        @JoinColumn(name = "siguienteDia_id", referencedColumnName = "id")
  private DiaDeEntrenamiento siguienteDia;

  public DiaDeEntrenamiento() {
    this.ejercicios = new ArrayList<>();
  }
  public void agregarEjercicio(Ejercicio ejercicio) {
    this.ejercicios.add(ejercicio);
  }
}
