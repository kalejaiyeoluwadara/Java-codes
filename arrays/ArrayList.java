 import java.util.Scanner;
public class ArrayList{
    public static void main(String args[]){
        // String[] arr =  new String[10];
        // arr.add("new")
	Scanner sc = new Scanner(System.in);
        int a[];
        System.out.print("Enter size of the array: ");
	int size = sc.nextInt();
	a = new int[size];
	for(int i =0;i<size;i++){
		System.out.print("Enter Element["+i+"]: ");
		a[i] = sc.nextInt();
		
	}
	System.out.println("");
	int max = a[0];
	for(int i=1;i<a.length;i++){
		if(a[i] >){
}
		System.out.print(a[i] + " ");
	}
	System.out.println("");
	System.out.println("Done");
    
    //check max num



    }
}