import java.util.Scanner;
import java.text.NumberFormat;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println(addNumbers(5));
    }
    public static int addNumbers(int num) {
        if(num <= 0) {
            return num;
        }
        else {
            return num + addNumbers(num - 1);
        }
    }
}
