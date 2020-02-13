import java.util.NoSuchElementException;    
 public class Stack_linkedlist<data_type>{
     private  Node<data_type> head;
     private int size;
     public static void main (String [] args){
         Stack_linkedlist<Integer> stack=new Stack_linkedlist();//push pop isempty peek
         stack.push(1);
         stack.push(2);
         stack.push(3);
         stack.push(4);
         stack.push(5);
 
         System.out.println(stack);
 
         System.out.println("Size of stack currently is: " + stack.getSize());
 
         assert stack.pop() == 5;
         assert stack.pop() == 4;
 
         System.out.println("Top element of stack currently is: " + stack.peek());
         stack.printStack(stack.head);
     }
public static class Node<data_type>{
        private data_type data;
         private Node<data_type> next;
         public Node(data_type temp){
             data=temp;
             next=null;
         }
}
public Stack_linkedlist(){
    head=null;
    size=0;
}

public void push(data_type temp){
    Node<data_type> tempNode=head;
    head=new Node<data_type>(temp);
    head.next=tempNode;
    size++;

}
public data_type pop (){
    if(isempty()){
        throw new NoSuchElementException("Empty stack. Nothing to pop");
    }
    data_type temp=head.data;
    head=head.next;
    size--;
    return temp;
}
public boolean isempty(){
    return size==0;
}
public data_type peek(){
    if(isempty()){
        throw new NoSuchElementException("Empty stack. Nothing to peek");
    }
    return head.data;
}
public int getSize(){
    return size;
}
public void printStack(Node<data_type> head){
    while(head!=null){
        System.out.print(head.data+"-->");
        head=head.next;
    }
    System.out.println("end");
}
 }