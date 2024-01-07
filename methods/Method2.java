public class Method2{
    //Override methods
   static String logMsg(String msg){
       return msg;
   }
    static int logMsg(int msg){
        return msg;
    }
    static double logMsg(double msg){
        return msg;
    }
    static float logMsg(float msg){
        return msg;
    }
   static boolean logMsg(boolean msg){
       return msg;
   }

    public static void main(String args[]){
        System.out.println(logMsg(true));
    }
}