from Phone.Smartphone import Smartphone

class Apple(Smartphone):

    def __init__(self,model:str, sizeDisplay, akb: int, typeOfAntenna:str, osVerion:str, price:int):
        super().__init__(model, sizeDisplay, akb, price, ("iOS " + osVerion) , typeOfAntenna)


    
    def __str__(self) ->str:
        return "Apple " + super().__str__()