package a4_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter" , 150);
        Book lordOfTheKings = new Book("LordOfTheKings" ,-150);

       // System.out.println(harryPotter.pageNumber);
       // System.out.println(lordOfTheKings.pageNumber);

        lordOfTheKings.setName("Yaprak Dökümü");
        System.out.println(harryPotter.getName());
        System.out.println(lordOfTheKings.name);

    }
}
