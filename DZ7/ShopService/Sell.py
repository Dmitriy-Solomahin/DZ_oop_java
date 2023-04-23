from Phone.Phone import Phone
from ShopService.PhoneMag import PhoneMag


class Sell:
    @staticmethod
    def changingTheBalance(other_phone:Phone, mag:PhoneMag):
        priceList = mag.getPriceList()
        for phone in priceList:
            if phone == other_phone:
                priceList.remove(phone)
                mag.setPriceList(priceList)
                mag.setMoney(mag.getMoney()+other_phone.getPrice())
                break;        