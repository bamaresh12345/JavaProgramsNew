package TLeanringDontCheckThisFolder;

public class linerSearch {

    public static void main(String[] args) {

        int[] arr = {10,20,40,60,30};
        int ele = 30;
        for (int i = 0; i < arr.length; i++) {

            if(ele == arr[i])
            {
                System.out.println("Elelment found" +ele);
            }


        }

        System.out.println("elelent not found" + ele);

    }
}
