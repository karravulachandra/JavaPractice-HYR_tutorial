package POJO;

public class program1 {
public static void main(String[] args) {

	pojo p11=new pojo();
	p11.setId(10);
	p11.name="chandra";
	p11.salary=67768.8;
	pojo p110=new pojo();
	p110.setId(10);
	p110.name="chandra";
	p110.salary=67768.8; 
	pojo p111 = new pojo();
	p111.setId(10);
	p111.name="chandra";
	p111.salary=67768.8;
	
	pojo[] p=new pojo[] {p11,p110,p111};
	System.out.println("ID: " + p[0].getId() + ", Name: " + p[0].name + ", Salary: " + p[0].salary);

	
}
}
