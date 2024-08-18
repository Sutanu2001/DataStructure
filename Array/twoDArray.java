import java.util.Scanner;
public class twoDArray {
    public static void main(String[]args){
        int i,j,k,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array\n");
        int n= sc.nextInt();
        int m = sc.nextInt();
        int arr[][]=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        System.out.println("The Array : \n");
        for(k=0;k<n;k++){
            for(x=0;x<m;x++){
                 System.out.println(arr[k][x]);
            }
        }
        //col count
        System.out.println(arr[0].length);
           
    }
}
