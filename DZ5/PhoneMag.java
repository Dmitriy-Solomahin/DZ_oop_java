package DZ5;

import java.util.ArrayList;
import DZ5.Phone.Phone;


public class PhoneMag  {

    private ArrayList<Phone> priceList;

    

    public PhoneMag() {
        this.priceList = new ArrayList<Phone>();
    }

    public PhoneMag(ArrayList<Phone> priceList) {
        this.priceList = priceList;
    }

    public ArrayList<Phone> getPriceList() {
        return this.priceList;
    }

    public void setPriceList(ArrayList<Phone> priceList) {
        this.priceList = priceList;
    }

    public void pintePriceList(){
        System.out.println(priceList);
    }
}
