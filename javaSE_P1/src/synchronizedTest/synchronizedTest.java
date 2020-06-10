package synchronizedTest;

public class synchronizedTest
{

    public static void main(String[] args)
    {
        /**创建并开启了两个线程**/
        threadClass threadClass1 = new threadClass();
        new Thread(threadClass1,"jeremy").start();
        new Thread(threadClass1,"lucy").start();
    }

}
class threadClass implements Runnable
{   static final  Object obj = new Object();
    int i = 10;
    @Override
    public synchronized void run()
    {
        synchronized (obj)
        {
            runtime();
        }
    }
    void runtime()
    {
        while (i > 0)
        {
            System.out.println(Thread.currentThread().getName()+"正在运行.....");
            i--;
        }
    }
}
