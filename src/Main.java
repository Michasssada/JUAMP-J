//o ty huju bobże
import  java.util.*;
public class Main {

    color Color = new color();
    save S = new save();
    player Player = new player();

    public static void main(String[] args) {
        Main m = new Main();
        m.rMain();
    }
    public void rMain(){//real main
        if(System.getProperty("os.name").toLowerCase().contains("win")){
            S.OS = "win";
        }else if (System.getProperty("os.name").toLowerCase().contains("linux")){
            S.OS = "lin";
        }
        else if (System.getProperty("os.name").toLowerCase().contains("mac")){
            S.OS = "mac";
        }
        System.out.print(Color.BLUE + "witaj w JUAMP-J\n");
        if(S.doesSaveExist()){
            S.load();
        }
        else {
            System.out.println(Color.BLUE + "Utwóż swoją postać"+Color.RESET);
            Player.conf_player(S);
        }


        while(true){


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
class betterIo {
    color C = new color();
    Scanner scanner = new Scanner(System.in);
    public String input(){
        return scanner.nextLine();
    }
    public void output(String in){
        System.out.println(in);
    }
    public void outputErr(String in) {
        System.out.println(C.RED + in + C.RESET);
    }
    public void outputGame(String in){
        System.out.println(C.BLUE + in + C.RESET);
    }

}