import java.io.*;
class TestInput6
{
public static void main(String [] args)
{
try
{
FileReader fr = new FileReader ("InputFile.txt");
BufferedReader br = new BufferedReader(fr);
FileWriter fw = new FileWriter("sourcefile.txt");
PrintWriter p = new PrintWriter(fw);
String str =br.readLine();
while (str != null)
{
{
p.println(str);
str = br.readLine();
}
p.flush();
p.close();
}
}
catch (Exception e)
{
  e.printStackTrace();
}
}
}