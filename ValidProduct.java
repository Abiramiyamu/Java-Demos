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
class ValidProduct
{
public static void main(String args[])
{
Set<Product> s= new HashSet <Product>();
s.add(new Product(10,35));
s.add(new Product(11,55));
s.add(new Product(4,15));
s.add(new Product(6,90));
for(Product p:s)
{
System.out.println(p.getPid()+" "+p.getPcost());
}
}
}


