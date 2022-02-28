package Thread;

//创建多线程的第一中方式; 创建Thread类的子类。
//实现步骤：
/*
    1
    2
    3
    4
 */

public class ThreadDemo {
    public static void main(String[] args) {
        //3.创建子类对象
        MyThread mt = new MyThread();
        //4.调用start(),void方法，开启新的线程,执行run方法。
        mt.start();
//        new MyThread().start();
//        System.out.println(Thread.currentThread().getName());




//        3.
        MyThreadImpl myThread = new MyThreadImpl();
//        4.创建Thread对象，构造方法传递Runnable接口的实现类对象，（Runnable中没有start()方法，所以要这样）
        Thread thread = new Thread(myThread);
        thread.start();


        for (int i = 0; i < 20; i++) { //依然是主线程执行。
            System.out.println("main"+i);
        }

    }
}

// 1.创建Thread的子类
class MyThread extends Thread {
    // 2.重写run方法，设置线程任务（就是开启线程做什么）
    @Override
    public void run() {
//        for (int i = 0; i < 20; i++) {
//            System.out.println("run"+i);
//        }

//        System.out.println(getName()); //方法一获取线程名
//        System.out.println(Thread.currentThread().getName()); //static方法，直接类名调用  方法二currentThread()获取当前执行的线程。

    }
}

//1.创建Runnable接口的实现类
class MyThreadImpl implements Runnable {
    //    2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run" + i);
        }

    }
}

