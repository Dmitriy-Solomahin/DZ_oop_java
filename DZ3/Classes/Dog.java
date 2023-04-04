package DZ3.Classes;

public abstract class Dog implements Animal{
    private String name;
    private boolean hunger;
    public String getName;

    public Dog(String name){
        this.name = name;
        this.hunger = true;
    }

    protected void invite() {
        if (hunger){
            say();
        }
    }
    
    public void bite(){
        System.out.println("Кусь");
    }

    public String getName(){
        return this.name;
    }
}
