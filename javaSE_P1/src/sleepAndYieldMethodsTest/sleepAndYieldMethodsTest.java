package sleepAndYieldMethodsTest;

public class sleepAndYieldMethodsTest
{
    public static void main(String[] args) throws InterruptedException {
        //创建并开启两个线程
        threadClass threadClass = new threadClass();
        Thread t1 = new Thread(threadClass,"jeremy");
        Thread t2 = new Thread(threadClass,"lucy");
        t1.start();
        t2.start();


    }
}
class threadClass implements  Runnable
{
    @Override
    public synchronized void run()
    {
        try
        {
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"正在执行.....");
    }
}
