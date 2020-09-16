
package part2;

import java.text.NumberFormat;


public class populationgrowth {

    
    public static void main(String[] args) {
        /*
        barries pop in 2020 is 160000
        grows by 6% evey 10 years
        how much will it be in 2120
        */
      int pop =160000;
      int growth;
      NumberFormat nf = NumberFormat.getNumberInstance();
      //cn also use currency and precent
      
      //print colum headlines
        System.out.format("%10s", "YEAR");
        System.out.format("%20s", "POPULATION");
         System.out.format("%20s", "GROWTH");
          System.out.format("%20s\n", "NEW POPULATION");
          
          
           System.out.format("%10s", "====");
        System.out.format("%20s", "==========");
         System.out.format("%20s", "======");
          System.out.format("%20s\n", "=============");
          
          
          for (int year =2020; year <= 2120;  year+=10) {
              System.out.format("%5d", year);
              System.out.format("%20s", nf.format(pop));
              growth = (int)(.06* pop);//have to cast to integer
              System.out.format("%15s", nf.format(growth));
              pop += growth;
              System.out.format("%20s\n", nf.format(pop));
              
            
        }
    }
    
}
