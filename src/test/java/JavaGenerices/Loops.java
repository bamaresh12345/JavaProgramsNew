package JavaGenerices;

public class Loops {

    public static void main(String[] args) {

        int[] arr = {3,1,5,6};

        for (int i = arr.length-1; i >=0; i--) {  //  i = 4-1 ; i>=0; i--***
            System.out.println(" Just for loop number : " + arr[i]);  // print in reverse order
        }

        for(int i=0; i<10; i++)
        {
            System.out.println(" Just for loop number : " + i);
        }

        for(int i=0; i<10; i++)
        {


            if(i==3)
                continue;

            if(i==5)
            {
                System.out.println(" number : " + i + 12);
                break;
            }

            System.out.println(" number : " + i);
        }

        int i=0;

        while(i>2)   // It will not go into while loop becasue 0 is not greater than 2
        {
            System.out.println("While  i>2--> " +i);
            i=i+1;
        }

        while(i<2) // It will go into while loop because i<2 , it will go till 0,1
        {
            System.out.println("While  i<2--> " +i); //prints -> 0,1
            i=i+1;
        }

        i=0;
        while(i<=2)
        {
            System.out.println("While i<=2 --> " +i);   // prints -> 0,1,2
            i=i+1;
        }

        int j=0;
        do {

            System.out.println(" DO While executed once i>2 --> " +j);
            j = j+1;
        } while(j>2);

        int[] arr2323 = {6,8,3};
        System.out.println("Array length  arr.length = 3 ,starts from 1,2,3--> " + arr.length);

        String str ="abc";
        System.out.println("String length  str.length() = 3 ,starts from 1,2,3--> " + str.length());

        char[] chars = str.toCharArray();
        System.out.println("Chars length  chars.length = 3 ,starts from 1,2,3--> " + chars.length);

        for(int k=0; k<arr.length; k++)
        {
            System.out.println("arr value : " + arr[k]);
        }

        for(int k=1; k<arr.length-1; k++)
        {
            System.out.println("arr value startt index 1 : " + arr[k]);
        }


        for(int k=0; k<str.length(); k++)
        {

            System.out.println("str.charAt(i) with 0 value : " +  str.charAt(k));
        }

        for(int k=1; k<str.length()-1; k++)
        {

            System.out.println("str.charAt(i) with k=1 and str.length()-1 value : " +  str.charAt(k));
        }


    }
}
