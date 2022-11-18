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
    File file;
    
    public Controller(File file) {
        this.file=file;

    }
    public void setFile(String filee){
        this.file=new File(filee);
        
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
