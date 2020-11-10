package com.lzhenxing.myproject.algorithm.thread;

/**
 *   ClassName: OrderPrint <br/>   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2020/11/7
 */
public class OrderPrint {

    private static Integer num = 1;

    static class Thread1 implements Runnable{
        @Override
        public void run(){
            int i = 0;
            while (true){
                synchronized (this){
                    if(num % 3 == 1){
                        System.out.println("Thread1: 1");
                        num++;
                        i++;
                    }
                }
                if(i == 10){
                    break;
                }
            }
        }
    }

    static class Thread2 implements Runnable{
        @Override
        public void run(){
            while (true){
                int i = 0;
                synchronized (this){
                    if(num % 3 == 2){
                        System.out.println("Thread2: 2");
                        num++;
                        i++;

                    }
                }
                if(i == 10){
                    break;
                }
            }
        }
    }

    static class Thread3 implements Runnable{
        @Override
        public void run(){
            while (true){
                int i = 0;
                synchronized (this){
                    if(num % 3 == 0){
                        System.out.println("Thread3: 3");
                        num++;
                        i++;
                        if(i == 10){
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        Thread thread3 = new Thread(new Thread3());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
