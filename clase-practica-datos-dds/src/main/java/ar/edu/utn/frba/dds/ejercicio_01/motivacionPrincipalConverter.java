package ar.edu.utn.frba.dds.ejercicio_01;

import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.BajarDePeso;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Mantener;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Motivacion;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Tonificar;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class motivacionPrincipalConverter implements AttributeConverter<Motivacion, String> {

    @Override
    public String convertToDatabaseColumn(Motivacion motivacion) {
        if (motivacion instanceof BajarDePeso) {
            return "BajarDePeso";
        } else if (motivacion instanceof Mantener) {
            return "Mantener";
        } else if (motivacion instanceof Tonificar) {
            return "Tonificar";
        }
        return null;
    }

    @Override
    public Motivacion convertToEntityAttribute(String dbData) {
        if ("BajarDePeso".equals(dbData)) {
            return new BajarDePeso();
        } else if ("Mantener".equals(dbData)) {
            return new Mantener();
        } else if ("Tonificar".equals(dbData)) {
            return new Tonificar();
        }
        return null;
    }
}
