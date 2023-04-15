package DZ5;

import java.util.ArrayList;
import DZ5.Phone.Phone;

public class Transaction<T extends Phone> {

    private T phone;
    private PhoneMag mag;
    
    

    public Transaction(T phone, PhoneMag mag) {
        this.phone = phone;
        this.mag = mag;
    }

    public void receipts(){
        ArrayList<Phone> priceList = new ArrayList<>();
        priceList = mag.getPriceList();
        priceList.add(phone);
        mag.setPriceList(priceList);
    }

    public void sell(){
        ArrayList<Phone> priceList = mag.getPriceList();
        for (Phone phoneL : priceList) {
            if (phoneL.equals(phone)){
                priceList.remove(phoneL);
                break;
            }
        }
        mag.setPriceList(priceList);
    }
}
