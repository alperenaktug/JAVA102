package a9_Interface;

public class Abankasi implements IBanka {
    private String bankaAdi ;
    private String terminalId ;
    private String password;

    public Abankasi(String bankaAdi, String terminalId , String password){
           this.bankaAdi = bankaAdi;
           this.terminalId = terminalId;
           this.password = password;
    }


    @Override
    public boolean  connect(String ipAddress){
        System.out.println(" Kullanıcı ip : " + ipAddress);
        System.out.println(" Makine ip : " + this.hosIpAddress);
        return true;
    }
    @Override
    public boolean payment( double price ,String cardNumber , String date , String cvc){

        System.out.println(" Bankadan cevap bekleniyor !!");
        System.out.println(" İşlem başarılı oldu !! ");
        return true;
    }

    public String getBankaAdi(){
        return this.bankaAdi;
    }
    public void setBankaAdi(String bankaAdi){
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId(){
        return this.terminalId;
    }

    public void setTerminalId(String terminalId){
        this.terminalId = terminalId;
    }

    public String  getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }



















}