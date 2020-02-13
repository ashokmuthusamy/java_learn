//implementation ispired from https://codepumpkin.com/selection-sort-algorithms/
public class SelectionSort{
    int [] array;
    int sorted_index=0;
    int minimum_index;
    int size_of_array;
    public static void main ( String [] args){
        int [] sam={4, 23, 6, 78, 1, 54, 231, 9, 12};;
        SelectionSort sg= new SelectionSort();
        sam=sg.SelectionSort(sam);

        System.out.print("Sorted_array-");
        for(int i=0;i<sam.length;i++){
            System.out.print(sam[i]+" ");
        }
           
    }
    public int[] SelectionSort(int [] array){
       this.array=array;
       size_of_array=this.array.length;
       minimum_index=0;
       //Loop to traverse through array
       while(sorted_index<size_of_array){
        //setting the boundary to start since we dont to caompute min for sorted part
        minimum_index=sorted_index;
        for(int i=sorted_index;i<size_of_array;i++){
            //compute min_ele index in unsorted part of array
            minimum_index=(array[minimum_index]>array[i])?i:minimum_index;
           
        }
        
   if(minimum_index!=sorted_index){
    swap(minimum_index,sorted_index);}
    sorted_index++;
    }
   return array;
    }
   
    public void swap(int temp,int temp1){
        int swap=array[temp];
        array[temp]=array[temp1];
        array[temp1]=swap;
    }
  
}