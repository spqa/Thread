/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.BaiTap4;

/**
 *
 * @author QuangAnh
 */
public class NumRandom extends Thread {

    public void display() throws InterruptedException {
        while (true) {
            int rd = (int) (Math.random() * 100);
            System.out.println(rd);
            Thread.sleep(1000);
        }
    }
}
