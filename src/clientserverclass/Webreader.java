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
import static java.lang.System.in;
import java.net.URL;

/**
 *
 * @author carlosespejo
 */
public class Webreader {
    public static void main(String[] args){
        
        String s = "https://www.google.com/#tbm=shop&q=food";
        try {
            URL u = new URL(s);
            InputStream in = u.openStream();
            in = new BufferedInputStream(in);
            
            //chain the inputstream to a reader
            
            Reader r = new InputStreamReader(in);
            int c;
            while ((c = r.read()) != -1)
            {
                System.out.print((char)c);
            }
        catch (MalformedURLException ex)
                    {
                    System.err.println(s + " is not a parseable url");
                    }
        }
        catch (IOException ex)
        {
            System.err.println(ex);
        }
        finally 
        {
                if (in != null)
                {
                try 
                {
                in.close();
                }
                catch (IOException e)
                {
                
                }
                
                }
                
                
                }// end of finally
        
        
        
    }// end of main
}
