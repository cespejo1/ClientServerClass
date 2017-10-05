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
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlosespejo
 */
public class URLClass {
    public static void main(String[] args) {
        
        //construct url from one string alone
        try
        {
            URL url1 = new URL("http://google.com");
            System.out.println(url1.getAuthority());
            System.out.println(url1.getPort());
            System.out.println(url1.getClass());
            System.out.println(url1.getProtocol());
            
                            
        }
        catch (MalformedURLException ex) {
            System.err.println();
            System.out.println("did not work");
        }
        
        //construct url from 3 strings, protocal, hostname and file
        try
        {
            //encode url to ensure proper reading, supposed to be
            //https://www.google.com/#q=sd160&tbm=shop
            String url2String = ("https://www.google.com/#");
            url2String += URLEncoder.encode("q", "UTF-8");
            url2String += "=";
            url2String += URLEncoder.encode("sd160", "UTF-8");
            url2String += "&";
            url2String += URLEncoder.encode("tbm", "UTF-8");
            url2String += "=";
            url2String += URLEncoder.encode("shop", "UTF-8");
            
            System.out.println(url2String);
            
            URL url2 = new URL(url2String);
            System.out.println(url2.getAuthority());
            System.out.println(url2.getDefaultPort());
            System.out.println(url2.getQuery());
            System.out.println(url2.getProtocol());
            InputStream in2 = url2.openStream();
            in2 = new BufferedInputStream(in2);
            Reader r = new InputStreamReader(in2);
            int c;
            while ((c = in2.read()) != -1) System.out.write(c);
            in2.close();
            
            
                            
        }
        catch (IOException ex) {
            System.err.println();
            System.out.println("did not work");
        }
      
        
        
        
    }// end of main
}
