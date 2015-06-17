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
public class multiThread extends Thread {

    int rd;

    public void random() {
        rd = (int) (Math.random() * 50);
        System.out.println("The random number is:" + rd);
    }

    public void check() {
        System.out.println("Checking...!!!");
        if (rd % 2 == 0) {
            System.out.println("So chan");
        } else {
            System.out.println("So le");
        }

    }
    Runnable task1 = new Runnable() {

        @Override
        public void run() {
            random();
        }
    };
    Runnable task2 = new Runnable() {

        @Override
        public void run() {
            check();
        }
    };

    public static void main(String[] args) throws InterruptedException {
        multiThread m = new multiThread();
        Thread t1 = new Thread(m.task1);
        Thread t2 = new Thread(m.task2);
        t1.start();
        t1.join();
        t2.start();
    }
}
