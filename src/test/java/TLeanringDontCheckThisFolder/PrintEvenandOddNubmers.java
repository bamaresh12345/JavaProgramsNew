package TLeanringDontCheckThisFolder;

public class PrintEvenandOddNubmers {

    public static void main(String[] args) {

        int[] arr = {1,6,2,7,9,3,5};

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]%2==0)
            {
                System.out.println("Even nubmer--> " + arr[i]);
            }

        }

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]%2!=0)
            {
                System.out.println("Odd nubmer--> " + arr[i]);
            }
    }   }



}
