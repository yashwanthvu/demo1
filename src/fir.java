import java.util.Scanner;

public class fir {
//static int i=0;
//    fir(int k){
//      i =k;
//
//    }
static String temp= null ;
public static String pal(String m, int n){

    if(n==1){
        System.out.println(temp);
        return temp;

    }

  // temp =  + pal(m,n-1);
    System.out.println(m.substring(n));
   return temp;

}




    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        String m = "madam";
        n = m.length();

        s=pal(m, n-1);

        m.compareTo(s);
        System.out.println(s);
    //    System.out.println(i);
    }
}
