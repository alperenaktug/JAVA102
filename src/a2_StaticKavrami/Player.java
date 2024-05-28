package a2_StaticKavrami;

public class Player {
    public String name;

    public String lastName;
    public int id;

    public static String game = "CSgo";
    public static int count = 0 ;

    public Player (String name , String lastName , int id){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        count++;
    }

    public void login(){
        count++;
    }


}
