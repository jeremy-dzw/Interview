package sleepAndWaitTest;
/**
 * sleep()和wait()的区别在以下两个方面
 * 1、sleep()不会释放锁，而wait()会释放锁
 * 2、sleep()可以使用在任何地方，而wait()只能在同步方法或者同步代码块中使用
 * **/
public class sleepAndWaitTest
{
    public static void main(String[] args) throws InterruptedException {   Object obj = new Object();//作为同步代码块的锁对象
        threadClassA threadClassA = new threadClassA();
        threadClassB threadClassB = new threadClassB();
        Thread tA = new Thread(threadClassA,"Tom");
        Thread tB = new Thread(threadClassB,"Jerry");
        synchronized (obj)
        {
            tA.start();
            tB.start();
            tA.wait();
        }
    }
}
//定义一个A线程类去实现Runnable接口
class threadClassA implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(3000);

        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"正在运行.....");
    }
}
//定义一个B线程类去实现Runnable接口
class threadClassB implements Runnable
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"正在运行.....");
    }
}