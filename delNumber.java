import java.util.Scanner;
public class delNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a=sc.nextInt();
        int A[]=new int[a];
        boolean found =false;
        int pos=0;
        System.out.println("Enter the elements of the array");
        for(int i=0; i<a; i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be deleted");
        int n=sc.nextInt();
        for(int i=0; i<a; i++){
            if(A[i]==n){
                found=true;
                pos=i;
                break;
            }
        }
        if(found){
            for(int i=pos; i<a-1; i++){
                A[i]=A[i+1];
            }
        }
        else{
            System.out.println("element not found in the array");
        }
        System.out.println("Array after deletion of the array");
        for(int i=0; i<a-1; i++){
            System.out.print(A[i]+"");
        }
    }
}