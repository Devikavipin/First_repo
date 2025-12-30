package stringprogram;

public class BufferBuilder {

	public static void main(String[] args) {
	StringBuffer a1 = new StringBuffer("Hello world");
	System.out.println(a1);
	StringBuilder a2 = new StringBuilder ("hi");
	System.out.println(a2);
	//insertof ()- to insert anything in string based on index position
	a1.insert(5,"cute");
	System.out.println(a1);
	//append()- to add new string at last 
	a1.append("nice");
	System.out.println(a1);
	//replaceof()-to replace a particular word or string base on index position so we give index of start and end
	a1.replace(6,13,"complete");
	System.out.println(a1);
	//reverse ()-to find reverse of string
	a1.reverse();
	System.out.println(a1);
	//delete ()-to delete variable  based on index position
	a1.delete(6, 14);
	System.out.println(a1);
	}
}

