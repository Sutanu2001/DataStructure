public class Transpose{
    public static void main(String[]args){
        //for diagonal matrix
        int arr[][]=
        {{4,8,12,24},
        {5,10,15,20},
        {3,9,11,17},
        {6,13,21,25}};
        matrix(arr);
    }
    public static void matrix(int arr[][]){
        int i,j;
        for (i=0;i<arr.length;i++){
            for (j=0;j<i;j++){
                int temp = arr[i][j];
                arr[j][i]=arr[i][j];
                arr[i][j]= temp;
            }
        }
        System.out.println("Transverse of the matrix is : ");
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}