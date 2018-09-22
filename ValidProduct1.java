import java.util.*;
class Product
{
private int pid;
private int pcost;
public Product(int pid,int pcost)
{
this.pid=pid;								
this.pcost=pcost;
}
public int getPid()
{
return pid;
}
public int getPcost()
{
return pcost;
}
}
class ValidProduct1
{
public static int main(String args[])
{
List s = new ArrayList();
Product prd = new Product(10,30);
s.add(prd);
s.add(new Product(11,55));
s.add(new Product(4,400));
s.add(new Product(14,15));
for(Object o:s)
{
Product P= (Product)
System.out.println(P.getPid()+""+P.getPcost());
}
}
}