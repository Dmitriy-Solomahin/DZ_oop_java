package DZ5_DZ6.PhoneCompany;

import DZ5_DZ6.Phone.Smartphone;

public class Huawei extends Smartphone{

    public Huawei(String model, double sizeDisplay, int akb, String typeOfAntenna, String osVerion, int price) {
		super(model, sizeDisplay, akb, price, ("Android " + osVerion) , typeOfAntenna);
    }

    @Override
    public String toString() {
        return "Huawei "+ super.toString();
    }
    
}
