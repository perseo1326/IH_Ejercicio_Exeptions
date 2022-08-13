package ejercicioExepciones;

public class ObjetoPerroMaxPelotasRecogidas extends AnimalExeption {

    private Perro unPerro;

    public ObjetoPerroMaxPelotasRecogidas(String message, Perro unPerro) {
        super(message, unPerro);
        this.unPerro = unPerro;
    }

}
