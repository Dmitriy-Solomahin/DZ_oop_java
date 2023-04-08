package DZ4.DZ_dop.File;

import DZ4.DZ_dop.Acaunt;
import DZ4.DZ_dop.Task;

public class CsvFile extends File{

    private String name;

    public CsvFile(String name) {
        this.name = name;
    }

    @Override
    public void deleteInFile(Acaunt user, String delText) {
        
    }

    @Override
    public void addToFile(Acaunt user, Task task) {
        
    }

    @Override
    public String readFile(Acaunt user) {
        String text = "";
        return text;
    }
    
}
