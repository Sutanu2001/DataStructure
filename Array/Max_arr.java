public class Max_arr {
    public static void main(String[]args){
        int arr[] = {5,8,45,23,9,65,36};
        int i, max=arr[0];
        for (i=0;i<arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
