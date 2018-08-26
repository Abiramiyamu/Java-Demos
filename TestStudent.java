
class Student 
{
	int stdId;
	int stdAge;
	public void study()
	{
		System.out.println("Student Id:"+stdId+""+"studies");
	}
}
public class TestStudent {

	public static void main(String[] args) {
	 Student S1=new Student();
	 S1.stdId=100;
	 S1.study();

	}

}
