import java.io.*;
class TestInput7
{
public static void main(String args[])
{
try
{
File f = new File("sourcefile.txt");
System.out.println(f.getName());
System.out.println(f.getAbsolutePath());
System.out.println(f.getParent());
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
}
