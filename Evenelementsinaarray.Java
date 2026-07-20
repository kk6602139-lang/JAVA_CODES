import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);
  System.out.print("Enter the number of elements in s array:");
  int n=sc.nextInt();
  int[]arr=new int[n];
  for(int i =0; i<n;i++){
      System.out.print("Enter the"+(i+1)+"Elements:");
      arr[i]=sc.nextInt();
  }
  System.out.println("Even Elements are:");
  for(int i=0;i<n;i++)
  {
      if(arr[i]%2==0)
  {
      System.out.print(arr[i]+" ");
  }
  }
  }
}  
