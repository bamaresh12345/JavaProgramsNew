package ServiceCompanyInterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicateElementsFromArrayListUsingHashSet {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("JAVA");
        list.add("J2EE");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("JAVA");
        list.add("STRUTS");
        list.add("JSP");

        Set<String> set = new HashSet<>();

        for (String s : list) {
            set.add(s);
        }

        System.out.println(set);
    }
}
