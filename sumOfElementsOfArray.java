import java.util.Scanner;
public class sumOfElementsOfArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of elements of the in the array");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            sum=sum+a[i];
        }
        System.out.println("The sum of all elements in the array: "+sum); 
    }
}