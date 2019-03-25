import java.util.Scanner;
public class test3 {

    public static void main(String[] args) {
        System.out.println("Size of array: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] tab = new int[a];
        int i=0;
        while(i<a)
        {
            System.out.println("Put a value of arguments: #" + (i+1));
            int b = scan.nextInt();
            tab[i] = tab[i] + b;
            i++;

        }
        less(tab,a);
        more(tab,a);


    }
    private static void less(int[] tab, int x){
        int wynik = tab[0];
        for(int i = 0; i<x;i++){
                if(wynik>tab[i]){
                    wynik=tab[i];
                }

        }
        System.out.println("Less value is: " + wynik);
    }
    private static void more(int[] tab, int x){
        int wynik = tab[0];
        for(int i = 0; i<x;i++){
            if(wynik<tab[i]){
                wynik=tab[i];
            }

        }
        System.out.println("Greates value is: " + wynik);
    }


}
