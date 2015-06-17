/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.multi.Synchronized;

/**
 *
 * @author QuangAnh
 */
public class sync {   

    public void test(){
        try{
        for(int i=3;i>0;i--){
            System.out.println("w8"+ i+"sec");
            Thread.sleep(1000);
        }
        }catch(InterruptedException e){
            System.out.println("interrupted");
        }
    }
    
    
    
}
