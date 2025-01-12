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
    public void conf_player(save S, player playerObj){
        io.outputGame("jak chcesz aby twoja postać miała na imie");
        name = io.input();
        io.outputGame("okej twoja postać ma na imię:" + name);
        gender();
        generateRandomStats();
        io.outputGame("twoje staty, charyzma: "+charisma+"siła: "+force);
        io.outputGame("twożenie save");
        S.create(playerObj);


    }
    void gender(){
        io.outputGame("wybież płeć postaci (b = chłopak g = dziewczyna)");
        String genderBuffer = io.input();
        if(genderBuffer.equals("b")){
            gender = false;
        }else if (genderBuffer.equals("g")){
            gender = true;
        }else {
            io.outputErr("ups chyba źle wprowadziłeś");
            gender();
        }
    }
    void generateRandomStats(){
        charisma = Math.round(random.nextFloat(6));
        if(gender){
            force= Math.round(random.nextFloat(4));
        }else {
            force= Math.round(random.nextFloat(6));
        }
    }

}
