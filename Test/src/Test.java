
public class Test {
    public static void main(String[] args)
    {
        String s = "two";
        double interval = 0.0;
        try   {
            interval = Double.parseDouble(s);
        }
        catch(NumberFormatException e)  {     }
        System.out.println(interval);
    }
}
