import java.util.Scanner;
class Calculator
{
public static int add(int a,int b)
{
int c=a+b;
System.out.print(" sum is:");
return c;
}
public static int sub(int a,int b)
{
int c;
if(a>b)
{
c=a-b;
}
else
{
c=b-a;
}
System.out.print(" sub is:");
return c;
}
public static int mul(int a,int b)
{
int c=a*b;
System.out.print(" multipication is:");
return c;
}
public static int div(int a,int b)
{
int c=a/b;
System.out.print(" div is:"+c);
return c;
}
public static int mod(int a,int b)
{
int c=a%b;
System.out.print(" mod is:");
return c;
}
public static void main(String[]args)
{
System.out.println("Welcome to calculator");
Scanner sc=new Scanner(System.in);
int i=1;
while(i>0)
{
System.out.println("===============================");
System.out.println("Enter 1 for Addition");
System.out.println("Enter 2 for Subtraction");
System.out.println("Enter 3 for Multipication");
System.out.println("Enter 4 for division");
System.out.println("Enter 5 for Modulus");
System.out.println("Enter Anyother to Exit");
System.out.println("===============================");
int in=sc.nextInt();
if(in==1)
{
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
System.out.println(add(a,b));
}
else if(in==2)
{
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
System.out.println(sub(a,b));
}
else if(in==3)
{
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
System.out.println(mul(a,b));
}
else if(in==4)
{
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
System.out.println(div(a,b));
}
else if(in==5)
{
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
System.out.println(mod(a,b));
}
else
{
break;
}

}
}
}






















