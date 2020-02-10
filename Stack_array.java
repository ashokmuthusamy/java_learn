public class Stack_array<data_type>{
    public static void main(String [] args)
     {
         Stack_array<Integer> myStackArray=new Stack_array(4);//push pop is empty is full resize empty peek
         

        // Populate the stack
        myStackArray.push(5);
        myStackArray.push(8);
        myStackArray.push(2);
        myStackArray.push(9);

        System.out.println("*********************Stack Array Implementation*********************");
        System.out.println(myStackArray.isEmpty()); // will print false
        System.out.println(myStackArray.isFull()); // will print true
        System.out.println(myStackArray.peek()); // will print 9
        System.out.println(myStackArray.pop()); // will print 9
        System.out.println(myStackArray.peek()); // will print 2

    }
    public static final int CAPACITY_D=20;
    public int sizeOfStack;
    private int top=-1;
    public data_type[] stack;
    public Stack_array(){
        this(CAPACITY_D);
    }
    public Stack_array(int size){
       stack=(data_type[]) new Object[size];
       sizeOfStack=size;
    }
    public void push(data_type ele){
        if(!isFull()){
        stack[++top]=ele;}
        else{
        System.out.println("Stack overflow");
        }

    }
    
    public data_type pop(){
        if(!isEmpty()){
          
            return stack[top--];
        }
        else{
            System.out.println("Stack already empty");
            return null;
        }

    }
    public boolean isEmpty(){
               return top==-1;
    }
    public boolean isFull(){
        
        return top==(sizeOfStack-1);
    }
    public data_type peek(){
        if(!isEmpty()){
            return stack[top];
        }
        else{
            System.out.println("Stack Empty!");
            return null;
        }
        
    }
    public void  resize(int size){
        data_type [] new_arr=(data_type[]) new Object[size];
        for(int i=0;i<top+1;i++){
            new_arr[i]=stack[i];
        }
        stack=new_arr;
        
    }
    public void  makeEmpty(){
           top=-1;
        
    }

}