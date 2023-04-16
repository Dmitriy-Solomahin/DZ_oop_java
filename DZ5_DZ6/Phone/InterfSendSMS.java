package DZ5_DZ6.Phone;

public interface InterfSendSMS {
    
    default void sendSMS(String phoneNamber,String text){
        System.out.printf("На номер", phoneNamber," было отправлено смс с текстом: ", text,"\n");
    }
}
