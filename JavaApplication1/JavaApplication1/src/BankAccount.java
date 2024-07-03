
import java.util.Scanner;

public class BankAccount {
  private int accNo;
  private String accHoldName;
  private double accBalance;

    public BankAccount(int accNo, String accHoldName, double accBalance) {
        this.accNo = accNo;
        this.accHoldName = accHoldName;
        this.accBalance = accBalance;
    }
    public void credit(double amount)
    {
        this.accBalance+=amount;
    }
    public String toString()
    {
        return "Account No: "+this.accNo+"\nAccount Holder's Name: "+this.accHoldName+"\nAccount Balance: "+this.accBalance;
    }
}
//    public static void main(String[] args) //    {
    //        Scanner scan=new Scanner(System.in);
    //        int n;
    //        System.out.println("Enter number of elements you want to enter");
    //        n =scan.nextInt();
    //        int arr[]=new int[n];
    //        for(int i=0;i<=n-1;i++)
    //        {
    //           System.out.printf("Enter element %d ",i+1);
    //           arr[i]=scan.nextInt();
    //        }
    //        System.out.println("------------Max Element-----------");
    //        int max;
    //        max=arr[0];
    //             for(int i=1;i<n;i++)
    //             {
    //                 if(arr[i]>max)
    //                 {  
    //                     max=arr[i];
    //                  System.out.printf("Max number is :%d \n",max);
    //                  System.out.printf("Index of max number is : %d \n",i+1);
    //                 }
    //             }
    //        System.out.println("------------Min Element-----------");
    //        int min;
    //        min=arr[n-1];
    //             for(int j=(n-1);j>=0;j--)
    //             {
    //                 if(arr[j]<min)
    //                 {  
    //                     min=arr[j];
    //                  System.out.printf("Min number is :%d \n",min);
    //                  System.out.printf("Index of min number is : %d \n",j);
    //                 }
    //             }
    //    }
//    {
//        int[][] mat1=new int[2][2];
//        mat1[0][0]=0;
//        mat1[0][1]=1;
//        mat1[1][0]=2;
//        mat1[1][1]=3;
//        int[][] matrix = new int[][]{{0, 1}, {2, 3}};
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(matrix[i][j]);
//                System.out.print(mat1[i][j]);
//            }
//            System.out.println("");
//        }
//    }
//              {
//                System.out.println(funct());
//            }
//            public static boolean funct()
//    {
//            String[] arr1 = new String[5];
//            String name="Isam";
//            arr1[2]="Isam";
//            if (arr1[2].equals(name))
//                return true;
//            else
//                return false;
//    }
//          
//            
//            
//}
