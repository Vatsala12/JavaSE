class T1 extends Thread
{ int a=2;
   public void run()
    {
       for(int i=1;i<=10;i++)
    {
        System.out.println(a+"*"+i+"="+(a*i));
    }
    
    }       
}
class T2 extends Thread {
    int b=3;
    public void run()
    {
        for(int i=1;i<=10;i++)
    {
        System.out.println(b+"*"+i+"="+(b*i));
    }
    }
}
class T3 extends Thread {
   int c=4;
    public void run()
    {
        for(int i=1;i<=10;i++)
    {
        System.out.println(c+"*"+i+"="+(c*i));
    }
    }
}
    class MyThread 
    {
        public static void main(String[] args) {
            T1 t1=new T1();
           //t1.setPriority(T1.MIN_PRIORITY);
            t1.start();
            T2 t2=new T2();
          //t2.setPriority(T2.MAX_PRIORITY);
            t2.start();
          T3 t3=new T3();
      // t3.setPriority(T3.NORM_PRIORITY);
        t3.start();
        }
    
}
