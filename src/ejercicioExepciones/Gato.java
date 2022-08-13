package ejercicioExepciones;

public class Gato extends Animal implements Acariciable {

    private static int VIDAS_GATO = 1;
    private int vidas;

    public Gato(String nombre) {
        super(nombre);
        this.vidas = VIDAS_GATO;
    }

    public int getVidas() {
        return vidas;
    }

    public void caidaLibre() throws ObjectGatoSinVidasExeption {
        if (this.vidas <= 0) {
            throw new ObjectGatoSinVidasExeption("Meditando hacia la siguiente encarnación :)", this);
        }
        this.vidas--;
    }

    @Override
    public void hablar() throws ObjectGatoSinVidasExeption {
        if (vidas <= 0) {
            throw new ObjectGatoSinVidasExeption("Silencio, por favor... estoy meditando ;-)", this );
        }

        System.out.println("Miau!! miau!! Hola me llamo "
                + this.getNombre() + " y soy un/a gat@ feliz. Me quedan "
                + this.vidas + " vidas.");
    }

    @Override
    public void acariciar() {
        System.out.println("Me encanta que me acaricien!!! Muchas gracias :)");
    }
}
