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
class IdComparator implements Comparator<Product>
{
public int compare(Product p1,Product p2)
{
if(p1.getPid()<p2.getPid())
{
return 1;
}
else if (p1.getPid()>p2.getPid())
{
return -1;
}
else
{
return 0;
}
}
}
class ValidProduct2
{
public static void main (String args[])
{
Set<Product> s=new HashSet <Product>();
s.add(new Product(10,35));
s.add(new Product(11,55));
s.add(new Product(4,15));
s.add(new Product(6,90));
for(Product p:s)
{
System.out.println(p.getPid()+""+p.getPcost());
}
}
}

