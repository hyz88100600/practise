package org.example.thread;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/*
 *@author hanyunzhuo
 *@date 2020/5/28 13:45
 *
 * 开启3个线程，这3个线程的ID分别为A、B、C，
 * 每个线程将自己的ID在屏幕上打印10遍，要求输出结果必须按ABC的顺序显示；
 * 如：ABCABC….依次递推。
 */
public class SequencePrint {


    public static void main(String[] args) {

        PrintImpl pi = new PrintImpl();

        Thread at = new Thread(pi, "A");
        Thread bt = new Thread(pi, "B");
        Thread ct = new Thread(pi, "C");

        at.start();
        bt.start();
        ct.start();
    }

    static class PrintImpl implements Runnable {

        private int in = 0;
        private final int MAX_COUNT = 30;

        @Override
        public void run() {
            synchronized (this) {
                while (in < MAX_COUNT) {

                        if (in % 3 == 0) {
                            if ("A".equals(Thread.currentThread().getName())) {
                                System.out.println(Thread.currentThread().getName()+in);
                                in++;
                            }
                        }

                        if (in % 3 == 1) {
                            if ("B".equals(Thread.currentThread().getName())) {
                                System.out.println(Thread.currentThread().getName()+in);
                                in++;
                            }
                        }

                        if (in % 3 == 2) {
                            if ("C".equals(Thread.currentThread().getName())) {
                                System.out.println(Thread.currentThread().getName()+in);
                                in++;
                            }
                        }

                        this.notifyAll();

                        try {
                            this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                }

                this.notifyAll();
            }


        }
    }
}
