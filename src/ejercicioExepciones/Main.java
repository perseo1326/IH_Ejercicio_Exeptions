package ejercicioExepciones;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {

            Perro luna = new Perro("Luna");
            luna.jugar();
            luna.jugar();
            luna.jugar();
            luna.jugar();

            Gato max = new Gato("Max");

            max.caidaLibre();
            max.acariciar();

            ArrayList<Animal> animalArrayList = new ArrayList<>();

            animalArrayList.add(luna);
            animalArrayList.add(max);


            for (Animal animal : animalArrayList) {
                animal.hablar();
            }
        }

        catch (ObjectGatoSinVidasExeption gatoSinVidasExeption) {
            System.out.println("Exeption ejercicioExepciones.Gato sin vidas => " + gatoSinVidasExeption.getMessage());
        }
    /*
        catch (ObjetoPerroMaxPelotasRecogidas perroMaxPelotas) {
            System.out.println(perroMaxPelotas.getMessage());
        }
    */
        catch (AnimalExeption e) {
            System.out.println("Exeption en Main de tipo 'AnimalExeption: " + e.getMessage());
//             throw new RuntimeException(e);
        }

        System.out.println("Final del programa");
    }
}