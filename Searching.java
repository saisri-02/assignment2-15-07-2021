import java.util.*;
public class Searching
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size : ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements : ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter element to search : ");
int m=sc.nextInt();
int f=0;
for(int i=0;i<n;i++)
{
if(a[i]==m)
{
f=1;
System.out.println("Element found");
break;
}
}
if(f==0)
{
System.out.println("Element not found ");
}
}
}

output:

Enter array size : 
6
Enter array elements : 
1 3 5 2 4 6
Enter element to search : 
4
Element found