class ab{
    String name;
    public void ab1(){
        System.out.println(this.name);
    }
    ab(String mane){
        this.name=mane;
    }
}
public class Constructor{
    public static void main(String[] args) {
        ab o=new ab("anuj");
        o.ab1();
    }
}