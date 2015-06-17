/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author QuangAnh
 */
public class Thread1 extends Thread{
    String name;

    @Override
    public void run() {
        int count=0;
        while(count<=3){
            System.out.println(Thread.activeCount());
            System.out.println(Thread.currentThread().getName());
            count++;
                    if(Thread.currentThread().getName().equals("Thread-0")){
                        System.out.println("lalala thread-0");
                    }else{
                        System.out.println("jini fuck");
                    }
        }
    }
    public static void main(String[] args) {
        Thread1 t=new Thread1();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t.isAlive());
        t.start();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t.isAlive());
    }
    
}
