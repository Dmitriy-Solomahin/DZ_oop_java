package DZ3.Classes;

public interface Animal {

    void say();
    void request();
    default void eat(){
        System.out.println("ням ням ням");
    }
    void sleep();
    
}
