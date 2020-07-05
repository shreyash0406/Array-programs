import java.util.Scanner;
public class mergeArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array A");
        int a=sc.nextInt();
        System.out.println("Enter the size of the array B");
        int b=sc.nextInt();
        int A[]=new int[a];
        int B[]=new int[b];
        System.out.println("Enter the elements of the array A");
        for(int i=0; i<a; i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the array B");
        for(int i=0; i<b; i++){
            B[i]=sc.nextInt();
        }
        int max=a+b;
        int merge[]=new int[max];
        for(int i=0; i<a; i++){
            merge[i]=A[i];
        }
        for(int i=0; i<b; i++){
            merge[i+a]=B[i];
        }
        for(int i=0; i<max; i++){
            System.out.print(merge[i]+" ");
        }
    }
}