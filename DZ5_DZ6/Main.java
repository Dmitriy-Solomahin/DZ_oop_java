package DZ5_DZ6;

import DZ5_DZ6.PhoneCompany.Apple;
import DZ5_DZ6.ShopService.DisplayServis;
import DZ5_DZ6.ShopService.PhoneMag;
import DZ5_DZ6.ShopService.Sell;
import DZ5_DZ6.ShopService.Shipment;

public class Main {
    public static void main(String[] args) {
        PhoneMag mag = new PhoneMag(100000.0);
        Apple iPhone = new Apple("iPhone 14", 17, 5800, "5g", "14.0", 78000);
        Shipment tranz1 = new Shipment();
        
        tranz1.changingTheBalance(iPhone, mag);
        DisplayServis.pintePriceList(mag);
        Sell tranz2 = new Sell();
        tranz2.changingTheBalance(iPhone, mag);
        DisplayServis.pintePriceList(mag);
    }
}
