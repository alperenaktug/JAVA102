package a6_Inheritance;

public class Akademisyen extends Calisan  {
    private String bolum;
    private String unvan;
    public Akademisyen (String adSoyad , String telefon  , String eposta , String bolum , String unvan){
        super(adSoyad , telefon , eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum(){
        return this.bolum;
    }
    public void setBolum(String bolum){
        this.bolum = bolum;
    }

    public String getUnvan(){
        return this.unvan;
    }

    public void setUnvan(){
        this.unvan = unvan;
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad() + " derse giriş yaptı !");
    }
}
