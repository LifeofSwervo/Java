Aman# How to work with interfaces
*- This section focuses on basic skills of coding and implementing interfaces.*
## How to code an interface
![[Pasted image 20231105123900.png]]
*- To start coding an interface you code the public keyword, followed by the interface keyword, followed by the name of the interface.*
*- When you name an interface it's common to end the name with a suffix of "able" or "er". For example, the Java API uses names like Cloneable, Comparable, EventListener, ActionListener, and so on.*
*- A common naming strategy is to prefix the name of an Interface with I. For example - "IPrint". *
<p style="text-align:center; font-style: italic; color:#00FFFF">In the 1st example, the example shows the code for a Printable interface, with a single abstract method named print(), that doesn't accept any arguments or return any data.</p>
- As with all abstract methods, you don't code braces at the end of the method. Instead, you code a semicolon immediately after the parenthesis.
<p style="text-align:center; font-style: italic; color:#00FFFF">The 2nd example shows the code for an interface named ProductWriter .</p>
- This interface contains 3 abstract methods, add(), update(), and delete(). All of these methods accept a Product object as an argument and return a boolean value, indicating weather the operation was successful.
<p style="text-align:center; font-style: italic; color:#00FFFF">The 3rd example shows how to code an interface that defines constants.</p>
- In the example an interface named DepartmentConstants defines 3 constants that map departments to integer values. 
- If you need to define a set of related constants, it often makes more sense to use an enumeration as shown later in the book.
*- When coding an abstract method in an interface, the public and abstract keywords are not needed. (Java automatically supplies these keywords for all methods).*
*- Similarly, Java automatically supplies the public, static, and final keywords for constants.*
<p style="text-align:center; font-style: italic; color:#00FFFF">The 4th example shows the code for an interface named Serializable.</p>
- This interface is available from the java.io package of the Java API, it's designed to let you identify objects that can be stored (serialized) and then later reconstructed (unserialized) for reuse.
- As an example, you might use this interface if you want to transport an object over a network or save an object to a disk. Since this interface contains no constants or methods, it is known as a tagging interface.