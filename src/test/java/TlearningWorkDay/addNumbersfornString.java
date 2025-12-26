package TlearningWorkDay;

public class addNumbersfornString {

    /*
      toCharArray()
      read each ch
      checif its number oor not , if yes add it string or integer
      eelse skip
      use sum valialbe to sum the nubmers
      used Integet.parseInt()

     */
    public static int addNumbersfornStringmethod(String str) {

        int sum =0;
        char[] chars = str.toCharArray();

        String temp ="0";

        for (int i=0; i<chars.length; i++)
        {
            if(Character.isDigit(chars[i]))
            {

                temp = temp + chars[i];

            }
            else
            {

                sum = sum+ Integer.parseInt(temp);
                temp="0";

            }

        }
        sum = sum+ Integer.parseInt(temp);

        return sum;


    }

    public static void main(String[] args) {
        String str = "1a23af6"; // 30

        System.out.println(addNumbersfornStringmethod(str));
    }


}
