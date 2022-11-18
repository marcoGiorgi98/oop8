package it.unibo.mvc;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Application controller. Performs the I/O.
 */
public class Controller {           //fatto io
    private File file;
    //private String pat =System.getProperty("user.home");
    private String sep= System.getProperty("file.separator");
    private String pat="C:"+sep+"Users"+sep+"rikys"+sep+"defolt.txt";
   
    public Controller() {
        //this.file=file;
        

    }
    public void setFile(){
        //this.file=new File(filee);
        this.file=new File("C:\\Users\\rikys\\defolt.txt");
    }
    public File getFile(){
        return this.file;
    }
    public String pathfile(File percorso){
        return percorso.getPath();
    }
    public void scrivi(String testo) throws IOException{
        FileWriter myWriter = new FileWriter(this.getFile());
      myWriter.write(testo);
        myWriter.close();
        
            
        
        
        

    }
    

}
