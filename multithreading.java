class Mythread extends Thread{
    public void run(){
       int a=1;
        while(a<100){
            System.out.println("Mythread");
            a++;

        }
    }
}
class Mythread1 extends Thread{
    public void run(){
        int a=1;
        while(a<100){
            System.out.println("Mythread1");
            a++;

        }
    }
}
public class multithreading {
    public static void main(String[] args){
        Mythread o=new Mythread();
        Mythread1 p=new Mythread1();
        o.start();
        p.start();
    }
}
