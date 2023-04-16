package DZ5_DZ6.Phone;

public abstract class Phone  implements InterfCarge, InterfCall, InterfSendSMS {

    private String model;
    private double sizeDisplay;
    private int akb;
    private double price;

    public Phone(String model, double sizeDisplay, int akb, double price) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "model=" + this.model + ", sizeDisplay=" + this.sizeDisplay + ", akb=" + this.akb + ", price=" + this.price;
    }

    @Override
    public void charge(){
        //
    }
}
