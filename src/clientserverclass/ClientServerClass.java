/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserverclass;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author carlosespejo
 */
public class ClientServerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        
        FileInputStream fin = new FileInputStream("/Users/carlosespejo/Desktop/data.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        InputStreamReader in = new InputStreamReader(fin, "UTF-8");
        //String text = in.
        //System.out.println(text);
    }
    
}
