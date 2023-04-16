package DZ5_DZ6.PhoneCompany;

import DZ5_DZ6.Phone.Smartphone;

public class Xiomi extends Smartphone{

    public Xiomi(String model, double sizeDisplay, int akb, String typeOfAntenna, String osVerion, int price) {
		super(model, sizeDisplay, akb, price, ("Android " + osVerion) , typeOfAntenna);
    }

    @Override
    public String toString() {
        return "Xiomi "+ super.toString();
    }
}
