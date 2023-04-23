from Phone.Smartphone import Smartphone;

class Huawei(Smartphone):
    def __init__(self,model:str, sizeDisplay, akb: int, typeOfAntenna:str, osVerion:str, price:int):
        super().__init__(model, sizeDisplay, akb, price, ("Android " + osVerion) , typeOfAntenna)

    def __str__(self) ->str:
        return "Huawei " + super().__str__()
