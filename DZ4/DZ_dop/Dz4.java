package DZ4.DZ_dop;

public class Dz4 {
//       Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.

//       Например:
//       определить уровень приоритетов: низкий, средний, немедленное выполнение
//       выделить компоненту для хранения данных
//       выделить компоненту для организации импорта\экспорта данных
//       Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора,
//       данные хранятся в файле csv/jsom/xml
//       другие компоненты

    public static void main(String[] args) {
        Menu menu = new Menu();
        Acaunt user = menu.authorization();
        menu.fileSelection();
        while (true){
            int num = menu.printMenu();
            if (num == 4){
                break;
            }
            menu.workMenu(num,user);
        }
    }


}
