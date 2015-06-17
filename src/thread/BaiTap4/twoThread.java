/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.BaiTap4;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;
import java.util.Date;

/**
 *
 * @author QuangAnh
 */
public class twoThread {

    public void randomNum() {
        double a = Math.random();
        System.out.println(a);
    }

    public void Printdate() {
        Date d = new Date();
        System.out.println(d.toString());
    }
    Runnable th1 = new Runnable() {

        @Override
        public void run() {
            randomNum();
        }
    };
    Runnable th2 = new Runnable() {

        @Override
        public void run() {
            Printdate();
        }
    };

    public void runthread() {
        Thread t1 = new Thread(th1);
        t1.setPriority(2);

        Thread t2 = new Thread(th2);
        t2.setPriority(1);
        t2.start();
        t1.start();

    }

    public static void main(String[] args) {
        twoThread c = new twoThread();
        c.runthread();
    }

}
