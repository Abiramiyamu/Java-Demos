import java.io.*;
class TestInput
{
public static void main(String args[])
{
try{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Enter the First value:");
String str1 = br.readLine();
System.out.println("Enter the Second value:");
String str2 = br.readLine();
System.out.println("Welcome"+str1+" "+str2);
}
catch(Exception ex)
{
}
}
}