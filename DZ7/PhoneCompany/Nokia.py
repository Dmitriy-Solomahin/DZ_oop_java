from Phone.Phone import Phone

class Nokia(Phone):
    
    def __init__(self, model:str,sizeDisplay,akb:int,price:int):
        super().__init__(model, sizeDisplay, akb, price)

    def __str__(self)->str:
        return f"Nokia [{super().__str__()}]"
