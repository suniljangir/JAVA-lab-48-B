import java.io.File;  
import java.io.IOException;  
public class CreateFileExample1   
{  
public static void main(String[] args)   
{     
File file = new File("C:\\demo\\music.txt");  
boolean result;  
try   
{  
result = file.createNewFile();  //creates a new file  
if(result)     
{  
System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
}  
else  
{  
System.out.println("File already exist at location: "+file.getCanonicalPath());  
}  
}   
catch (IOException e)   
{  
e.printStackTrace();    
}         
}  
}  
