//optimum code can be written by checking ele in loop from current_ele-1 upto it doent swap i got idea after finished just give a shot to it this optimum due to unwanted swap
public class InsertionSort{
    int [] array;
    public static void main(String [] args){
        int [] sam={4, 23, 6, 78, 1, 54, 231, 9, 12};
        InsertionSort bb=new InsertionSort();
        bb.InsertionSort(sam);
        System.out.print("Sorted_array-");
        for(int i=0;i<sam.length;i++){
            System.out.print(sam[i]+" ");
        }

    }
public int [] InsertionSort(int[] array){
    this.array=array;
    int size=array.length;
     for(int current_index=1;current_index<size;current_index++){//traversal of each element in array and kewp track of sorted array
         int i=0;
         //in the loop wwe check the current element with all elment in sorted array ie upto ele current_index
         while(i<current_index){
             if(array[current_index]<array[i]){
                 //if current ele is small swap occurs 
                 swap(current_index,i);  
                 current_index=i;     
             }
                i++;
         }
     }
return array;

}
public void swap(int temp,int temp1){
    int swap=array[temp];
    array[temp]=array[temp1];
    array[temp1]=swap;
}
}