import java.util.Scanner;
public class arrayInReverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Before reversing the array");
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
        System.out.println("After reversing the array");
        for(int i=n-1; i>=0; i--){
            System.out.println(a[i]);
        }
    }
}