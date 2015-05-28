import org.omg.CORBA.portable.ValueOutputStream;

/**
 * Created by Leong on 2015/5/27.
 */
public class Student {
    String StudentNo, StudentName, StudentSex;
    int Age;

    String GetStudentName() {
        return StudentName;
    }

    String GetStudentNo() {
        return StudentNo;
    }

    String GetStudentSex() {
        return StudentSex;
    }

    int GetAge() {
        return Age;
    }

    void UpdateAge(int a) {
        Age = a;
    }

    Student(String name, String No, String sex, int a) {
        StudentName=name;
        StudentNo=No;
        StudentSex=sex;
        Age=a;
    }
    public String toString(){
        return  (StudentNo+";"+StudentName+";"+StudentSex+";"+Age+";");
    }

}
