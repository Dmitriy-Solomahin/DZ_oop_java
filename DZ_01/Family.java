package DZ_01;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private String name;
    private Family father;
    private Family mother;
    private List<Family> brother;
    private List<Family> sister;
    private Family spouse;
    private List<Family> child;

    public Family(String name) {
        this.name = name;
    }

    public Family(String name, Family father, Family mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void getInfo() {
        String str = "Имя: " + this.name +
                "\nОтец: " + this.father.toString() +
                "\nМать: " + this.mother.toString();
        if (this.spouse != null) {
            str += "\nСупруг|а: " + this.spouse.toString();
        }
        if (this.brother != null) {
            for (int i = 0; i < this.brother.size(); i++) {
                str += "\nбратья: " + this.brother.get(i).toString();
            }
        }
        if (this.sister != null) {
            for (int i = 0; i < this.sister.size(); i++) {
                str += "\nсёстры: " + this.sister.get(i).toString();
            }
        }
        if (this.child != null) {
            for (int i = 0; i < this.child.size(); i++) {
                str += "\nдети: " + this.child.get(i).toString();
            }
        }

        System.out.println(str);
    }

    public void addBrother(Family brother) {
        this.brother.add(brother);
    }

    public void addBrother(Family brother1, Family brother2) {
        this.brother.add(brother1);
        this.brother.add(brother2);
    }

    public void addSister(Family sister) {
        this.sister.add(sister);
    }

    public void addSister(Family sister1, Family sister2) {
        this.sister.add(sister1);
        this.sister.add(sister2);
    }

    public Family getSpouse() {
        return this.spouse;
    }

    public void wedding(Family spouse) {
        this.spouse = spouse;
        if (spouse.getSpouse() == null) {
            spouse.wedding(this);
        }
    }

    public void birth(Family child) {
        if(this.child == null){
            this.child = new ArrayList<>();
        }
        this.child.add(child);
        // this.spouse.birth(child);
    }
}
