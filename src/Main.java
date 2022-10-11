import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new LinkedList<>();

        animals.add(new Aguila());

        animals.add(new Trucha());
        animals.add(new Tilapia());
        animals.add(new Salmon());
        animals.add(new Condor());
        animals.add(new Sardina());
        animals.add(new Halcon());
        animals.add(new Gorrion());
        animals.add(new Raton());
        animals.add(new Perro());
        animals.add(new Gato());
        animals.add(new Tortuga());
        animals.add(new Pato());

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

    public static void Voladores(List<AnimalQueVuela> volador) {
        for (AnimalQueVuela animal : volador) {
            animal.vuela();
        }
    }

    public static void Caminadores(List<AnimalQueCamina> caminador) {
        for (AnimalQueCamina animal : caminador) {
            animal.camina();
        }
    }

    public static void Nadadores(List<AnimalQueNada> nadador) {
        for (AnimalQueNada animal : nadador) {
            animal.nada();
        }
    }
}