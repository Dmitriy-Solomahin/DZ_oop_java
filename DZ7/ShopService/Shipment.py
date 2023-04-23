
from Phone.Phone import Phone
from ShopService.PhoneMag import PhoneMag
from ShopService.PrintMassage import PrintMassage


class Shipment:
    @staticmethod
    def changingTheBalance( phone:Phone,  mag:PhoneMag):
        priceList = mag.getPriceList()
        if mag.getMoney() >= phone.getPrice():
            mag.setMoney(mag.getMoney()-phone.getPrice())

            phone.setPrice(phone.getPrice()*1.1)
            priceList.append(phone)
            mag.setPriceList(priceList)
        else:
            PrintMassage.printMassage("Недостаточно средств!")
