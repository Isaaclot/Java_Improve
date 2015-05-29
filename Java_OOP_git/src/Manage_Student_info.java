import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Leong on 2015/5/27.
 * ������ʮ��ѧ������Ϣ��ѧ���������Ա����䣩
 * �������������
 * �������ܣ�ѧ��������
 *
 */
public class Manage_Student_info {
    public static void main(String arg[]){
        int i;
        String sn;
        Pst pst1=new Pst();
        pst1.Mkst();
        pst1.sortP();
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("StudentNo:");
            sn=br.readLine();
            pst1.SearchP(sn);
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
