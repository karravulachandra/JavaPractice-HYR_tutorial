package POJO;

public class pojo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//plain old java object.
		//which is not bound by any special restriction.
		//must be in public 
		// variables must be in private for improved security
		//it can have setter and getter
		//shouldn't have implement any interfaces
		//shouldn't extend any classes.
		//shouldn't have any annotation.
		
//pojo class dont have main method.
		//pojo p=new pojo();
		//p.setId(10);
		
	//}
	
	private int id;
	public String name;
	protected double salary;
	//public pojo(int id){
		//this.id=id;
	//}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
}
