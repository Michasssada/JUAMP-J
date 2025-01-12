import java.io.File;
import java.nio.file.*;
import java.nio.file.Files;
import java.io.IOException;
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
        saveStats();
    }
    public void Save(){

    }
    public void load(){

    }
    public boolean doesSaveExist(){
        return !Files.exists(filePath);

    }
    void saveStats(){
        //first line is name second is gender third is force fourth is charisma
        try {
            Files.writeString(filePath,p.name+"\n");
            Files.writeString(filePath,String.valueOf(p.gender), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void loadStats(){

    }
}
