class InterfSendSMS:
    @staticmethod
    def sendSMS(phoneNamber:str, text:str):
        print(f"На номер {phoneNamber} было отправлено смс с текстом: {text}")