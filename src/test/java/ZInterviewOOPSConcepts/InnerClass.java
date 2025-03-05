package ZInterviewOOPSConcepts;

public class InnerClass { // outside class cannnot be static, as its not depended on other class

    static class TestStatic{   // inner calsss can have static and only Nested class can be static

        String name;
        public TestStatic(String name)
        {
            this.name=name;
        }
    }

    @Override
    public String toString() {
        return "Driver";
    }

    public static void main(String[] args) {

        TestStatic obj1= new TestStatic("test"); // if its not static one ly

        System.out.println(obj1.toString());
    }
}
