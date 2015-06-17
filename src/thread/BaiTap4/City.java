/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.BaiTap4;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QuangAnh
 */
public class City extends Thread{
    String name;
    ArrayList<String> c=new ArrayList<>();
    public void input() throws InterruptedException{       
        c.add("Hanoi");
        c.add("paris");
        c.add("New delhi");
        c.add("da nang");
        for(int i=0;i<4;i++){
            int rd=(int) (Math.random()*4);
            System.out.println(c.get(rd));
            Thread.sleep(1000);
        }
    }

    @Override
    public void run() {
        try {
            input(); //To change body of generated methods, choose Tools | Templates.
        } catch (InterruptedException ex) {
            Logger.getLogger(City.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
     City c=new City();
     c.start();
     
    }
}
