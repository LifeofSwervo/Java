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
