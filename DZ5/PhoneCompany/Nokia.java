package DZ5.PhoneCompany;

import DZ5.Phone.Phone;

public class Nokia extends Phone{

    public Nokia(String model, double sizeDisplay, int akb, int price) {
        super(model, sizeDisplay, akb, price);
    }

    

    @Override
    public void charge() {
        System.out.println("Неужели он разрядился");
    }



    @Override
    public String toString() {
        return "Nokia ["+super.toString()+"]";
    }

    
}
