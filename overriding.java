class or{
    public void or2(){
        System.out.println("hello");
    }
}
class or1 extends or{
    public void or2(){
        System.out.println("anuj");
    }
}
public class overriding {
    public static void main(String[] args){
        or o=new or1();
        o.or2();
    }

}
