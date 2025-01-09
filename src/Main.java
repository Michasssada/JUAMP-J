//o ty huju bobże
import  java.util.*;
public class Main {
    Scanner scanner = new Scanner(System.in);
    color Color = new color();
    save S = new save();

    public static void main(String[] args) {
        Main m = new Main();
        m.rMain();
    }
    public void rMain(){//real main
        if(System.getProperty("os.name").toLowerCase().contains("win")){
            S.OS = "win";
        }else if (System.getProperty("os.name").toLowerCase().contains("linux")){
            S.OS = "lin";
        }else{
            S.canSave = false;
            System.out.println(Color.RED+"UWAŻAJ! twój system nie jest wspierany. Możesz grać ale system zapisywania nie będzie działał");
        }


        while(true){
            String nameSurname = scanner.nextLine();
            System.out.println(nameSurname);

        }
    }

}
class color{
    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String GREEN = "\u001B[32m";
    final String YELLOW = "\u001B[33m";
    final String BLUE = "\u001B[34m";
}
class better_io{

}