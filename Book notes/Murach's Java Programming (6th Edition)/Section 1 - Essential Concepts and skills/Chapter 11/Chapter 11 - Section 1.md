
# An introduction to interfaces

*- In Java a class can only inherit on other class. For example, the Book class in the previous chapter directly inherits the Product class. This result in it directly inheriting the Object class. Although this works well for some types of inheritance hierarches, it isn't flexible enough for all designs.*

*- To get around this Java has "interface". An interface is similar to an abstract class, however a class can inherit multiple interfaces. Allowing more flexibility.*

## A simple interface 
![[Pasted image 20231104210204.png]]
This illustrations displays how to create and use an interface. 

*- The 1st example shows the codes for a simple interface named Printable. This code is similar to the code that defines a class and is stored in a file named Printable.*
- The code for an interface uses the " interface " keyword rather than class. 
- All methods in an interface are public and abstract by default. As a result, you don't need to code the public or abstract keywords for the methods. 
*- The 2nd examples shows a Product class that implements the Printable interface.*
- The first few statements declare the variables followed by the creation of the Product.
- The body of the Product class implements the print() method that's created in the Printable Interface. 
*- The 3rd example that a Product object that implements the Printable interface can be stored in a variable of the Printable type. This means an object created from the Product class shown in this figure is both a Product object and a Printable object. Resulting in it being able to be used anywhere a printing object is.*

## Interfaces compared to abstract classes
*- This example shows the similarities and differences of abstract classes and interfaces.*
![[Pasted image 20231105105050.png]]
*- They are similar in some ways, in all versions of Java, an abstract class can also define and use other types of fields such as instance variables, and it can define regular methods and static methods. Interfaces cannot do this. *
- To illustrate, suppose you want to create several types of products such as books, software, and music albums. Also assume you want each product to have a print() method, printing info about each product type.
- You could implement this hierarchy using inheritance, with an abstract Product class at the top of the hierarchy and Book, Software, and Album classes that extend the Product class. Then, the Product class would provide features common to all products, such as their code, description and price. 
- The Product class would declare an abstract print() method and the Book, Software and Album classes would provide their own implementations of this method. 
<span style="color:#00FFFF">- The drawback of this method is that there are undoubtedly other objects in the app that use these classes that can be printed as well. For example, objects such as invoices and customers have info that can be printed. Obviously, these objects wouldn't inherit the abstract Product class, so they would need to define their own print() methods.</span>
*- In contrast, if you created a Printable interface like the example, it could be implemented by any class that represents an object that can be printed.*
- This enforces consistency inside of an application, guaranteeing that any Printable object will be printed using a method named print( ).
- Without the interface, some printable objects might use a method called print(), while others might use methods with names like display() or show().
*- A interface fines a Java type, any object that implements an interface is marked as that interface type.*
- As a result, an object that's created from a Book class that extends the Product class and implements the Printable interface is not only an object of the book type and of the Product type, but also an object of the Printable type. 
- Meaning you can use the object, or any other object that implements the Printable interface, wherever a Printable type is called for.