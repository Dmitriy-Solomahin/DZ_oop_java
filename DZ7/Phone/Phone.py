from Phone.InterfCall import InterfCall
from Phone.InterfSendSMS import InterfSendSMS


class Phone(InterfCall,InterfSendSMS):
    
    __model: str
    __sizeDisplay: int#double
    __akb:int
    __price: int#double

    def __init__(self, model:str, sizeDisplay, akb:int, price):
        self.__model = model
        self.__sizeDisplay = sizeDisplay
        self.__akb = akb
        self.__price = price
        # super().__init__()
    
    def  getModel(self) ->str:
        return self.__model

    def getSizeDisplay(self):#-> double :
        return self.__sizeDisplay

    def getAkb(self)->int:
        return self.__akb

    def getPrice(self):# -> double:
        return self.__price

    def setPrice(self, price):
        self.__price = price   

    def __eq__(self, other) -> bool:
        if not isinstance(other,Phone):
            raise TypeError("Операнд справа должен иметь тип Phone")
        return self.__model == other.getModel() and self.__sizeDisplay == other.getSizeDisplay() and self.__akb == other.getAkb()

    def __str__(self) -> str:
        return f"model={self.__model}, sizeDisplay={self.__sizeDisplay}, akb={self.__akb}, price={self.__price}"

    def charge(self):
        print("Неужели он разрядился")
