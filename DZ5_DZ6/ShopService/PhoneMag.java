package DZ5_DZ6.ShopService;

import java.util.ArrayList;

import DZ5_DZ6.Phone.Phone;


public class PhoneMag  {

    private ArrayList<Phone> priceList;
    private double money;
    

    public PhoneMag(double money) {
        this.money = money;
        this.priceList = new ArrayList<Phone>();
    }

    public PhoneMag(ArrayList<Phone> priceList) {
        this.priceList = priceList;
        this.money = 0.0;
    }

    public PhoneMag(ArrayList<Phone> priceList, double money) {
        this.priceList = priceList;
        this.money = money;
    }

    public ArrayList<Phone> getPriceList() {
        return this.priceList;
    }

    public void setPriceList(ArrayList<Phone> priceList) {
        this.priceList = priceList;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
