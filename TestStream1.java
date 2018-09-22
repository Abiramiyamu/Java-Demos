import java.io.*;
class TestStream1
{
public static void main(String args[])
{
try(FileInputStream	 input = new FileInputStream("sourcefile.txt");
FileOutputStream output = new FileOutputStream("target.txt");)
{
int temp;
while ((temp = input.read())!=-1)
{
output.write((byte)temp);
}
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
}