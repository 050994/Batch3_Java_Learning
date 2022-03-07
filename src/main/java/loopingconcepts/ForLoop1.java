package loopingconcepts;

public class ForLoop1 {
    public static void main(String[] args)
    {
        int i = 1;
        for( int j =1 ; j<= 5 ; j++)
        {
            for(int k =1 ; k<=j ; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }


  /*
    do {
          System.out.println(i);
          i++;
          System.out.print(i);
        } while (i <= 5);
  */


   /*      while (i <= 5)
         {
             for(int l=1; l <= i ; l++)
             {
                 System.out.print(l);
             }
             System.out.println();
             i++;
         }*/
    }
}
