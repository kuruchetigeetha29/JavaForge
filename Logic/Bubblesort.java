import java.util.Arrays;
class BubbleSort 
{
    public static void main(String args[])
    {
      int arr[]={9,5,6,4,3,0};
      for(int i=0;i<arr.length-1;i++)
      {
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int swap=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=swap;
            }
        } 
      }
      System.out.println(Arrays.toString(arr));

    }
}