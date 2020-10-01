import java.util.*;
class search_int_float
{
  public static void main(String args[])
  {
    array a=new array();
    System.out.println("Enter the values of an int array");
    int a1[]=new int[5];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++)
    {
      a1[i]=sc.nextInt();
    }
    System.out.println("Enter the value of float array");
    float b[]=new float[5];
    for(int i=0;i<5;i++)
    {
      b[i]=sc.nextFloat();
    }
    a.read(a1);
    a.read(b);
    System.out.println("Enter a number which you want to search in int array");
    int i=sc.nextInt();
    a.search(i);
    System.out.println("Enter a number which you want to search in float array");
    float s=sc.nextFloat();
    a.search(s);
  }
}

class array
{
  int a[]=new int[5];
  float b[]=new float[5];
  void read(int a1[])
  {
    a=a1;
  }
  void read(float a1[])
  {
    b=a1;
  }
  void search(float a1)
  {
    int count=0;
    for(int j=0;j<5;j++)
    {
      if(b[j]==a1)
      {
        count++;
      }
    }
    System.out.println("Number is present "+count+" times");
  }
  void search(int j)
  {
    int count=0;
    for(int i=0;i<5;i++)
    {
      if(a[i]==j)
      {
        count++;
      }
    }
    System.out.println("Number is present "+count+" times");
  }
}
