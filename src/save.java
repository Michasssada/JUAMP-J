import java.nio.file.*;

public class save {
    String path;
    public String OS;
    public boolean canSave = true;
    String savePath = System.getProperty("user.home") + "/juamp-j/save.txt";
    Path filePath = Paths.get(savePath);
    player p;
    public void create(player pObj){
        p = pObj;
        if (doesSaveExist()){

        }
    }
    public void Save(){

    }
    public void load(){

    }
    public boolean doesSaveExist(){
        if (Files.exists(filePath)){
            return true;
        }
        else {
            return false;
        }

    }
    void saveStats(){

    }
    void loadStats(){

    }
}
