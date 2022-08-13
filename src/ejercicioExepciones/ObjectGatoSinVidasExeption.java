package ejercicioExepciones;

public class ObjectGatoSinVidasExeption extends AnimalExeption {

    private Gato unGato;


    public ObjectGatoSinVidasExeption(String message, Gato unGato) {
        super(message, unGato);
        this.unGato = unGato;
    }

    public Gato getUnGato() {
        return unGato;
    }
}
