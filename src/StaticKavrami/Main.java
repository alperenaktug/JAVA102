package StaticKavrami;

public class Main {
    public static void main(String[] args) {
      /*
        Player p1 = new Player("Talip", "Aktuğ" ,  1);
        p1.login();

        Player p2 = new Player("Mustafa", "Sarıgül" ,  2);
        p2.login();

        System.out.println(Player.count);

        System.out.println(p1.name + p1.lastName + " " + p1.id);
        System.out.println(p2.name + p2.lastName + " " + p2.id);
        System.out.println(p1.game);
        System.out.println(p2.game);
        System.out.println(p1.count);
        System.out.println(p2.count);

       */

        Course mat = new Course ("Matematik " , "MAT-101" , 70);
        Course fizik = new Course("Fizik" , "FZK-101" , 20);
        Course kimya = new Course ("Kimya" , "KMY-101" , 100);

        Course [] dersler = {mat ,fizik , kimya};

        Calculate.calcAvarage(dersler);


    }
}