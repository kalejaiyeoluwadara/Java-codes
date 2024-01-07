import java.io.*;

public class Discount {

    public static void main(String[] args) throws IOException {

        FileReader input = null;
        BufferedReader value = null;
        PrintWriter output = null;

        try {
            input = new FileReader("price.txt");
            value = new BufferedReader(input);
            output = new PrintWriter("DiscountedPrice.xls"); // Change the file extension to .txt

            String num;
            while ((num = value.readLine()) != null) {
                int n = Integer.parseInt(num);
                if (n > 0 && n <= 500)
                    output.println("Discounted price = " + (n - n * 0.05));
                else if (n > 500 && n <= 2000)
                    output.println("Discounted price = " + (n - n * 0.1));
                else if (n > 2000 && n <= 5000)
                    output.println("Discounted price = " + (n - n * 0.15));
            }

        } catch (IOException e) {
            System.err.println("An unexpected error has occurred " + e.getMessage());
        } finally {
            if (input != null)
                input.close();
            if (output != null)
                output.close();
        }
    }
}
