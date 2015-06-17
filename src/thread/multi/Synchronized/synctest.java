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
public class synctest extends Thread{
public synchronized void display(){
for(int i=0;i<3;i++){
    System.out.println("number :"+i);
}

}

    @Override
    public void run() {
        display(); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
       synctest s=new synctest();
       Thread t1=new Thread(s);
       Thread t2=new Thread(s);
       t1.start();
       t2.start();
    }
//successful
    }
    
    
