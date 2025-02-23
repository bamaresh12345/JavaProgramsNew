package ZInterviewOOPSConcepts.Abstraction;

public class abstractExtendsClass  extends abstractClass {



	@Override
	public void method1() {
		System.out.println("am abstract method1 implemented in chaild class");
		
	}

	@Override
	public void method2() {
		System.out.println("am abstract method2 implemented in chaild class");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//abstractClass absMainCalss = new abstractClass() { // cant instiate ablsreact class //The type new abstractClass(){} must implement the inherited abstract method abstractClass.method1()
		
		abstractExtendsClass childnonAbstractclass = new abstractExtendsClass();
		
		childnonAbstractclass.i = 12; // can modify abstract calss variable
		
		childnonAbstractclass.method1(); // can call abstract method from chaild class
		childnonAbstractclass.method2(); // can call abstract method from chaild class
		
		childnonAbstractclass.nonAbstractMethod1(); // can call non-absrtact methods implemened in abstract class
		
		childnonAbstractclass.nonAbstractStaticMethod();; // can call non-absrtact static methods implemened in abstract class
	}

}
