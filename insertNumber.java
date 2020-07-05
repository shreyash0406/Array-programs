import java.util.Scanner;
public class insertNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a=sc.nextInt();
        int A[]=new int[a];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<a; i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the position where you have to insert the nummber");
        int p=sc.nextInt();
        System.out.println("Enter the number you have to insert");
        int n=sc.nextInt();
        for(int i=n-1; i<p-1; i--){
            A[i+1]=A[i];
        }
        A[p-1]=n;
        System.out.println("Array after inserting the array");
        for(int i=0; i<=a; i++){
            System.out.print(A[i]+"");
        }
    }
}