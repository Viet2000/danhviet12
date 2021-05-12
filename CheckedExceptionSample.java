import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckedExceptionSample {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        try{
            Files.createFile(Paths.get("student.txt"));
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("After exception");
    }
}
