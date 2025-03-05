package ZInterviewOOPSConcepts;

public class StringImmutableStringButtferStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Java";
		str.concat("Programing");
		
		System.out.println(str);
		System.out.println("************************************");
		
		String a="hello";
		String b="hello";
		
		String s1= new String("hello");
		String s2= new String("hello");
		
		System.out.println(a.equals(b)); //true
		System.out.println(a==b); //true
		System.out.println(s1==s2); //false --> reference are difference as tehy are defined with string class
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

