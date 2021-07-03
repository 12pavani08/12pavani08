import java.util.Scanner;
class Auto
{
  public static void main (String []args)
{
  int n,p=0,d=10;
  Scanner sc=new Scanner (System.in);
   System.out.println("enter a number");
    n=sc.nextInt();
    int k=n*n;
     While(p<n)
       {
          p=k%d;
           d=d*10;
        }
   {
      System.out.println(n+"is ana automorphic number");
   }
  else
{ 
    System.out.println(n+"is not an automorphic number");
}
}
}
       

