import java.io.File;
import java.nio.file.*;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.util.Collections;


public class save {
    String path;
    public String OS;
    public boolean canSave = true;
    String savePath = System.getProperty("user.home") + "/j-save/save.txt";
    Path filePath = Path.of(savePath);
    Path filePathg = Paths.get(savePath);
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
            createLines(filePath,4);
            writeToFile(filePathg,p.name,1);
            writeToFile(filePathg,String.valueOf(p.gender),2);
            writeToFile(filePathg,String.valueOf(p.force),3);
            writeToFile(filePathg,String.valueOf(p.charisma),4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void createLines(Path filePath, int numberOfLines) throws IOException {
        // Write the lines to the file
        Files.write(filePath, Collections.nCopies(numberOfLines, ""));
    }
    void loadStats(){

    }
    void writeToFile(Path filePath, String content, int lineNumber) {
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);

            // Check if the line number is valid
            if (lineNumber < 1 || lineNumber > lines.size()) {
                System.err.println("Invalid line number.");
                return;
            }

            // Replace the specified line with the new content
            lines.set(lineNumber - 1, content);

            // Write all lines back to the file
            Files.write(filePath, lines, StandardCharsets.UTF_8, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

}
