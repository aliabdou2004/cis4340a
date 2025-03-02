import java.io.File;

public class R02_XP00_J {
    public static void main(String[] args) {
        deleteFile("samplefile.txt");
    }

    
    public static void deleteFileNonCompliant(String samplefile) {
        File samplefile = new File(samplefile);
        samplefile.delete(); 
    }

  
    public static void deleteFile(String samplefile) {
        File samplefile = new File(samplefile);
        if (!samplefile.delete()) {
            System.err.println("Error: Failed to delete file " + samplefile);
        } else {
            System.out.println("File deleted successfully: " + samplefile);
        }
    }
}
