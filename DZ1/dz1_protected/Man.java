package dz1_protected;

public class Man {
    private String name;
    private Cat cat;

    public Man(String name){
        this.name = name;
    }

    public void sayKsKs(){
        System.out.println("Кис Кис Кис");
        cat.invite();
    }

    public void strokeCat(){
        cat.stroke();
    }

    public void buyCat(Cat cat) {
        this.cat = cat;
    }
}
