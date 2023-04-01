package DZ2.Classes;

public class Man {
    private String name;
    private Cat cat;
    private Dog dog;

    public Man(String name){
        this.name = name;
    }

    public void sayKsKs(){
        System.out.println(name + " говорит: Кис Кис Кис");
        cat.invite();
    }

    public void strokeCat(){
        cat.caress();
    }

    public void buyCat(Cat cat) {
        this.cat = cat;
    }

    public void buyDog(Dog dog) {
        this.dog = dog;
    }

    public void callTheDog(){
        System.out.println(name + " говорит: "+ dog.getName() +" комне");
        dog.invite();
    }
}
