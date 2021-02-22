package jvm.thread;

/*
对于线程的一些理解：所有行为都是并行发生的，开辟新的空间，之前的线程可以把变量传入，但本质上来说，主线程决定线程的开始，
不决定结束，其实就是完全没有关系两个程序，发生关系通过共享变量
*/
public class threadbased extends Thread{
    private String name;
    public threadbased(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for(int i = 0 ;i < 1000; i++){
            System.out.println(Thread.currentThread().getName() + " : " + name + "运行,i = " + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception{
        threadbased thread01 = new threadbased("james");
        threadbased thread02 = new threadbased("kobe");
        thread01.start();
        thread02.start();
        //Thread控制是当前执行的线程
        Thread.sleep(50);
        System.out.println("Main-over");
/*        for (int i = 0; i < 40; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }*/
    }
}
