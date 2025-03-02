import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    public static void main(String[] args) {
        byte[] inputData = {0, 0, 0, 10}; 
        try (DataInputStream dis = new DataInputStream(new ByteArrayInputStream(inputData))) {
            System.out.println("Non-Compliant: " + getIntegerNonCompliant(dis));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new ByteArrayInputStream(inputData))) {
            System.out.println("Compliant: " + getInteger(dis));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    public static int getIntegerNonCompliant(DataInputStream is) throws IOException {
        return is.readInt();
    }

    
    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL;
    }
}
