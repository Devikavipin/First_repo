package stringprogram;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


String s = "Hello";
String s1 = new String("Hai devu");
System.out.println(s);
System.out.println(s1) ;
//length()-to find length of strings
System.out.println(s1.length());
//contains()- check whether a character is present on string,return true if value,character is true
System.out.println(s1.contains("age"));
//concat()-combine two strings,add 1 string at the end of another
System.out.println(s1 .concat(s));
System.out.println(s1);
//char At()- to return the charcter of string based on index
System.out.println(s1.charAt(4));
String g = "Hello";
String m = "hello";
String t = "NAME";
String u = "";
//equal ignore case() -to ignore case not content true return if equal return true else false
System.out.println(s.equals(g));
System.out.println(m);
System.out.println(t);
//equals ignore case()-to ignore case not content,true return if same
System.out.println(g.equalsIgnoreCase (m));
	//touppercase()-to change or convert lowercase letters to capital
System.out.println(m.toUpperCase());
//tolowercase()-to  convert uppercase letters to lowercase
System.out.println(m.toLowerCase());
//isempty()-tocheck the string is empty or not,if empty true return
System.out.println(t.isEmpty());
System.out.println(u.isEmpty());
//value of()-to convert any datatype to string
int a = 5;
System.out.println(String.valueOf(a));
//trim()-remove the leading and trailing space from atring
String k= " hi this is a code";
System.out.println(k.trim());
System.out.println(s==g);
System.out.println(s.equals(g));
String d =new String ("Hello");
System.out.println(s.equals(d));
System.out.println(s==d);//if we use "equal"opertor it checks the objects reference  so it is false
String o = new String("hello");
System.out.println(d==o);//return false because it store in different memory location
	}
}

	