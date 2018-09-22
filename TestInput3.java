import java.io.*;
class TestInput3
{
public static void main(String args[])
{
try{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Enter the First value:");
Double a = Double.parseDouble(br.readLine());
System.out.println("Enter the Second value:");
Double b = Double.parseDouble(br.readLine());
Double c = a+b;
System.out.println("The result is :"+c);
}
catch(Exception ex)
{
}
}
}