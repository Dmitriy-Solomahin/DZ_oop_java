from Phone.Phone import Phone

class Denzel (Phone):

    def __init__(self, model:str,sizeDisplay,akb:int,price:int):
        super().__init__(model, sizeDisplay, akb, price)

    def charge(self):
        print("опять эта рухлядь разрядилась")

    def __str__(self)->str:
        return f"Denzel [{super().__str__()}]"