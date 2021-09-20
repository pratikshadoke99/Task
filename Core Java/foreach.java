public class foreach 
{
          public static void main(String[] args)
          {
            int[][][] arr = {{{1,2},{3,4},{5,6}},{{7,8},{9,1},{2,3}}};
            for(int[][] i: arr){
      for(int[] j : i){
        for(int k: j){
          System.out.print(k + " ");
        }
        System.out.println(); // new line
      }
      System.out.println(); // new line
    }
  }

}
