public class BubbleSort{
    int [] array;
    public static void main(String [] args){
        int [] sam={4, 23, 6, 78, 1, 54, 231, 9, 12};
        BubbleSort bb=new BubbleSort();
        bb.BubbleSort(sam);
        System.out.print("Sorted_array-");
        for(int i=0;i<sam.length;i++){
            System.out.print(sam[i]+" ");
        }

    }
public int [] BubbleSort(int[] array){
    this.array=array;
    int size=array.length;
    boolean flag=false;//to check whwther the array is sorted by checking does the swap function called or not 
    //since if swap not called then the array will be sortet
    while(!flag){
        flag=true;
        for(int i=0;i<size-1;i++){
            if(array[i]>array[i+1]){
                swap(i,i+1);
                flag=false;
            }
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