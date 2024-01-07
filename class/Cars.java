public class Cars{
    public static void main(String args[]){
        Toyota camry2012 = new Toyota("camry",2012);
        Toyota camry2016 = new Toyota("camry",2016);
        Toyota camry2005 = new Toyota("camry",2005);
        Toyota camry2023 = new Toyota("camry",2012);
        Toyota camry2024 = new Toyota("camry",2024);


         System.out.println("Camry 2016: Model - " + camry2016.getModel() +
                ", Year - " + camry2016.getYear());

    }
}