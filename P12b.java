import java.util.*;
class MarksOutOfBoundsException extends Exception{
    public MarksOutOfBoundsException(String msg){
        super(msg);
    }
}
class InputOfException{
    public void checkMarks(float marks) throws MarksOutOfBoundsException{
        if(marks>100 || marks<0){
            throw new MarksOutOfBoundsException("Marks are invalid.\nPlease enter the correct marks.");
        }
        else{
            System.out.println("Entered marks are Valid.");
        }
    }
}
class P12b{
    public static void main(String args[]){
        InputOfException ie = new InputOfException();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        float userMarks = sc.nextFloat();
        try{
            ie.checkMarks(userMarks);
        }
        catch(MarksOutOfBoundsException mobe){
            System.out.println(mobe.getMessage());
        }
    }
}