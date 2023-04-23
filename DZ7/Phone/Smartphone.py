from Phone.Phone import Phone


class Smartphone(Phone):
    typeOfAntenna:str
    OS: str

    def __init__(self,model:str, sizeDisplay, akb: int, price,typeOfAntenna:str,os:str):
        super().__init__(model, sizeDisplay, akb, price)
        self.typeOfAntenna = typeOfAntenna
        self.OS = os

    def loginToTheInternet():
        print("вы вошли в интернет, прощайте)")
    
    def downloadApp():
        print("очередная шляпа установлена")

    def getModel(self)->str:
        return super().getModel()

    def getSizeDisplay(self):#-> double:
        return super().getSizeDisplay()

    def getAkb(self) ->int:
        return super().getAkb()

    def getPrice(self):#->double:
        return super().getPrice()

    def setPrice(self, price):
        super().setPrice(price)

    def getTypeOfAntenna(self)->str:
        return self.typeOfAntenna

    def getOS(self)->str:
        return self.OS
    
    def __eq__(self, other) -> bool:
        if not isinstance(other,Smartphone):
            raise TypeError("Операнд справа должен иметь тип Smartphone")
        return super().__eq__(other) and self.typeOfAntenna == other.getTypeOfAntenna() and self.OS == other.getOS()
        

    def __str__(self) -> str:
        return f"[{super().__str__()}, typeOfAntenna={self.typeOfAntenna}, OS={self.OS}]"

    def charge(self):
        print("И снова на зарядку")