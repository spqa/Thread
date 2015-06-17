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
public class baicuathay {
    

    int amount = 10; // Số tiền trong tài khoản

    private void rutTien(String threadName) {
        if (amount > 0) {
            int soTienConTrongTaiKhoan = amount;
            for (int i = 0; i < soTienConTrongTaiKhoan; i++) {
                try {
                    Thread.sleep(1000);
                    amount = amount - 1;
                    System.out.println("[" + threadName + "] " + "Số tiền còn lại trong tài khoản: " + amount);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("[" + threadName + "] " + "Quý khách không đủ tiền để thực hiện fap này");
        }
    }

    Runnable task_1 = new Runnable() {

        @Override
        public void run() {
            rutTien("Phan Quốc Đạt");
        }
    };

    Runnable task_2 = new Runnable() {

        @Override
        public void run() {
            rutTien("Bồ của Đạt - là bạn Sơn");
        }
    };

    private void test() {
        // Giả sử tình huống cùng 1 tài khoản ngân hàng và dc thực hiện rút tiền đồng thời ở 2 địa điểm khác nhau
        Thread th1 = new Thread(task_1);
        Thread th2 = new Thread(task_2);

        th1.start();
        th2.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        baicuathay demo = new baicuathay();
        demo.test();
    }


}
