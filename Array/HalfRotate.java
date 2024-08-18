public class HalfRotate {
    public static void main(String[]args){
        int arr[][]={{2,4,6,8},{3,5,9,11},{10,13,16,17},{12,15,18,21}};
        Rotate(arr);
    }
    public static void Rotate(int arr[][]){
        int i,j;
        for(i=0;i<arr.length; i++){
            for(j=arr[0].length-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
              
            }
            System.out.println();
        }
        
    }
}
