import java.util.*;
class TestDeque1
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
de.pollLast();
System.out.println(de);
de.pollLast();
}
}