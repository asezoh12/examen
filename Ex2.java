package ex2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2 {

    public static void main(String[] args) {
        mThread t1 = new mThread("UThread1");
        mThread t2 = new mThread("UThread2");
        mThread t3 = new mThread("UThread3");


        t1.start();
        t2.start();
        t3.start();

    }
}

class mThread extends Thread{
    private String name;

    public mThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 25; i++){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();

            System.out.println('['+ this.name + "] - [" + dateFormat.format(date) + ']');
            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}