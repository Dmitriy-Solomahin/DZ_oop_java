package DZ2.Classes;

public class Husky extends Dog{

    public Husky(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Гаф");
    }

    @Override
    public void request() {
        System.out.println("Гаф ввввВаф");
    }

    @Override
    public void eat() {
        System.out.println("чафк чафк ");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZ ZZZZ ваф ZZZ");
    }
    
}
