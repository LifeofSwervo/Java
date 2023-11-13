# How to work with enumerations
*- An enumeration is a set of related constants.*
## How to declare an enumeration
![[Pasted image 20231109102221.png]]
<p style="text-align:center; font-style: italic; color:#00FFFF">The 1st example shows how to declare an enumeration. </p>
- You just code the enum keyword, the name of the enumeration, and a set of braces. Within this set of braces, you code the names of 1 or more constants, separating each name with a comma.
- Internally, each constant within the enumeration is assigned an integer value beginning with 0. 
- For instance, the ShippingType enumeration shown in the 1st example assigns a value of 0 to the UPS_NEXT_DAY constant. A value of 2 is passed to UPS_SECOND_DAY and so on. (In most cases, you don't use these integer values.)

- If you want to make an enumeration available to other classes, even classes in other packages, you can code the public keyword before the enum keyword
- In that case, you must store the enumeration in separate file. It's also common to store the enumeration in the same file as a related class. 
- To do that, you don't code the public keyword. Making the enumeration available to all classes in the current package. Allowing you to code the enumeration in the same file as the related class. 

## How to use an enumeration
- (Same figure as an example)
<p style="text-align:center; font-style: italic; color:#00FFFF">The 2nd example shows that you can declare a variable as an enumeration type. </p>
- You can then assign a constant in that enumeration to the variable. In this case, the UPS_SECOND_DAY constant is assigned to a ShippingType variable named shipType.
<p style="text-align:center; font-style: italic; color:#00FFFF">The 3rd example shows a getShippingAmount() method, using the enumeration as a parameter.</p>
- The code then uses a switch expression to determine the shipping amount. (When using a switch statement like this, it isn't necessary to qualify each constant with the name of the enumeration)
<p style="text-align:center; font-style: italic; color:#00FFFF">The 4th statement shows a statement that calls the getShippingAmount() method. </p>
- This statement passes the UPS_SECOND_DAY constant to the getShippingAmount() method. Resulting in the method returning a value of 5.99. 
*- The statement that's commented out shows that you can't use an integer, or any other type, in place of an enumeration. That's true even though the constants in the enumeration are assigned integer values internationally.*
*- This means enumerations are type safe. If you didn't code the constants as an enumeration, you could use the constant name or its int value wherever the constant is expected.*

## How to enhance an enumeration
![[Pasted image 20231111141532.png]]

<p style="text-align:center; font-style: italic; color:#00FFFF">This figure shows an enhanced version of the ShippingType enumeration.</p>
- It includes a toString() method that overrides the toString() method of the Enum class. Without this method, the toString() method of the Enum class returns the name of the constant. 
- 