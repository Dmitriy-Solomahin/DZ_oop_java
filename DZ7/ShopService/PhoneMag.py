from Phone.Phone import Phone

class PhoneMag:

    priceList:list[Phone]
    money:int #double
    

    def __init__(self,priceList = [], money = 0.0):
        self.money = money
        self.priceList = priceList

    def getPriceList(self)->list[Phone]:
        return self.priceList


    def setPriceList(self, priceList:list[Phone]):
        self.priceList = priceList

    def getMoney(self): #double
        return self.money

    def setMoney(self, money):
        self.money = money
