package CollectionsPractice;
import java.util.*; 
public class Vpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add("chandra");
		v.add(76);
		v.add("chandra");
		v.add(77);
		v.add(1,"andra");
		v.add(78);
		Vector v2=new Vector();
		v2.add("buddy");
		v2.add("79");
		v2.add("Tanu");
		System.out.println(v);
		System.out.println(v2);
		/*
		 * for(int i=0;i<v2.size();i++) { v.add(v2.get(i)); }
		 */
		v.addAll(2,v2);
		System.out.println();
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.get(2)); 
		v.remove(0);
		System.out.println(v);
		v.removeAll(v2);
		System.out.println(v);
	}

}
