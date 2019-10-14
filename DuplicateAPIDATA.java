
import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.time.format.DateTimeFormatter; 

import java.time.LocalDateTime;  

public class DuplicateAPIDATA {

   public static void main(String args[]) throws IOException {  

      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
      
      LocalDateTime now = LocalDateTime.now(); 

      FileInputStream in = null;

      FileOutputStream out = null;

      try {

         in = new FileInputStream("data.txt");

         out = new FileOutputStream(dtf.format(now)+ ".txt");

         
         int c;

         while ((c = in.read()) != -1) {

            out.write(c);

         }

      }finally {

         if (in != null) {

            in.close();

         }

         if (out != null) {

            out.close();

         }

      }

   }

}
