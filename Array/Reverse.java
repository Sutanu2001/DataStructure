public class Reverse {
    public static void main(String[]args){
        int arr[] = {14,5,9,12,25,15};
        int k, i=0, j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(k=0;k<arr.length;k++){
            System.out.println(arr[k]+"");
        }
    }
}
