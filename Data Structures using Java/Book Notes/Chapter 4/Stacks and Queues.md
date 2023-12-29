
#### A different kind of structure

- Arrays, linked list, trees etc - Data structures are typically for records and inventories.
- The structures focused on in this chapter are programmer tools. 
- They’re primarily conceptual aids rather than full-fledged data storage devices. Their lifetime is typically shorter than that of the database-type struc- tures. They are created and used to carry out a particular task during the operation of a program; when the task is completed, they’re discarded.

#### Restricted Access
- In an array, any item can be accessed either immediately, or by searching through a sequence of cells until its found. 
- These structures on the other hand are restrict4ed. Only 1 item can be read or removed at a given time (Unless you cheat).
- The interface of these structures is designed to enforce this restricted access. Access to other items is (in theory) not allowed.

#### More Abstract
- Stacks, queues, and priority queues are more abstract entities than arrays and many other data storage structures. 
- They’re defined primarily by their interface: the permissible operations that can be carried out on them. The underlying mechanism used to implement them is typically not visible to their user.
- Underlying Mechanism for a stack can be an array, linked list, or a heap.

## Stacks
- Stacks allow access to one data item, the last inserted item. If removed, you can access the next to last item inserted..
- In this section we’ll see how a stack can be used to check whether parentheses, braces, and brackets are balanced in a computer program source file. 
- At the end of this chapter, we’ll see a stack playing a vital role in parsing (analyzing) arithmetic expressions such as 3*(4+5).
- Stacks also help algorithms when applied to certain data structures.
- Microprocessors use a stack based architecture, when a method is called, its return address and arguments are pushed into the stack. Upon returning they are popped off. 
- Older calculators use stacked based architecture. 