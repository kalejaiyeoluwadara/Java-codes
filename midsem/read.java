import java.io.FileReader;
import java.io.FileWriter;
public class Read{
    public static void main(String args[]){
        try{
        FileReader reader = new FileReader("incus.txt");
        int output;
        output = reader.read();
        while(output != -1 ){
            System.out.println( output + 10);
            output = reader.read();

        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}