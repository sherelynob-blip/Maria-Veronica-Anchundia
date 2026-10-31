package semana2.finca;

/**
 * Animal de la finca, valorado por su peso en kilogramos.
 * El peso se recibe en la unidad indicada y se guarda siempre en kilogramos.
 */
public record Animal(String codigo, String especie, double pesoKg, double precioPorKg)
        implements Activo {

    public Animal {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        if (especie == null || especie.isBlank()) {
            throw new IllegalArgumentException("La especie no puede estar vacía.");
        }
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("El peso debe ser positivo.");
        }
        if (precioPorKg < 0) {
            throw new IllegalArgumentException("El precio por kilogramo no puede ser negativo.");
        }
    }

    /** Crea un animal a partir de un peso expresado en cualquier unidad de medida. */
    public static Animal conPeso(String codigo, String especie, double peso,
                                 UnidadMedida unidad, double precioPorKg) {
        return new Animal(codigo, especie, unidad.aKilos(peso), precioPorKg);
    }
}
