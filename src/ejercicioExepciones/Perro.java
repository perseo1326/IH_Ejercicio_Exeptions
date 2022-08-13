package ejercicioExepciones;

public class Perro extends Animal implements Jugable {
    private static final int MAX_VECES_RECOGER_PELOTA = 2;
    private int pelotasRecogidas;

    public Perro(String nombre) {
        super(nombre);
        this.pelotasRecogidas = 0;
    }

    public int getPelotasRecogidas() {
        return pelotasRecogidas;
    }

    public void recogerPelota() throws ObjetoPerroMaxPelotasRecogidas {
        if (this.pelotasRecogidas >= Perro.MAX_VECES_RECOGER_PELOTA ) {
            throw new ObjetoPerroMaxPelotasRecogidas("Fiel amig@ ... Te quiero mucho, pero necesito un descanso! Gracias", this );
        }
        this.pelotasRecogidas++;
    }

    @Override
    public void hablar() throws ObjetoPerroMaxPelotasRecogidas {
        if (this.pelotasRecogidas > Perro.MAX_VECES_RECOGER_PELOTA ) {
            throw new ObjetoPerroMaxPelotasRecogidas("Estoy muy cansado para poder hablar! :-( ", this);
        }

        System.out.println("Guau!! guau!! Soy adorable. Me llamo "
                + this.getNombre() + " y he recogido " + this.getPelotasRecogidas() + " pelotas!");
    }

    @Override
    public void jugar() throws ObjetoPerroMaxPelotasRecogidas {
        try {
            recogerPelota();
            System.out.println("Estoy jugando!!");
        }
        catch (ObjetoPerroMaxPelotasRecogidas perroMaxPelotas) {
            System.out.println("Exception en 'jugar()'=> " + perroMaxPelotas.getMessage());
            throw new ejercicioExepciones.ObjetoPerroMaxPelotasRecogidas("Otra Exeption ", this);
            // throw new AnimalExeption("Otra Exeption ", this);
        }
    }
}
