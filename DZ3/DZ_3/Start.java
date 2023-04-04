package DZ3.DZ_3;

import DZ3.Classes.Husky;
import DZ3.Classes.MaineCoon;
import DZ3.Classes.Man;
import DZ3.Classes.Siamese;

public class Start {
    public static void main(String[] args) {
        Man max = new Man("Maks");
        MaineCoon bars = new MaineCoon("Барсик");

        Man tom = new Man("Том");
        Siamese musy = new Siamese("Муся");
        Husky haska = new Husky("Дружок");


        max.buyCat(bars);
        max.sayKsKs();
        max.strokeCat();
    
        tom.buyCat(musy);
        tom.sayKsKs();
        tom.strokeCat();
        
        tom.buyDog(haska);
        tom.callTheDog();



    }
}
