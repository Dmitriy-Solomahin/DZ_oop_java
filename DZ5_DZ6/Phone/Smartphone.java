package DZ5_DZ6.Phone;

public abstract class Smartphone extends Phone{
    private String typeOfAntenna;
    private String OS;

    

    public Smartphone(String model, double sizeDisplay, int akb, double price, String typeOfAntenna, String oS) {
        super(model, sizeDisplay, akb, price);
        this.typeOfAntenna = typeOfAntenna;
        this.OS = oS;
    }

    public void loginToTheInternet(){
        System.out.println("вы вошли в интернет, прощайте)");
    }
    
    public void downloadApp(){
        System.out.println("очередная шляпа установлена");
    }



    public String getModel() {
        return super.getModel();
    }



    public double getSizeDisplay() {
        return super.getSizeDisplay();
    }



    public int getAkb() {
        return super.getAkb();
    }



    public double getPrice() {
        return super.getPrice();
    }


    public void setPrice(double price) {
        super.setPrice(price);
    }



    public String getTypeOfAntenna() {
        return typeOfAntenna;
    }



    public String getOS() {
        return OS;
    }

    @Override
    public String toString() {
        return "[" + super.toString() + 
                ", typeOfAntenna=" + typeOfAntenna + ", OS=" + OS + "]";
    }

    @Override
    public void charge() {
        System.out.println("И снова на зарядку");
    }


}
