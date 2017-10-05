/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserverclass;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;

/**
 *
 * @author carlosespejo
 */

public class WebAddressLookUp {
    
    public static void main(String[] arg){
        
        // Look up IP Address
        try 
        {
            InetAddress address = InetAddress.getByName("www.oreilly.com");
            System.out.println(address);
            
        }
        catch (UnknownHostException ex)
        {
            System.out.println("Could not find www.oreily.com");
        }
        
        //pull data from website
        try {
            URL u = new URL("http://sjedesign.net");
            InputStream in = u.openStream();
            in = new BufferedInputStream(in);
            
            //chain the inputstream to a reader
            
            Reader r = new InputStreamReader(in);
            
            System.out.println("The port number is " + u.getPort());
            int c;
            while ((c = r.read()) != -1) System.out.print((char)c);;
            in.close();
        }
        catch (IOException ex)
        {
            System.err.println(ex);
        }
        
        
        
        
        
        
    }//end of main
    
    
    
}
