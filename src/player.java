public class player {
    betterIo io = new betterIo();
    public String name;
    public boolean gender; //false to chłopak
    public float reputation = 0;
    public float charisma = 0;
    public float politicalReputation = 0;
    public float money = 0;
    public void conf_player(save S){
        io.outputGame("jak chcesz aby twoja postać miała na imie");
        name = io.input();
        io.outputGame("okej twoja postać ma na imię:" + name);
        gender();
        io.outputGame("twożenie save");
        S.create();


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

}
