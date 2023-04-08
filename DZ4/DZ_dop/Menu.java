package DZ4.DZ_dop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import DZ4.DZ_dop.File.CsvFile;
import DZ4.DZ_dop.File.File;
import DZ4.DZ_dop.File.JsonFile;
import DZ4.DZ_dop.File.XmlFile;


public class Menu {
    private Scanner in = new Scanner(System.in);
    private File file  ;

    public Menu(){
        //
    }

    public Integer printMenu() {
        System.out.println("Меню:");
        System.out.println("1. Распечатать все задачи");
        System.out.println("2. Добавить в задачу");
        System.out.println("3. Удалить задачу");
        System.out.println("4. Выход");
        System.out.print("Введите номер операции: ");
        int num = 0;
        try {
            num = in.nextInt();
        } catch (Exception e) {
            System.out.println("Неверный ввод");
        }
        return num;
        
    }

    public void workMenu(int num, Acaunt user) {
        switch(num){
            case 1:
                System.out.println(file.readFile(user));
                break;
            case 2:
                file.addToFile(user, enteringTask() );
                break;
            case 3:
                file.deleteInFile(user, recordSearch() );
                break;
        }
    }

    private String recordSearch() {
        System.out.println("Введите строку для поиска:");
        String str = in.next();
        return str;
    }

    private Task enteringTask() {
        System.out.println("Введите текст задачи:");
        String str = in.next();
        System.out.println("Введите дату дэдлайна:");
        String data = in.next();
        String[] s = data.split(".");
        ArrayList<Integer> arrayData = new ArrayList<>();
        for (int index = 0; index < s.length; index++) {
            arrayData.add(index, Integer.parseInt(s[index]));
        }
        System.out.println("Введите время дэдлайна:");
        String time = in.next();
        String[] c = time.split(".");
        ArrayList<Integer> arrayTime = new ArrayList<>();
        for (int index = 0; index < c.length; index++) {
            arrayTime.add(index, Integer.parseInt(c[index]));
        }
        Map<String,ArrayList<Integer>> deadline = new HashMap<String,ArrayList<Integer>>();
        deadline.put("data", arrayData);
        deadline.put("time", arrayTime);
        Task task = new Task(str, deadline);
        return task;
    }

    public void fileSelection(){
        System.out.println("Введите имя файла:");
        String name = in.next();
        while(true){
            Boolean flag = false;
            System.out.println("Введите расширение файла(XML,JSON,CSV):");
            String expansion = (in.next()).toLowerCase();
            switch(expansion){
                case "xml":
                    file = new XmlFile(name);
                    flag = true;
                    break;
                case "csv":
                    file = new CsvFile(name);
                    flag = true;
                    break;
                case "json":
                    file = new JsonFile(name);
                    flag = true;
                    break;
            }
            if (flag){
                break;
            }
            System.out.println("неверный ввод");
        }

    }

    public Acaunt authorization() {

        System.out.println("Введите имя:");
        String name = in.next();
        System.out.println("Введите Фамилию:");
        String surName = in.next();
        System.out.println("Введите Отчество:");
        String patronymic = in.next();

        Acaunt user = new Acaunt(name,surName,patronymic);

        return user;
    }
    
}
