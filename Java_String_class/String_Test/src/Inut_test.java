import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by royleong on 29/05/15.
 */
public class Inut_test {
    /*
    *   Input By  Terminal
    */
    void Input_show() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            System.out.print("Please Input Smething:");
            str = br.readLine();


        } catch (IOException e) {
        }
        System.out.println(str);
    }

    /*
    * Input By The Graphics Interface
    */
    void input_Graphics_show() {
        String str = JOptionPane.showInputDialog("Input a Test:");
        JOptionPane.showMessageDialog(null, str);
    }

    /*
    * Input and return a string type
    */
    protected String GetInput() {
        return JOptionPane.showInputDialog("Input a series of String:");
    }

    /*
    *Compare two String (Common or not)
    */
    protected void compareDiff(String s1, String s2) {
        boolean b = s1.equals(s2);
        System.out.print(b);
        if (b == true) {
            JOptionPane.showMessageDialog(null, "Your Input is Common");
        } else {
            JOptionPane.showMessageDialog(null, "There are some difference between your inputs");
        }
    }
    /*
    * Cut Strings
    * From 2 to 5 locate
    * */
    protected void SubShow(String S){
        String ss= S.substring(2,6);
        JOptionPane.showMessageDialog(null, "The String You Cut From 2 to 5 is :" +ss);
    }
}
