package a4_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter" , 150);
        Book lordOfTheKings = new Book("LordOfTheKings" ,-150);

       // System.out.println(harryPotter.pageNumber);
       // System.out.println(lordOfTheKings.pageNumber);

        lordOfTheKings.setName("Yaprak Dökümü"); // set le ismini değiştirdik.
        System.out.println(harryPotter.getName()); // get ile ism getirdik.
        System.out.println(lordOfTheKings.getName());


    }
}
