/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.multi;

/**
 *
 * @author QuangAnh
 */
public class MuThread extends Thread {

    String name;

    @Override
    public void run() {
        this.name=Thread.currentThread().getName();
        System.out.println(name);
    }
    public static void main(String[] args) {
        MuThread t1=new MuThread();
        MuThread t2=new MuThread();
        t1.start();

        System.out.println(Thread.activeCount());
                t2.start();
    }

}
