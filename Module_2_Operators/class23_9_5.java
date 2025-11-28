public class class23_9_5{
    public static void main(String[] args){
        System.out.println("Start of program");
        checkNumber(5);
        System.out.println("End of program");
        checkNumber finishes (return only exits checkNumber,not main)
    }
        public static void checkNumber(int num){
            if(num<0){
                System.out.println("Negative Number ");
                return;
            }
            System.out.println("Positive Number or Zero ");
        }
    }
