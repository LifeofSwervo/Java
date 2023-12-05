public class NumbersDriver
{
    public static void main(String[] args)
    {
        // Instance Numbers Object
        Numbers numbersObject = new Numbers(10);
        // Display method on object
        System.out.println("Initial Array: ");
        numbersObject.display();
        // SetValue method on numbers object (0 - 100)
        numbersObject.setValue(0, 50);
        numbersObject.setValue(25, 90);
        // getValue Method displaying values at certain indices.
        System.out.println("Index 0: " + numbersObject.getValue(0));
        System.out.println("Index 90: " + numbersObject.getValue(90));
        // getLength, showing length of the array.
        System.out.println("Array Length: " + numbersObject.getLength());
        // Display array
        numbersObject.display();
    }
}


