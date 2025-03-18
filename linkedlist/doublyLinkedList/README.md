# Doubly Linked List 

## Basics 
![img.png](img.png)


## 1. Delete a given node from DLL
Note: The node is not head/tail node 

![img_1.png](img_1.png)
```java
void deleteNode(Node node){
    
    // Iterate to the node you want to delete i.e temp in this case
    Node t1=temp.prev;
    Node t2=temp.next;
    
    t1.next=t2;
    t2.prev=t1;
    
    temp.next=null; // Not necessary good to have
    temp.prev=null; // Not necessary good to have
}
```
![img_2.png](img_2.png)

## 2. Insert a new node just before the tail of doubly linked list 

![img_3.png](img_3.png)

```java

void insertAtBack(Node newNode, Node tail){
    
    Node t1= tail.prev;
    newNode.next=tail;
    newnNode.prev=t1;
    t1.next=newNode;
    tail.prev=newNode;
}
```
![img_4.png](img_4.png)

# Memory hierarchy in computers

### LRU Cache
Regis: Registers are storing based on bits and are extremely fast in processing.
Cache: Cache is limited amount of storage and we need to have an algorithm to make this efficient storage.

**ALGO** -- LEAST  RECENTLY USED(LRU)

![img_5.png](img_5.png)

**Implementation of LRU**
![img_6.png](img_6.png)

_Steps_

- In the cache either the data can be present or missing.
- If the data(X) is present then we need to modify by deleting old data and inserting new element data as least recently used element.
- If data(X) is not present check the size of the cache. If the cache is available add the element.
- If cache is full, delete the least recently used element from first and insert element to the cache.
 
![img_7.png](img_7.png)

## _**Datastructures used for the above implementation and why**_

![img_8.png](img_8.png)
