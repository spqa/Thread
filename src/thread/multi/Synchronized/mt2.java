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
public class mt2 extends Thread{
    int rd;
    public synchronized void randomAndDisplay(){
        if(rd!=0){
            System.out.println(rd);
            if(rd%2==0){
                System.out.println("So chan");
            }else{
                System.out.println("So le");
            }
        }else{
        rd=(int) (Math.random()*50);
        }
    }

    @Override
    public void run() {
        randomAndDisplay(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        mt2 m=new mt2();
        Thread t1=new Thread(m);
        Thread t2=new Thread(m);
        t1.start();
        t2.start();
    }
}
