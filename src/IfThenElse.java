public class IfThenElse {
    public static void main(String[] args) {
        int a = 25;

        if(a == 50) {
            System.out.println("a chiar este 50");
            System.out.println("expresia este adevarata");
        }

        if(a != 50){
            System.out.println("a este diferit de 50- linia 11");
        } else {
            System.out.println("a este 50 - ramura else");
        }
        if ( a == 50){
            System.out.println("a este diferit de 50");
        }else if(a < 25){
            System.out.println("a este mai mic decat 25 - linia 18");
        }else if(a > 100){
            System.out.println("a este mai mare decat 100");
        }else {
            System.out.println("Imputul este diferit si neacoperit decontitiile testate din blocul if-then-else");
        }

        //operatorul ternar ?:
        System.out.println((a==25)? "a este 25" : "a nu este 25");
    }

}
