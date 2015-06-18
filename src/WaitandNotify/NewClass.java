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
public class NewClass {
    MyCounter mCounter = new MyCounter();

    // Thread này có nhiệm vụ tăng biến đếm cnt lên 1 đơn vị
    Runnable task1 = new Runnable() {

        @Override
        public void run() {
            synchronized (mCounter) {
                while (true) {
                    try {
                        Thread.sleep(3000);
                        System.out.println("Đang tính.....");
                        int cnt = mCounter.getCnt();
                        mCounter.setCnt(cnt + 1);
                        
                        mCounter.notify();
                        mCounter.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    };

    // Thread 2 có nhiệm vụ khi thread 1 tăng giá trị biến đếm thì in ra màn hình
    Runnable task2 = new Runnable() {

        @Override
        public void run() {
            synchronized (mCounter) {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("#" + mCounter.getCnt());
                        
                        mCounter.notify();
                        mCounter.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    };

    public void test() {
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass demo = new NewClass();
        demo.test();
    }

    class MyCounter {

        int cnt = 0;

        public int getCnt() {
            return cnt;
        }

        public void setCnt(int cnt) {
            this.cnt = cnt;
        }

    }
}
