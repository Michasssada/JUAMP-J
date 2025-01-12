//o ty huju bobże
import  java.util.*;
public class Main {

    color Color = new color();
    save S = new save();
    player Player;
    betterIo io = new betterIo(Player);

    public static void main(String[] args) {
        Main m = new Main();
        m.rMain();
    }
    public void rMain(){//real main
        Player = new player(io);
        if (S.doesSaveExist()){
            System.out.print(Color.BLUE + "witaj w JUAMP-J\n");
            System.out.print(Color.BLUE + "Utwóż swoją postać\n"+Color.RESET);
            Player.conf_player(S, Player);
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
    final String PINK = "\u001B[95m";
}
class betterIo {
    color C = new color();
    Scanner scanner = new Scanner(System.in);
    player P;
    public betterIo(player P){
        this.P = P;
    }
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
    public void outputPlayer(String in){
        if(P.gender){
            System.out.println(C.PINK + in + C.RESET);
        }else {
            System.out.println(C.GREEN + in + C.RESET);
        }
    }

}