import java.util.Scanner;
public class findNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        boolean find=true;
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number which you have to find");
        int num=sc.nextInt();
        for(int i=0; i<n; i++){
            if(num==a[i]){
                find=true;
                break;
            }
        }
        if(find==true){
            System.out.println(num+" found in the array");
        }
        else{
            System.out.println(num+" not found in the array");
        }
    }
}