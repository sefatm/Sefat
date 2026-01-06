
package Jan06;

public class ExceptionNew {
    public static void main(String[] args) {
        int[] obj = new int[3];
        obj[0] = 1;
        obj[1] = 0;
        
        try {
            System.out.println(obj[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index");
        }
        try {
            int a = obj[0]/obj[1];
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("");
            System.out.println("Tnteger cannot be divide by 0");
        }
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("You cannot print a String's length object when its value is null.");
        }
        finally{
        System.out.println("");
        System.out.println("Exception caught successfully.");
    }
        
    }          
}
