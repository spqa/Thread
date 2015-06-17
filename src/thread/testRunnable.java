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
public class testRunnable implements Runnable {

    String name;

    @Override
    public void run() {
        int count = 0;
        while (count < 3) {
            System.out.println(Thread.currentThread().isAlive());
            name = Thread.currentThread().getName();
            System.out.println(name);
            count++;
        }
    }
    public static void main(String[] args) {
        testRunnable t=new testRunnable();
        Thread th=new Thread(t);
        System.out.println(th.isAlive());
        th.start();
        System.out.println(th.isAlive());
    }

}
