class ol{
    public void ol1(String name){
        System.out.println(name);

    }
    public void ol1(String name, int number){
        System.out.println(name+" "+number);
    }
}
public class overloading {
    public static void main(String[] args){
        ol a=new ol();
        a.ol1("anuj");
        a.ol1("anuj",22);
    }
}
