package DZ3.Classes;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Миу");
    }

    @Override
    public void request() {
        System.out.println("Миу мрр мрр");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzz");
    }

    @Override
    public void scratch() {
        System.out.println("царап царап");
    }
    
}
