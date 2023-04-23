from ShopService.DisplayServis import DisplayServis
from ShopService.Sell import Sell
from ShopService.Shipment import Shipment
from ShopService.PhoneMag import PhoneMag
from PhoneCompany.Apple import Apple
from Phone.Smartphone import Smartphone
from Phone.Phone import Phone

mag = PhoneMag([],100000.0)
iPhone =  Apple("iPhone 14", 17, 5800, "5g", "14.0", 78000)
phone2 = Smartphone("vsd", 15, 56, 8000,"4g","fylhjbl")
tranz1 = Shipment()

tranz1.changingTheBalance(iPhone, mag)
tranz1.changingTheBalance(phone2, mag)
DisplayServis.pintePriceList(mag)
tranz2 = Sell()
tranz2.changingTheBalance(iPhone, mag)
DisplayServis.pintePriceList(mag)

