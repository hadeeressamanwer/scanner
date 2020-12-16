package scanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileWriter;   // Import the FileWriter class

public class run {
static function f=new function();
static tokens t=new tokens();
static lolii lol=new lolii();

 
        	
        	public void file(String path)
        	{
        	//String paths=lol.path;
            try {
        	List<String> allLines = Files.readAllLines(Paths.get(path));
             //   FileWriter myWriter = new FileWriter("yrab.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\senior\\yrab.txt"));
            int x=1;
            for (String line : allLines)
            {
                String[] arr = line.split(" ");
                for ( int i=0; i<arr.length ;i++) 
                   {
                	
                	if (arr[i].equals("{")) 
                	{
                		for(int j=i+1;j<arr.length;j++)
                		{
                        	if (arr[j].equals("}")) { if (j!=arr.length-1) i=j+1; else{x=0;}break;}
                		}
                	
                	}
                	if (x==0) {x=1;break;}
                   t=  f.fn(arr[i]); 
                   writer.write(t.type + "," +t.value  + "\n");

            
                }
            }
          
            writer.close();
            }
            catch(Exception e) {
            	  //  Block of code to handle errors
            	}
        	}
        
        
}


