- In unordered array's searching is slow..
- Ordered arrays suffer from slow insertion.
- Both have slow deletion.
- Size can't be changed after creation.

*Linked Lists are probably the 2nd most used general purpose storage structure after arrays.*
- You can use a linked list in many cases in which you use an array, unless you need frequent random access to individual items using an index.
- More simple than structures such as trees.

This Chapter Covers:
- Linked List
- Double-ended list
- Sorted List
- Doubly linked list
- List within iterators


## Links
- A link is an object with a name. In a linked list, each data item is embedded in a link. 
- Each link has a reference (typically called next) to the next link in the list. 
- ![[Pasted image 20231223182604.png]]
*- Here’s part of the definition of a class Link. It contains some data and a reference to the next link:*
![[Pasted image 20231225105020.png]]
- Class is sometimes called "self-referential", containing a field called next of the same type of itself. 

We show only two data items in the link: an int and a double. In a typical applica- tion there would be many more. A personnel record, for example, might have name, address, Social Security number, title, salary, and many other fields. Often an object of a class that contains this data is used instead of the items -
![[Pasted image 20231225105437.png]]

### References and Basic Types
- Being able to put a field of type Link inside the class definition of this same type may seem odd. Wouldn’t the compiler be confused? How can it figure out how big to make a Link object if a link contains a link and the compiler doesn’t already know how big a Link object is?

- The answer is that in a Java a Link object does not contain another Link object. The next field of type Link is only a reference to another link, not an object.

*(A reference is a number that refers to an object.)*
![[Pasted image 20231226223233.png]]

### Relationship, Not position.
- Let’s examine one of the major ways in which linked lists differ from arrays. In an array each item occupies a particular position. This position can be directly accessed using an index number. It’s like a row of houses: You can find a particular house using its address.

- In a list the only way to find a particular element is to follow along the chain of elements. It’s more like human relations. Maybe you ask Harry where Bob is. Harry doesn’t know, but he thinks Jane might know, so you go and ask Jane. Jane saw Bob leave the office with Sally, so you call Sally’s cell phone. She dropped Bob off at Peter’s office, so…but you get the idea. You can’t access a data item directly; you must use relationships between the items to locate it. You start with the first item, go to the second, then the third, until you find what you’re looking for.

### 