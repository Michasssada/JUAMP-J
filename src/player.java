import java.util.Random;

public class player {
    betterIo io = new betterIo();
    Random random = new Random();
    public String name;
    public boolean gender; //false to chłopak
    public float reputation = 0;
    public float charisma = 0;
    public float politicalReputation = 0;
    public float money = 1000;
    public float force;
    public void conf_player(save S){
        io.outputGame("jak chcesz aby twoja postać miała na imie");
        name = io.input();
        io.outputGame("okej twoja postać ma na imię:" + name);
        gender();
        io.outputGame("twożenie save");
        S.create();
        genStartStats();
        System.out.print("charisma:"+charisma+"force:"+force);


    }
    void gender(){
        io.outputGame("wybież płeć postaci (b = chłopak g = dziewczyna, jeśli chcesz się dowiedzieć więcej = info)");
        String genderBuffer = io.input();
        if(genderBuffer.equals("b")){
            gender = false;
        }else if (genderBuffer.equals("g")){
            gender = true;
        }else if(genderBuffer.equals("info")){
            io.outputGame("chłopak: większa szansa zostania pobitym przez sebixa. większa siła początkowa");
            io.outputGame("dziewczyna: mniejsza szansa zostania pobitym przez sebixa. mniejsza siła początkowa");
            gender();
        }
        else{
            io.outputErr("ups chyba źle wprowadziłeś");
            gender();
        }
    }
    void genStartStats(){
        charisma = random.nextFloat(5);
        if (gender)
            force = Math.round(random.nextFloat(3));
        else {
            force = Math.round(random.nextFloat(6));
        }

    }

}
