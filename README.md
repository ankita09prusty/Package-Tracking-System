# Package-Tracking-System
This Java code implements a method to detect cycles in a linked list. It utilizes a HashSet to keep track of visited nodes while traversing the list. The hasCycle method returns true if a cycle is detected, and false otherwise. The main method demonstrates the functionality by creating two linked lists, one with a cycle and one without, and prints the detection results.

Import HashSet class:
Import java.util.HashSet to use HashSet for storing visited nodes.

Define ListNode class:
Define ListNode class with an integer value val and a reference to the next node next.

Create a HashSet:
Create a HashSet named visited to store visited nodes.

Traverse the linked list:
Use a while loop to iterate through the linked list.
Check if the current node is null. If so, exit the loop.

Check for cycle:
If the current node is already present in the HashSet, it indicates a cycle. Return true.
Otherwise, add the current node to the HashSet.

Move to the next node:
Update the current node to the next node in the linked list.

Return false if no cycle found:
If the loop completes without finding a cycle, return false.

