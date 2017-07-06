# re7
import java.io.*;
import java.util.*;
public class Even
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    
    
    int i;
    int a,b;
    System.out.println("Enter a range even number");
    b=sc.nextInt();
    a=sc.nextInt();
    
    for( i=a; i<=b; i++)
    {
      if(i%2==0)
      {
        System.out.println(i);
      }
    }
  }
}
