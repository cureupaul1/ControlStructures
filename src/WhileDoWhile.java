public class WhileDoWhile {
    public static void main(String[] args) {
        int counter = 0;

        /*
        while(expresia este adevarata){
            // blocul de cod
        }
         */
        while(counter < 25) {
            System.out.println("WHILE - counter-ul are valoarea: " + counter);
            counter++;
        }
        /*
        do{
        //blocul de cod
        }while(conditia/expresia este adevarata)
         */
        counter = 0;
        System.out.println("--------------------------");
        do{
            System.out.println("DOWHILE - counter-ul are valoarea: " + counter);
            counter++;
        }while(counter <25);
    }
}
