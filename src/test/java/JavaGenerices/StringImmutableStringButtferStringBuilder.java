package JavaGenerices;

public class StringImmutableStringButtferStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "JavaK";
		str.concat("Programing");  // str will have javaK Programing , next line it will loose it

		System.out.println(str.indexOf('v'));  // output 2
		System.out.println(str.indexOf("n"));    // -1 , becsue str does not have n
		System.out.println(str.indexOf("K"));    // output 4
		System.out.println(str.indexOf("str", 5)); // ("str", fromIndex)  output -1

		String s3 = str.concat("Programing"); //*** this concta will be stored in s3 after concat store it in new Variable
		System.out.println(s3);   //Java Programming  , Concat should be stored in new varaible

		System.out.println(str);
		System.out.println("************************************");

		// String ar IMMUTABLE ef string s
		String a="hello";
		String b="hello";

		String s4 = a.concat("Programing");
		System.out.println("a string is immutable  after concatination  -> " + a );    //hello
		System.out.println("a string is mutable  after assinging to new string s4 -> " + s4 ); //hello Programing
		// StringBuffer and builder ar MUTABLE eg string sb3
		StringBuffer sb3 = new StringBuffer("Java");
		sb3.append(" Programming");
		System.out.println("sb3 string is mutable  after appending ,no new varaible is required  ->  " + sb3); //Java Programming

		// StringBuilder and builder ar MUTABLE eg string sbb3
		StringBuilder sbb3 = new StringBuilder("Java");
		sbb3.append(" Programming");
		System.out.println("sbb3 string is mutable  after appending ,no new varaible is required  ->  " + sbb3); //Java Programming

		String s1= new String("hello");
		String s2= new String("hello");
		
		System.out.println(a.equals(b)); //true
		System.out.println(a==b); //true
		System.out.println(s1==s2); //false --> reference are difference as they are defined with string class
		System.out.println(a.equals(s1)); //ture --> both matching the values
		System.out.println(a==s1); //false --> both matching the reference not values
		System.out.println(s1==b); //false --> both matching the reference not values
		System.out.println(s1==s2); //false --> reference are difference as tehy are defined with string class
		
		
	//StringBuffer  & StringBuilder are -Mutable
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" Programming");
		System.out.println(sb);
		sb.reverse();
		sb.replace(0, 1, "Z");
		sb.deleteCharAt(1);
		sb.delete(1, 2);
		
		System.out.println("************************************");
		
		StringBuffer sb2 =  new StringBuffer("Test");
		sb2.append(" Automation");
		System.out.println(sb2);
				
		sb2.reverse();
		sb2.replace(0, 1, "Z");
		sb2.deleteCharAt(1);
		sb2.delete(1, 2);
		

	}

	

}

