public class Sum_Array {
    public static void main(String[]args){
        int i, sum=0;
        int arr[]= {5,8,10,23,4,7};
        System.out.println(arr.length);
        for(i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
