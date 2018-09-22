import java.io.*;
class TestInput5
{
public static void main(String [] args)
{
try
{
FileReader fr = new FileReader ("InputFile.txt");
BufferedReader br = new BufferedReader(fr);
String str =br.readLine();
while (str != null)
{
System.out.println(str);
str = br.readLine();
}
}
catch (Exception e)
{
  e.printStackTrace();
}
}
}