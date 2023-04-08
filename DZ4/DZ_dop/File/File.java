package DZ4.DZ_dop.File;

import DZ4.DZ_dop.Acaunt;
import DZ4.DZ_dop.Task;

public abstract class File {
    private String name;
    private String text;

    public String getName() {
        return name;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public abstract void addToFile(Acaunt user, Task task);
    public abstract void deleteInFile(Acaunt user, String delText);
    public abstract String readFile(Acaunt user);
}
