package CharacterPrograms;
/*
Maxium Consitive 1s in array
Maxium Consitive a'' in String

 */
public class MaxConsitivesAsInString {

    public static int maxConsitivesAsInGivenString(String str)
    {
        char[] chars =str.toLowerCase().toCharArray();
        int count=0;
        int maxCount=0;
        for (int i=0; i<chars.length; i++)
        {
           if(chars[i]=='a')
            {
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else
            {
                count=0;
            }

        }
        return maxCount;

    }

    public static void main(String[] args) {

        String str ="aatestaaaatestaaaaaaaasdfaadfjdfadaggdfdg";
        System.out.println(maxConsitivesAsInGivenString(str));  // OUPTUT 8
    }
}
