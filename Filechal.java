import java.io.*;
public class Filechal{
    public static void main(String[] args){
        try{
            FileReader reader =  new FileReader("poem.txt");
            int character = reader.read();
            int ecount = 0;
            int total = 0;
            while(character != -1){
                if((char) character == 'e' ){
                    ecount += 1;
                    total += 1;
                }
                else{
                    total += 1;
                }
                System.out.print((char) character);
                character = reader.read();
            }
            reader.close();
            float perc = (float)2/3;
            System.out.println("Vowel e occurs " + perc + "% times\n while total count is " + total);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}