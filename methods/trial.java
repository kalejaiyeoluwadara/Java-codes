
// import java.util.Scanner;
// import java.io.File;
// import java.io.FileWriter;
// class Main{
//      public static int total(int tests[]){
//             int total = 0;
//             for(int scores: tests){
//                 total += scores;
//             }
//             return total;
//         }
//     public static void main(String args[]){
//         int total = 0;
//        try{
//          Scanner sc = new Scanner(new File("new.txt"));
//          FileWriter writer = new FileWriter("next.txt");
//          int testScores[] = new int[5];
//         while(sc.hasNext()){
//             String first = sc.next();
//             String sec = sc.next();
//             for(int i = 0;i<5;i++){
//                 testScores[i] = Integer.parseInt(sc.next());
//                 // writer.write("Hellow or");
//             }
//             System.out.println(first);
//         System.out.println(sec);
//         }
//         System.out.println(total(testScores));
        
//        }
//        catch(Exception e){
//         System.out.println(e);
//        }
//     }
// }

import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
public class Writer{
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(new File("new.txt"));
            FileWriter writer = new FileWriter("red.txt");
               while(sc.hasNext()){
                String firstName = sc.next();
                String secondName = sc.next();
                writer.write("First Name: " + firstName+"\n");
                writer.append("Last Name: " + secondName);
               }
                writer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}