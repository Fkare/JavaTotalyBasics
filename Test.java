import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        int yes = 1;

        Asker(yes);
        scann();

    }

    private static void Asker(int x){
        if(x==1) {
            System.out.println(" Print 2 parameter`s");
        }
        else if(x==0) {
            System.out.println("Now chose what you want to do: ");
        }
        else if(x==2)
        {
            System.out.println("[1] Add");
            System.out.println("[2] Sybtract");
            System.out.println("[3] Multiply");
            System.out.println("[4] Divide");
            //some test lul
            System.out.println("[5] add 1 more parameter and describe all metods for 3 of them ");
        }
        }

    private static void scann() throws InterruptedException {
        double x;
        double y;
        int no = 0;
        int wot = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("First: ");
        x = scan.nextDouble();
        System.out.println("Sec: ");
        y = scan.nextDouble();

        System.out.print("Your parameters are: " + x);
        System.out.println(" and " + y);

        for(;;){

            Asker(no);
         Asker(wot);

         int well;
         well = scan.nextInt();
         switch (well) {
            case 1: {
                System.out.println(add(x, y));
                tellmetrue();
                break;
            }
            case 2: {
                System.out.println(noadd(x, y));
                tellmetrue();
                break;
            }
            case 3: {
                System.out.println(multip(x, y));
                tellmetrue();
                break;
            }
            case 4: {
                System.out.println(divide(x, y));
                tellmetrue();
                break;
            }
             case 5:{
                 System.out.println("Write the parametr you want to add to the pot: ");
                 double tre;
                 tre = scan.nextDouble();
                 System.out.println("Add 3 of them: " + add(x,y,tre));
                 System.out.println("Subtract 3 of them: " + noadd(x,y,tre));
                 System.out.println("Mulitply them: " + "(x*y)*z:  "+multip(x,y,tre));
                 System.out.println("Divide them: " + "First option: [(x/y)/z] :  "+divide(x,y,tre) + " Sec option: [(x/z)/y] : " + divide(x,tre,y) + " Third option: [(y/z)/z] : "+divide(y,tre,x));
                 tellmetrue();
                 break;
             }
         }
          int cos;
          cos = scan.nextInt();

            if(cos ==1){
                for (int i = 0; i < 20; ++i) System.out.println();
                continue;
            }
           else break;

    }
    }

    private static double add(double x , double y){
        return x+y;
    }
    private static double noadd(double x, double y){
        return x-y;
    }
    private static double multip(double x , double y){
        return x*y;
    }
    private static double divide(double x , double y){
        return x/y;
    }

    ///////////////
    private static double add(double x , double y, double z){
        return add(add(x,y),z);
    }
    private static double noadd(double x, double y , double z){
        return noadd(noadd(x,y),z);
    }
    private static double multip(double x , double y , double z){
        return multip(multip(x,y),z);
    }
    private static double divide(double x , double y, double z){
        return divide(divide(x,y),z);
    }





    public static void tellmetrue() throws InterruptedException {
        TimeUnit.SECONDS.sleep((long) 1.5);
        System.out.println("You want to continue and try other or break?");
        System.out.println("[1] to continue");
        System.out.println("[2] to break");
        TimeUnit.SECONDS.sleep((long) 1.5);
    }

}
