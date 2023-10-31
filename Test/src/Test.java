import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        ArrayList<Double> miles = new ArrayList<>();
        miles.add(37.5);
        miles.add(26.2);
        miles.add(54.7);
        double m = miles.remove(0);
        System.out.println(m);
    }
}
