This chapter attempts to explain data structures and algorithms and how they work.

- The subject of this book is data structures and algorithms.
A data structure is an arrangement of data in a computer’s
memory (or sometimes on a disk). Data structures include
arrays, linked lists, stacks, binary trees, and hash tables,
among others. Algorithms manipulate the data in these
structures in various ways, such as searching for a particular data item and sorting the data.

Types of problems these solve:
- Real-world data storage
- Programmer's Tools
- Modeling

### Real-world Data Storage
- A non-computer example of real-world data storage is a stack of 3-by-5 index cards.
- These cards can be used for a variety of purposes. If each card holds a person’s name, address, and phone number, the result is an address book. If each card holds the name, location, and value of a household possession, the result is a home inventory.

![[Pasted image 20231204225832.png]]
![[Pasted image 20231204225848.png]]


### Overview of Algorithms
- You need to know how to:
	- Insert a new data item.
	- Search for a specific item.
	- Delete a specific item.

(You may also need to know how to iterate through all the items in a data structure,
visiting each one in turn so as to display it or perform some other action on it.)


### Definitions

Database:
	- Used to refer to data being dealt with. As an
	  example, if you create an address book using index cards, these cards constitute a database. The term file is sometimes used in this sense.

Record:
	- Units in which a database is divided. In the index card analogy, each card represents a record. A record includes all the information about some entity, in a situation in which there are many such entities. A record might correspond to a person in a personnel file, a car part in an auto supply inventory, or a recipe in a cookbook file.

Field:
	- A record is divided into several fields. A field holds a particular kind of data. On an index card for an address book, a person’s name, address, or telephone number is an individual field.
	- More complex database programs use records with more fields (Figure 1.1 shows this, each line representing a distinct field.)
	- In Object-Oriented Languages (including Java), they are represented as objects. Individual variables in these objects would be the fields. Fields within a class object are called fields in Java (but members in some other languages such as C++).

![[Pasted image 20231206074832.png]]

Key: 
	- Keys are used to search record (similar to an ID).


#### Object-Oriented Programming
*(Following section is for people ignorant to OOP.)*

- OOP was invented because procedural languages, such as C, Pascal, and early
versions of BASIC, were found to be inadequate for large and complex programs.

*Main issues influencing this:*
- Lack of correspondence between the program and the real world.
- Internal organization of the program. 


#### Poor Modeling of the Real World 
- Conceptualizing a real-world problem using procedural languages is difficult. Methods carry out a task, while data stores information, but most real-world objects do both of these things. The thermostat on your furnace, for example, carries out tasks (turning the furnace on and off) but also stores information (the current temperature and the desired temperature).

- If you wrote a thermostat control program in a procedural language, you may end up with 2 methods, "furnaceOn()" and "furnaceOff()", but also 2 global variables - "currentTemp" and "desiredTemp". But these methods and variables wouldn't form any sort of programming unit. There would be no unit in the program you could call thermostat, this would only be in the coders mind. 
	- For larger programs with hundreds of entities this becomes chaotic. This required a better match of things in the program and things in the outside world.

#### Crude Organizational Units
*Another more subtle issue was the internal organization of a program.*
- Procedural programs are organized by dividing the code into methods. The issue with this is it focuses on methods at the expense of data. 
- To simplify, data could be local to a method or global, there was no way to specify that some methods could access a variable and others couldn't.
- This caused issues when several methods needed to access the same data. 
- As a solution to these issues objects arose in the community.

#### Objects
*The breakthrough with OOP is objects can hold methods and variables*

This better represents objects in the real world and allows more programs to work a lot easier.


#### Classes
- Classes were created as a result of the realization that you may want to make several objects of the same type. 
- Classes are blueprints for one or more objects.
![[Pasted image 20231206183748.png]]
- C programmers will recognize this syntax as similar to a structure, while C++ programmers will notice that it’s very much like a class in C++, except that there’s no semicolon at the end. (Why did we need the semicolon in C++ anyway?)

#### Creating Objects
- Specifying a class doesn't create an object of that class. To create the object in Java the "new" keyword would need to be used.
- At the same time an object is created, you need to store a reference to it in a variable of the same type as the class.
- Think of a reference as a name for an object
![[Pasted image 20231206183836.png]]


#### Accessing object methods
- Methods are typically use for interaction, the following example shows how a furnace would be turned on in OOP
![[Pasted image 20231206184025.png]]


#### To summarize 
- Objects hold both methods and fields (data) / variables.
- A class is a specification for any number of objects.
- To create an object, you can use the keyword new along with the classes name.
- Use a dot operator to invoke a method. 

#### A Runnable Object-Oriented Program
- Let’s look at an object-oriented program that runs and generates actual output. It
	features a class called BankAccount that models a checking account at a bank. The
	program creates an account with an opening balance, displays the balance, makes a
	deposit and a withdrawal, and then displays the new balance. Listing 1.1 shows
	bank.java.
![[Pasted image 20231206184709.png]]
![[Pasted image 20231206184808.png]]
![[Pasted image 20231206184820.png]]
*- There are 2 classes, BankAccount and BankApp.*
- BankAccount: Contains the fields and methods for our bank account.
- BankApp: Creates the account and displays the App.


#### Constructors 
- A constructor allows a new object to be initialized in a convenient way. Without the constructor in this program, you would have needed an additional call to deposit() to put the opening balance in the account.

#### Public and Private
- Private: A variable or method that is a private can be accessed only by methods that are part of the same class. 
- Public: A variable or method that is a public can be accessed any methods. (deposit(), withdrawal(), and displays() in this case.)
	- Variables are typically made private while methods are made public. This protects the variables from being adjusted by other methods. 
	- Any outside entity that needs to access data in a class must do so using a method of the same class. Data is like a queen bee, kept hidden in the middle of the hive, fed and cared for by worker-bee methods.

#### Inheritance and Polymorphism
- Inheritance: The creation of one class, called the extended or derived class, from another class called the base class. The extended class has all the features of the base class along with additional.
	- For example, a secretary class might be derived from a more general employee class and include a field called typingSpeed that the employee class lacked.
	- Inheritance is also called subclassing.
	- The base class may be called the super-class, and the extended class is the subclass.
	- Inheritance allows you to easily add features to an existing class and aids programs with many related classes.
	- This makes it easy to reuse classes for slightly different reasons.
	
- Polymorphism: Treating objects of different classes in the same way.
	- Meaning the classes must be derived from the same base class.
	- In practice, polymorphism usually involves a method call that executes different methods for objects of different classes. 
	- For example, a call to display() for a secretary object would invoke a display method in the secretary class, while the exact same call for a manager object would invoke a different display method in the manager class. Polymorphism simplifies and clarifies program design and coding.
	- For those not familiar with them, inheritance and polymorphism involve significant additional complexity. To keep the focus on data structures and algorithms, we have avoided these features in our example programs. Inheritance and polymorphism are important and powerful aspects of OOP but are not necessary for the explanation of data structures and algorithms.
	![[Pasted image 20231211092622.png]](Table 1.2)p. 26

##### Java Library Data Structures
- The java.util package contains data structure's, such as Vector, Stack, Dictionary and Hashtable.
- We will usually ignore these.