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
class ValidProduct5
{
public static void main(String args[])
{
IdComparator idc = new IdComparator();
CostComparator cc= new CostComparator();
List <Product> s= new ArrayList <Product>();
Product prd =new Product (10,20);
s.add(prd);
s.add(new Product(11,99));
s.add(new Product(6,36));
s.add(new Product(8,68));
for(Product p:s)
{
System.out.println(p.getPid()+" "+p.getPcost());
}
}
}