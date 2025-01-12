import java.io.File;
import java.nio.file.*;
import java.nio.file.Files;
public class save {
    String path;
    public String OS;
    public boolean canSave = true;
    String savePath = System.getProperty("user.home") + "/j-save/save.txt";
    Path filePath = Path.of(savePath);
    player p;
    public void create(player pObj){
        p = pObj;
        if (doesSaveExist()){
            try {
                Files.createDirectories(filePath.getParent());
                Files.createFile(filePath);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void Save(){

    }
    public void load(){

    }
    public boolean doesSaveExist(){
        return !Files.exists(filePath);

    }
    void saveStats(){

    }
    void loadStats(){

    }
}
