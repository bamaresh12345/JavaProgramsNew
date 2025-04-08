package ServiceCompanyInterviewQuestions;

public class PatternDiamond {

    public static void main(String[] args) {
        int n=5;
        int p=1;

        for(int i=0; i<=n; i++)
        {
            for(int j=i; j<=n;j++)
            {
                System.out.print(" "); // single space j=i; j<=n
            }
            p=1;
            for(int j=0; j<i;j++)
            {
                System.out.print(p + " "); // * with single space ,j=0; j<i
                p++;
            }


            System.out.println();
        }

//=================below same code reverse ====================================
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=i;j++)
            {
                System.out.print(" "); // single space ,j=0; j<i
                p++;
            }

            p=1;
            for(int j=i; j<n;j++)  // * with single space j=i; j<=n
            {
                System.out.print(p+" ");
                p++;
            }



            System.out.println();
        }
    }
}
