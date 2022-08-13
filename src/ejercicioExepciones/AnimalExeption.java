package ejercicioExepciones;

public class AnimalExeption extends Exception {

    private Animal unAnimal;
    public AnimalExeption(String message, Animal unAnimal) {
        super(message);
        this.unAnimal = unAnimal;
    }
}
