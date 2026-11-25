import java.rmi.UnexpectedException;

class custmise extends RuntimeException{
public custmise(String s){
    super(s);
}
}
public class Except {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            if (a == 0) {
                throw new custmise("Numerator is zero");
            } else if (b == 0) {
                throw new ArithmeticException("denominator is zero");

            } else if (a == 0 && b == 0) {
                throw new ArrayIndexOutOfBoundsException("both are zero");

            } else {
                int c = a / b;
                System.out.println(c);
            }
        }
        catch (custmise e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

finally{
                System.out.println("programm finished");
            }

    }
}
