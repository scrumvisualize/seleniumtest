package utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteAndSaveToFile {
	
	public void writeAndSaveText(String strContent){
		 BufferedWriter bufferedWriter = null;
         try {
    
		     File myFile = new File("D:/TestFile.txt");
		     // check if file exist, otherwise create the file before writing
		     if (!myFile.exists()) {
		         myFile.createNewFile();
		     }
		     Writer writer = new FileWriter(myFile);
		     bufferedWriter = new BufferedWriter(writer);
		     bufferedWriter.write(strContent);
		 	} catch (IOException e) {
		     e.printStackTrace();
		 	} finally{
		     try{
		         if(bufferedWriter != null) bufferedWriter.close();
		     } catch(Exception ex){
		          
		     }
		 }
			
	}
	
}
