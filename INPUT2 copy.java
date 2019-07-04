package INPUT2;
import javax.swing.JOptionPane;

public class INPUT2 {
    public static void main(String[] args){
        //JOptionPane.showMessageDialog(null, "Hello World");
        String num;
        num=JOptionPane.showInputDialog("Enter a number");

        int number=Integer.parseInt(num);
        number+=1;
        JOptionPane.showMessageDialog(null,number);
        System.exit(0);

    }
}
