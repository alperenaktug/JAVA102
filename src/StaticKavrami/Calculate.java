package StaticKavrami;

public class Calculate {

    public static void calcAvarage(Course [] notes){
        double total = 0;

        for (Course c : notes){
            total+= c.note;
        }

        double average = total / notes.length;
        System.out.println("Ortalaanız : " + average );
    }

}
