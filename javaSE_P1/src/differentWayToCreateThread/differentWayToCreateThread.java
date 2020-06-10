package differentWayToCreateThread;

public class differentWayToCreateThread
{
    public static void main(String[] args)
    {
//        threadClass threadClass = new threadClass();
//        threadClass.start();
        threadCreated threadCreated = new threadCreated();
        new Thread(threadCreated).start();
    }
}
//Method one  to  create  thread
class threadClass extends Thread/**此类继承了Thread类，就没有办法再继承其他类，导致功能过于单一**/
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"正在运行...");
    }
}
//Method two  to  create  thread
class  threadCreated  extends  process implements Runnable/**此类既实现了接口，又继承了父类，避免了单继承的局限性，使自己的功能更加强大**/
{
    @Override
    public void run()
    {
        process process = new process();
        process.dowork();
        System.out.println(Thread.currentThread().getName()+"正在运行...");
    }
}
class process
{
    void dowork()
    {
        System.out.println("i  can  do  any  work...");
    }
}