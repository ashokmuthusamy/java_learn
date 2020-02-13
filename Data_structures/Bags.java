public class Bags<data_type>{
    private Node<data_type> first_ele;
    private int size; 
    private static class Node<data_type>{
        private data_type  data;
        private Node<data_type> next_ele;
    }
    public Bags(){
        first_ele=null;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isempty(){
        return size==0;
    }
    public void add(data_type element){
        
        Node<data_type> oldfirst=first_ele;
         first_ele=new Node<data_type>();
        first_ele.data=element;
        first_ele.next_ele=oldfirst;
        size++;
    }
    public void show_ele(Node<data_type> start){
        while(start!=null){
        System.out.println(start.data);
        start=start.next_ele;
        }
     if(start==null){
        System.out.println("Null");
     }

    }
    public boolean contains(data_type element){
        Node<data_type> start=first_ele;
        while(start!=null){
            if(start.data.equals(element))
            {
                return true;
            }
            start=start.next_ele;
            }
            return false;
    } 
   
   
    public static void main( String [] args)
    {
        Bags<String> new_bag=new Bags();
        //new_bag.add("1");
       // new_bag.add("2");
       // new_bag.add("3");
        System.out.println("Bag is empty? "+new_bag.isempty());
        System.out.println("SIZE OF BAG IS "+new_bag.size());
        new_bag.show_ele(new_bag.first_ele);
        System.out.println(new_bag.contains("3"));

    }
}