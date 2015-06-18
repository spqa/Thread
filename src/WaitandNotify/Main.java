/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WaitandNotify;

/**
 *
 * @author QuangAnh
 */
public class Main {

    public static void main(String[] args) {
        MethodClass m = new MethodClass();
        Thread t1 = new Thread(m.task1);
        Thread t2 = new Thread(m.task2);
        t1.start();
        t2.start();
    }
}
