/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memphisto;

import java.io.*;

class Memphistotest {
    
}
/**
 *
 * 
 * @author D2A
 */
public class Memphisto {

    
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;
        
        try {
            cin=new InputStreamReader(System.in);
            System.out.println("enter character, 'q' to quit.");
            char c;
            do{
                c=(char) cin.read();
                System.out.print(c);
            } while(c != 'q');
        }finally{
            if(cin != null){
                cin.close();
            }
            }
        }
    }
    
