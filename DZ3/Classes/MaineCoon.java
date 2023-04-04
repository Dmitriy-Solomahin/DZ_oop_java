package DZ3.Classes;

public class MaineCoon extends Cat{

    public MaineCoon(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("ММЯЯУУ");
    }

    @Override
    public void request() {
        System.out.println("МЯУ МЯУ МЯУ");
    }

    @Override
    public void eat() {
        System.out.println("Омномном");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZZ");
    }

    @Override
    public void scratch() {
        System.out.println("Шорк Шорк");
    }
    
}
