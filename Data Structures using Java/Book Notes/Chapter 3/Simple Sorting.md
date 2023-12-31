[Source](https://www.javatpoint.com/bubble-sort-in-java)
- Typically after creating a database you will need to sort it. This may also be a necessity if you intend to search data.

*- Sort Algorithms focused on:*
- Bubble Sort.
- Insertion Sort.
- Selection Sort.


##### How would you do it?
- Imagine that your kids-league baseball team (mentioned in Chapter 1, “Overview”) is lined up on the field, as shown in Figure 3.1. The regulation nine players, plus an extra, have shown up for practice. You want to arrange the players in order of increasing height (with the shortest player on the left) for the team picture. How would you go about this sorting process?
![[Pasted image 20231211225158.png]]
- As a human being, you have advantages over a computer program. You can see all the kids at once, and you can pick out the tallest kid almost instantly. You don’t need to laboriously measure and compare everyone. Also, the kids don’t need to occupy particular places. They can jostle each other, push each other a little to make room, and stand behind or in front of each other. After some ad hoc rearranging, you would have no trouble in lining up all the kids, as shown in Figure 3.2.
- A computer program isn’t able to glance over the data in this way. It can compare only two players at one time because that’s how the comparison operators work. This tunnel vision on the part of algorithms will be a recurring theme. Things may seem simple to us humans, but the algorithm can’t see the big picture and must, therefore, concentrate on the details and follow some simple rules.

*Central steps of 3 algorithms:*
- 1. Compare 2 items.
- 2. Swap 2 items, or copy 1 item. 


### Bubble Sort

#### Source:
- Array traversed from first element to last. If current element is greater than the next element, they are swapped. 


#### Book:
- Slow, Simple, Good Beginner Algorithm.
##### Bubble Sort on the Baseball Players
- Imagine that you’re near-sighted (like a computer program) so that you can see only two of the baseball players at the same time, if they’re next to each other and if you stand very close to them. Given this impediment, how would you sort them? Let’s assume there are N players, and the positions they’re standing in are numbered from 0 on the left to N-1 on the right.
- Start at end of and compared 2 kids at index 0 and index 1.
- If the one on the left (in 0) is taller, you swap them. If the one on the right (in 1) is taller you don't do anything. 
- Move on to the next index, (in this case 1 and 2.)
![[Pasted image 20231211230144.png]]

##### Java Code for a Bubble Sort

![[Pasted image 20231211230549.png]]
![[Pasted image 20231211230627.png]]
![[Pasted image 20231211230655.png]]


### Selection Sort
#### Source:
- Search for the lowest element and arrange it to the proper location. 
![[Pasted image 20231214111224.png]]


#### Book:
*Improves on the bubble sort by reducing the number of swaps necessary* from *O(N*²) to O(N). Unfortunately, the amount of comparisons remains O(N²).

- Let’s consider the baseball players again. In the selection sort, you can no longer compare only players standing next to each other. Thus, you’ll need to remember a certain player’s height; you can use a notebook to write it down. A magenta-colored towel will also come in handy.

##### A Brief Description
- What’s involved in the selection sort is making a pass through all the players and picking (or selecting, hence the name of the sort) the shortest one. This shortest player is then swapped with the player on the left end of the line, at position 0. Now the leftmost player is sorted and won’t need to be moved again. Notice that in this algorithm the sorted players accumulate on the left (lower indices), whereas in the bubble sort they accumulated on the right.
- Next time you pass down the row of players, you start at position 1, and after finding the minimum, swap with position 1. Repeats until all are sorted.

##### A more detailed description
![[Pasted image 20231212085335.png]]

##### Java Code for Selection Sort

![[Pasted image 20231212112354.png]]
- The listing for the selectSort.java program is similar to that for bubbleSort.java, except that the container class is called ArraySel instead of ArrayBub, and the bubbleSort() method has been replaced by selectSort(). Here’s how this method looks:


### Insertion Sort

#### Source:
- Good for small elements because it takes more time for sorting larger number of elements
![[Pasted image 20231214110910.png]]

- Insertion sort works similar to the sorting of playing cards in hands. It is assumed that the first card is already sorted in the card game, and then we select an unsorted card. If the selected unsorted card is greater than the first card, it will be placed at the right side; otherwise, it will be placed at the left side. Similarly, all unsorted cards are taken and put in their exact place.
- The same approach is applied in insertion sort. The idea behind the insertion sort is that first take one element, iterate it through the sorted array. Although it is simple to use, it is not appropriate for large data sets as the time complexity of insertion sort in the average case and worst case is **O(n2)**, where n is the number of items. Insertion sort is less efficient than the other sorting algorithms like heap sort, quick sort, merge sort, etc.

*Advantages:*
- Simple
- Efficient for small data sets
- Adaptive

##### Algorithm
- 1. If the element is the 1st, assume it is sorted. Return 1.
- 2. Store the next element in a key.
- 3. Compare the key with all elements in the sorted array.
- 4. If the element in the sorted is smaller than the current element, move to the next element. Otherwise, shift the greater elements towards the right of the array.
- 5. Insert the value.
- 6. Repeat until array is sorted.