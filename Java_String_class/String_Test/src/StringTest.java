import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by royleong on 29/05/15.
 */
public class StringTest {
    public static void main(String arg[]){
        Inut_test input=new Inut_test();
        //input.Input_show();
        //input.input_Graphics_show();
        //String str1=null,str2=null,str;
        //str1=input.GetInput();
        //str2=input.GetInput();
        //System.out.print("str1"+str1+";"+"str2:"+str2);
//        JOptionPane.showMessageDialog(null,str1.charAt(2));
        //str=str1+str2;
       // str=str.concat(str2);
       // JOptionPane.showMessageDialog(null,str);
//        input.compareDiff(str1,str2);
      //  input.SubShow(str1);
        StringBuffer str=new StringBuffer("dkashdjkhasdkjhsakjdh");
        System.out.println(str.insert(str.length(),"2333"));
        System.out.println(str.append(666));
        System.out.println(str);
    }
}
