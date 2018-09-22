import java.io.*;
class TestInput2
{
public static void main(String args[])
{
try{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Enter the First value:");
Float a = Float.parseFloat(br.readLine());
System.out.println("Enter the Second value:");
Float b = Float.parseFloat(br.readLine());
Float c = a+b;
System.out.println("The result is :"+c);
}
catch(Exception ex)
{
}
}
}