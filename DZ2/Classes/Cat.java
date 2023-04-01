package DZ2.Classes;

public abstract class Cat implements Animal {
    private String name;
    private boolean hunger;

    public Cat(String name){
        this.name = name;
        this.hunger = true;
    }

    protected void invite() {
        if (hunger){
            say();
        }
    }

    public void scratch(){
        
    }

    public void caress(){
        System.out.println("мурррррр");
    }
}
