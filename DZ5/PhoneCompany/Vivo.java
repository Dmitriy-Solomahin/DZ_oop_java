package DZ5.PhoneCompany;

import DZ5.Phone.Smartphone;

public class Vivo extends Smartphone{

    public Vivo(String model, double sizeDisplay, int akb, String typeOfAntenna, String osVerion, int price) {
		super(model, sizeDisplay, akb, price, ("Android " + osVerion) , typeOfAntenna);
    }

    @Override
    public String toString() {
        return "Vivo "+super.toString();
    }
    
} 
