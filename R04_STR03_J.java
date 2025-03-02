import java.math.BigInteger;

public class R04_STR03_J {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("530500452766");

        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
        System.out.println("Non-Compliant BigInteger: " + x);

        String validString = x.toString();
        BigInteger validX = new BigInteger(validString);
        System.out.println("Compliant BigInteger: " + validX);
    }
}
