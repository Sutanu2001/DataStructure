public class subarray {
    public static void main(String[]args){
        int arr[]={52,12,45,32,15};
        int k,start, end;
        for(start=0; start<arr.length; start++){
            for(end=start; end<arr.length; end++){
                for(k=start;k<=end;k++){
                    System.out.println(arr[k]);
                }
                System.out.println();
            }
        }
    }
}
