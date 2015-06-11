import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * Created by royleong on 10/06/15.
 */
public class myFileFilter extends FileFilter {
    public boolean accept(File f){
        return (f.isDirectory()||f.getName().endsWith(".java"));
    }
    public String getDescription(){
        return ("Jaca file(*.java)");
    }
}
