- These are data structures.

### Why use Binary Trees 
- Combines advantages of an ordered array and linked list.
- Can search, insert, and delete quickly. 

### Slow insertion in an Ordered Array
- Ordered arrays are extremely taxing to insert and delete. 

### Slow Searching in a Linked List
- Linked list on the other hand quickly insert and delete.
- Searching is not easy. The list must be searched in chronological order, until the intended element is found. 
- Ordered linked list do not work as elements cannot be accessed out of order (of the links in the list).
- (Ordered linked list still is typically better for the organization provided.)

### What is a Tree?
- Tree's consist of nodes connected by edges. 
- (In the example nodes are circles, while the edges are lines.)
- Trees have been studied extensively as abstract mathematical entities, so there’s a large amount of theoretical knowledge about them. 
- A tree is actually an instance of a more general category called a graph. (Visit Chapter 14.)
![[Pasted image 20240119113133.png]]
- Nodes are often entities.
- Lines are the way the nodes relate.
- Generally there is 1 node at the top and the amount steadily increases the further down the tree you go.
- In a binary tree each node has a max of 2 children.
- More general trees are called multiway trees. (Chapter 10)


### Tree Terminology
![[Pasted image 20240119175125.png]]

### Path
- Think of a person going from node to node along the edges. This resulting sequence is called a path.

### Root
- Node at the top of the tree (1st node) is the root.
- There is only one root in a tree. For a collection of nodes and edges to be defined as a tree, there must be one (and only one!) path from the root to any other node.
- (Following example of a non-tree, violating this rule.)

### Parent 
- Any node is a parent when it has exactly 1 edge running upward to another node. The node above it is called the parent node. (Except the root)

### Child
- Any node may have 1 or more lines running downward to other nodes. These nodes below a given node are called its children. 

### Leaf
- A node with no children is a leaf node. There can only be 1 root in a tree but many leaves.

### Subtree
- Any node may be considered to be the root of a subtree, this consist of it's children and it's children's children.
- A node's subtree contains all of it's decadents.

### Visiting
- A node is visited when program control arrives at the node. This would be considered in the event an operation is performed. 
- Just passing over a node on the path from 1 node to another in not considered "visiting" the node.

### Traversing
- To traverse a tree is to visit all nodes in a specified order. 

### Levels
- The level of a node refers to how many generations the node is from the root.

### Keys
- We've seen that one data field typically designated to key value. Used to search for the item.

### Binary Trees
- These are the most simple and common forms of trees
- The 2 children are called leftChild and rightChild.
- (No children make it a leaf).
	##### Binary Search Tree
- The defining characteristic of a binary search tree is this: A node’s left child must have a key less than its parent, and a node’s right child must have a key greater than or equal to its parent.

### An Analogy
- 
