package DZ5;

import DZ5.PhoneCompany.Apple;

public class Main {
    public static void main(String[] args) {
        PhoneMag mag = new PhoneMag();
        Apple iPhone = new Apple("iPhone 14", 17, 5800, "5g", "14.0", 78000);
        Transaction<Apple> tranz1 = new Transaction<Apple>(iPhone, mag);
        tranz1.receipts();
        mag.pintePriceList();
        tranz1.sell();
        mag.pintePriceList();
    }
}
