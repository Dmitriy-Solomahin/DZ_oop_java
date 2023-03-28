package DZ_01;

import dz1_protected.Cat;
import dz1_protected.Man;

public class Dz1_main {
    public static void main(String[] args) {
        // ex1();
        ex2();
    }


    public static void ex1(){
        Family x = new Family("Дмитрий");
        Family y = new Family("Анна");
        Family z = new Family("Коля");
        Family w = new Family("Таня");

        Family Kate = new Family("Катя", x, y);
        Family Miha = new Family("Миша", x, y);

        Kate.wedding(z);
        Miha.wedding(w);

        y.wedding(x);

        Kate.getInfo();

        Frend Daha = new Frend("Дарья");
        Kate.birth(Daha);

        Kate.getInfo();
    }
    
    private static void ex2() {
        Man max = new Man("Max");
        Cat bars = new Cat("Барсик");

        max.buyCat(bars);
        max.sayKsKs();
        max.strokeCat();
        
    }
}