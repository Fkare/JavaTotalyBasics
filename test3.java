import java.util.Scanner;
public class test3 {

    public static void main(String[] args) {
        System.out.println("Put 3 int arguments into tab: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("1: ");
        int a = scan.nextInt();
        System.out.println("2: ");
        int b = scan.nextInt();
        System.out.println("3: ");
        int c = scan.nextInt();
        int[] tab = new int[]{a,b,c};
        int i=0;
        while(i<3)
        {
            System.out.println("Value nr: #" + (i+1) + " : " + tab[i]);
            i++;
        }
        less(tab);
        more(tab);


    }
    private static void less(int[] tab){
        if(tab[0]<tab[1] && tab[0]<tab[2]){
            System.out.println("the smallest value: "+ tab[0]);
        }
        else if(tab[1]<tab[0]&& tab[1]<tab[2]) {
            System.out.println("the smallest value: " + tab[1]);
        } else {
            System.out.println("the smallest value: "+ tab[2]);
        }
    }
    private static void more(int[] tab){
        if(tab[0]>tab[1] && tab[0]>tab[2]){
            System.out.println("the greatest value: "+ tab[0]);
        }
        else if(tab[1]>tab[0]&& tab[1]>tab[2]){
            System.out.println("the greatest value: "+ tab[1]);
        }
        else {
            System.out.println("the greatest value: "+ tab[2]);
        }
    }


}
