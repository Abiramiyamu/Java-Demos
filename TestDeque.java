import java.util.*;
class TestDeque
{
public static void main(String args[])
{
Deque<String> de = new LinkedList();
de.add("vinoth");
de.add("raji");
de.add("john");
de.add("abi");
de.add("arabi");
System.out.println(de);
de.remove();
System.out.println(de);
de.remove();
}
}