//2. Implement an algorithm to delete a node in the middle of(i.e. any node but the first and last node, 
// not necessarily the exact middle) of a singly linked list, given only access to that node. 
// Example: input: node c, the linked list a->b->c->d->e->f, and return: a->b->d->e->f
import java.util.LinkedList;

public class removeMiddle{

    
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.push(3);
        linkedList.push(2);
        linkedList.push(5);
        linkedList.push(2);
        linkedList.push(1);
        linkedList.push(4);
        linkedList.push(3);

        System.out.println(linkedList);

        int listSize = linkedList.size();
        linkedList.remove(listSize/2);
        
        System.out.println(linkedList);

    }
    
}