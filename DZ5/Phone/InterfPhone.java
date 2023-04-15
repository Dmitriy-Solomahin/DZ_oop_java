package DZ5.Phone;

public interface InterfPhone {
    default void  call(String phoneNamber){
        System.out.printf("Номер ", phoneNamber," успешно набран, ожидайте соединения...\n" );
    }
    default void sendSMS(String phoneNamber,String text){
        System.out.printf("На номер", phoneNamber," было отправлено смс с текстом: ", text,"\n");
    }
    void charge();
}
