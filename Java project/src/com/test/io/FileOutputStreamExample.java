package com.test.io;

import java.io.FileInputStream;

public class FileOutputStreamExample {
	  public static void main(String args[]){    
          try{    
        	  FileInputStream fin=new FileInputStream("D:\\testout.txt");    
        	  int i=0;    
              while((i=fin.read())!=-1){    
               System.out.print((char)i);    
              }       
    
              fin.close();        
         //   System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}    
     }    
}
