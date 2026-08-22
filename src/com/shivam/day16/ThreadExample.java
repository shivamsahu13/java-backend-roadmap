package com.shivam.day16;

public class ThreadExample {

    public static void main(String[] args) throws InterruptedException{
        //System.out.println(Thread.currentThread().getName());
        /*System.out.println("Main thread: " +
                Thread.currentThread().getName());*/
        //MyThread thread = new MyThread();
        //thread.start();
        /*thread.run();
        System.out.println("Main thread");
        thread.start();
        thread.run();*/

        /*MyRunnable runnable =  new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();*/

        /*Runnable task = () -> {
            System.out.println(
                    "Lambda thread: " +
                            Thread.currentThread().getName()
            );
        };

        Thread thread = new Thread(task);

        thread.start();*/
        //Runnable -> run -> lamda
        //runnable is functional interface thats why lamda work
        /*Thread thread = new Thread(() ->{
            System.out.println(
                    "Lambda thread: " +
                            Thread.currentThread().getName()
            );
        });
        thread.start();*/

        /*Thread thread = new Thread(()->{
            for (int i = 1; i <= 5; i++) {

                System.out.println(
                        "Count: " + i +
                                " - " + Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        });
        thread.start();*/
        /*Thread thread = new Thread(() -> {
            System.out.println("Inside thread");
        });

        System.out.println(thread.getState());

        thread.start();

        System.out.println(thread.getState());*/

        /*Thread worker = new Thread(()->{
            System.out.println("Worker Started");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println("Interrupted");
            }
            System.out.println("Worker Finished");
        });

        worker.start();
        try {
            worker.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main finished");*/
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count);
    }
}
