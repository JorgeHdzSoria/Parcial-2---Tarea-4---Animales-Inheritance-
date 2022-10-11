import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Animal> animals = new LinkedList<>();

        animals.add(new Ave());
            animals.add(new Halcon());
            animals.add(new Aguila());
            animals.add(new Gorrion());
            animals.add(new Condor());

        animals.add(new Mamifero());
            animals.add(new Gato());
            animals.add(new Perro());
            animals.add(new Raton());

        animals.add(new Pez());
            animals.add(new Trucha());
            animals.add(new Salmon());
            animals.add(new Tilapia());
            animals.add(new Sardina());

        for(Animal animal : animals)
        {
            System.out.println(animal.toString());
        }
    }
}