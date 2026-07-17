import java .util.*;
class Main {
    public static void main(String[] args) {
       int n=5;
       pat(5);
    }
   static void pat(int K) 
   {
       if(K==0)
       {
           return;
       }
       System.out.println(K);
       K=K-1;
       pat(K);
       
       }
   }
