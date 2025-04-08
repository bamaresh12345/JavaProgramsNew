package extraLearnALLRepeated;

public class primeNUmber {

    public static void main(String[] args) {

        int n=28;
  int count=0;
        for (int i = 1; i <= n; i++) {

            if(n%i ==0)
            {
                count++;
            }
        }

        System.out.println(count);
        if(count >2)
        {
            System.out.println("not prince");
        }
        else
        {
            System.out.println(" prince");
        }
    }
}
