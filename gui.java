import javax.swing.JOptionPane;
public class Main {
    public static void main(String args[]) {
        String temp;
        temp = JOptionPane.showInputDialog(null, "Enter first number: ");
        int a = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Enter second number: ");
        int b = Integer.parseInt(temp);
        double average = (a + b) / 2.0; 
        JOptionPane.showMessageDialog(null, "The average = " + average, "Average", JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
    }
}
