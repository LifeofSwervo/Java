Static methods can be called directly from the name of the class that contains the method.  Static methods are usually created to do utility operations.  For example:  
  
**public class Test{**  
     **public static int timesTwo(int value){**  
       **return value * value;  
     }**  
**}**  
  
**public class TestDriver{**  
     **public static void main(String[] args){**  
         **int var = Test.timesTwo(5);**  
        **System.out.println(var);**  
     **}**  
**}**  
  
For your final exercise, create a class called ManyLinkedLists.  It will contain a static method called createLinkedList().  That method takes an argument that is a constant defined in the ManyLinkedLists class.  The identifier of the constants should describe a type of linked list.  When the createLinkedList method is called, it should return a linked list object of the type identified by the constant.  
  
For example:  
  
**DoubleEndedList del = ManyLinkedLists.createLinkedList(ManyLinkedLists.DOUBLEENDEDLIST);**  
  
Give the createLinkedList method the ability to return the linked lists described below:

- A double-ended linked list.  That kind of linked list is described in chapter 5 of your text (starts on page 198).
- A doubly linked list.  That kind of linked list is described in chapter 5 of your text (starts on page 221).

  
Note that in order to create the above linked lists you will have to create something equivalent to the Link class from exercise 5A.  Use a long instance variable as the data within your link class or classes.  
Your project should contain any other classes you need.  Include a ManyLinkedListsDriver class that tests the ManyLinkedLists class, its method, and the data structures that the method can return.  The peculiar features of the two forms of linked list should be clearly demonstrated. 

[Previous](https://canvas.mccneb.edu/courses/49204/modules/items/3953081)