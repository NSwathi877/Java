package fourthpackage;
import java.io.File;
public class Prog10 {


	
	     public static void main(String a[])
	     {
	        File file = new File("C:\\Users\\USER\\Downloads\\Leak Detection System Design_files");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	    }
	}
