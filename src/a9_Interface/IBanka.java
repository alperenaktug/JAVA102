package a9_Interface;

public interface IBanka {

    final  String hosIpAddress = "127.0.0.1";
    boolean connect(String ipAddress);
   boolean payment( double price ,String cardNumber , String date , String cvc);

}
