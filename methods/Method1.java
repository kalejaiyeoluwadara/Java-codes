
public class Method1{
    //Override methods
    static void add(int a, int b){
        System.out.println(a + b);

    }
    static void add(int a, int b,int c){
        System.out.println(a + b + c);
    }
    static void add(double a, double b){
        System.out.println(a + b);
    }
    static void add(double a, double b,double c){
        System.out.println(a + b + c);
    }
    static void add(double a, int b){
        System.out.println(a + b);
    }

    public static void main(String args[]){
        add(1,2);
    }
}