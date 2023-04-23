from ShopService.PhoneMag import PhoneMag


class DisplayServis:
    @staticmethod
    def pintePriceList(mag:PhoneMag):
        print(*mag.getPriceList())
        print(mag.getMoney())
