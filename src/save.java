import java.io.File;
import java.nio.file.*;

public class save {
    String path;
    public String OS;
    public boolean canSave = true;
    String savePath = System.getProperty("user.home") + "/juamp-j/save.txt";
    Path filePath = Path.of(savePath);
    File file = new File(savePath);
    player p;
    public void create(player pObj){
        p = pObj;
        if (doesSaveExist()){
            try {
                file.createNewFile();
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
