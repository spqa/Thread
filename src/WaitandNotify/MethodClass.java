/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WaitandNotify;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QuangAnh
 */
public class MethodClass {

    class random1 {

        int rd;

        public random1() {
        }

        public random1(int rd) {
            this.rd = rd;
        }

    }
    random1 r = new random1();

    public void random() throws InterruptedException {

        synchronized (r) {
            while (true) {
                Thread.sleep(1000);
                r.rd = (int) (Math.random() * 100);
                System.out.println(r.rd);
                r.notify();
                r.wait();
            }

        }
    }

    public void check() throws InterruptedException {

        synchronized (r) {
            while (true) {
                if (r.rd % 2 == 0) {
                    System.out.println("so chan");
                } else {
                    System.out.println("so le!");
                }
                
                r.notify();
                r.wait();
            }
        }
    }
    Runnable task1 = new Runnable() {

        @Override
        public void run() {
            try {
                random();
            } catch (InterruptedException ex) {
                Logger.getLogger(MethodClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    Runnable task2 = new Runnable() {

        @Override
        public void run() {
            try {
                check();
            } catch (InterruptedException ex) {
                Logger.getLogger(MethodClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

}
