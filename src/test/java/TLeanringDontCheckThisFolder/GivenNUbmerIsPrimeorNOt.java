package TLeanringDontCheckThisFolder;

public class GivenNUbmerIsPrimeorNOt {

    public static void main(String[] args) {


        int n=19;
        boolean prime=false;
        int count=0;
        for (int i = 0; i <=n; i++) {

            if(n%i==0)  // *** n % i is very imp***
            {

              count++;
            }
        }

        if(count>2)
        {
            System.out.println("Not prime nubmer" + count);
        }
        else
        {
            System.out.println("Is prime nubmer" + count);
        }

    }
}
