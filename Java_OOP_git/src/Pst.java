import com.sun.deploy.util.SyncAccess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Leong on 2015/5/27.
 */
public class Pst {
    Student st[] = new Student[30];

    void Mkst() {
        String sn = null, nm = null, ss = null, as = null;
        int a = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < st.length; i++) {
                System.out.println("StudentNumber:");
                sn=br.readLine();
                System.out.println("StudentName:");
                nm=br.readLine();
                System.out.println("StudentSex:");
                ss=br.readLine();
                System.out.println("Student Age:");
                as=br.readLine();
                a=Integer.parseInt(as);
                st[i]=new Student(sn,nm,ss,a);
            }
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    void sortP(){
        int i=0,j=0,flag=0;
        Student t=null;
        for(i=0;i<st.length;i++){
            flag=0;
            for(j=0;j<st.length-i-1;j++){
                if(st[j].Age>st[j+1].Age){
                    t=st[j];
                    st[j]=st[j+1];
                    st[j+1]=t;
                    flag=1;
                }
            }
            if(flag==1){
                break;
            }
        }
        for(i=0;i<st.length;i++){
            System.out.println(st[i].toString());
        }
    }
    void SearchP(String sn){
        int i=0;
        for(i=0;i<st.length;i++ )
        {
            if(st[i].StudentNo.equals(sn)){
                st[i].UpdateAge(st[i].GetAge()+1);
                System.out.println(st[i].toString());
                break;
            }
        }
    }

}
