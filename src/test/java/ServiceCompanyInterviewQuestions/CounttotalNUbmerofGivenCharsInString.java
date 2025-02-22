package ServiceCompanyInterviewQuestions;

public class CounttotalNUbmerofGivenCharsInString {

    public static void main(String[] args) {
        String s = "Java is java again java again";
        char c = 'g'; // Not needed
        int beforlength = s.length();
        String k = "";
        k = k + c;   // useful to convert from char to string
        s = s.replace("a", ""); // Strings very IMP****


        int afterLength = s.length();

        int count = beforlength - afterLength;
        System.out.println("total count of occurence of given char: " + count);

    }
}
