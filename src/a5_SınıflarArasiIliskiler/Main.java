package a5_SınıflarArasiIliskiler;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Alperen" , "Aktuğ" , "123" , "AA" , 85);
        Student st2 = new Student("Enes" , "Demirel" , "456" , "BB" , 85);
        Student st3 = new Student("Talip" , "Aktuğ" , "789" , "CC" , 85);
      //  st2.setNote(100);
      //  System.out.println(st2.getNote());

        Course mat = new Course("MAT101" , "MAT");
        Student[] stu = {st1 ,st2 ,st3};

        System.out.println("Ortalamanız : " + mat.calcAvarage(stu));


    }
}
