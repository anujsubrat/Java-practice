class r implements Runnable{
    public void run(){
        int a=1;
        while(a<100){
            System.out.println("Mythread");
            a++;

        }
    }
}
class r1 implements Runnable{
    public void run(){
        int a=1;
        while(a<100){
            System.out.println("Mythread1");
            a++;

        }
    }
}
public class runnable {
    public static void main(String[] args){
        r o=new r();
        Thread p=new Thread(o);
        r1 q=new r1();
        Thread s=new Thread(q);
        p.start();
        s.start();
    }
}
