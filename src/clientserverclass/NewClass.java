/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserverclass;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author carlosespejo
 */
public class NewClass {
    
    
    public static int max(int[] data) throws InterruptedException, ExecutionException     
    {        
        if (data.length == 1)         
        {            
            return data[0];
        }        
             
        else if (data.length == 0)         
        {            
    throw new IllegalArgumentException();        
        }        
// split the job into 2 pieces        
FindMaxTask task1 = new FindMaxTask(data, 0, data.length/2);        
FindMaxTask task2 = new FindMaxTask(data, data.length/2, data.length);        
// spawn 2 threads        
ExecutorService service = Executors.newFixedThreadPool(2);        
Future<Integer> future1 = service.submit(task1);        
Future<Integer> future2 = service.submit(task2);        
return Math.max(future1.get(), future2.get());    
}
    
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        int[] arrayTest = {1,3,4,6,9, 10, 25};
        int answer = 0;
        NewClass test = new NewClass();
        answer = test.max(arrayTest);
        System.out.println(answer);
    }
    
}
