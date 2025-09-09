
import java.util.LinkedList;

// 1. Remove duplicates from an unsorted linked list.

public class removeDuplicate{

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

        for(int i = 0; i < linkedList.size(); i++){
            for(int x = i+1; x < linkedList.size(); x++){
                if(linkedList.get(i).equals(linkedList.get(x))){
                    linkedList.remove(x);
                    x--;
                }
            }
        }

        System.out.println(linkedList);
    }   
    


}