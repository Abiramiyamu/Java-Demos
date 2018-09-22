import java.io.*;
class TestInput1
{
public static void main(String args[])
{
try{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Enter the First value:");
int a = Integer.parseInt(br.readLine());
System.out.println("Enter the Second value:");
int b = Integer.parseInt(br.readLine());
int c = a+b;
System.out.println("The result is :"+c);
}
catch(Exception ex)
{
}
}
}