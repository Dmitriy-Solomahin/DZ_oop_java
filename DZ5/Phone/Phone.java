package DZ5.Phone;

public abstract class Phone  implements InterfPhone{

    private String model;
    private double sizeDisplay;
    private int akb;
    private int price;

    public Phone(String model, double sizeDisplay, int akb, int price) {
        this.model = model;
        this.sizeDisplay = sizeDisplay;
        this.akb = akb;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getSizeDisplay() {
        return sizeDisplay;
    }

    public int getAkb() {
        return akb;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "model=" + this.model + ", sizeDisplay=" + this.sizeDisplay + ", akb=" + this.akb + ", price=" + this.price;
    }
}
