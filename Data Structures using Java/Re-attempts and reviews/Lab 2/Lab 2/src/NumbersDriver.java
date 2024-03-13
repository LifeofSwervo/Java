public class NumbersDriver
{
    public static void main(String[] args)
    {



        // 10 element array;
        Numbers numbersObject = new Numbers(10);
        System.out.println("10 element array: ");
        numbersObject.display();

        // Set value method
        numbersObject.setValue(0, 3);
        numbersObject.setValue(9, 4);
        System.out.println("Set value method:");
        numbersObject.display();

        // Get value method
        System.out.println("First number in array: " + numbersObject.getValue(0));
        System.out.println("Last number in array: " + numbersObject.getValue(9));
        System.out.println();

        // Use the Get length method
        System.out.println("Get length method: " + numbersObject.getLength());
        numbersObject.display();
    }
}
