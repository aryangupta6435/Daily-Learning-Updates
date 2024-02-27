
public class AgeInvalidException extends Exception
{
    AgeInvalidException(){
        super("age is invalid");
    }

    AgeInvalidException(String message){
        super(message);
    }
}
AgeInvalidException ex= new AgeInvalidException("Your age is invalid");



public class Example {
    public static void main(String[] args) {
        System.out.println("started");
         try{
            int n1 = Integer.parseInt(args[0]);
         int n2 = Integer.parseInt(args[1]);
         System.out.println("we have got two numbers");
         int result = n1/n2;
         System.out.println("Division is "+result);

            if(n2<10)
            {
                throw new AgeInvalidException("My age is invalid");
            }

         }catch(ArithmeticException e){
            System.out.println("n2 cannot be zero");
            System.out.println(e.getMessage());
         }catch(NumberFormatException e){
            System.out.println("invalid numbers");
            System.out.println(e.getMessage());
         }catch(AgeInvalidException e ){
            System.out.println("Invalid N2");
            System.out.println(e.getMessage());
         }
         catch(Exception e){
            System.out.println("error");
            System.out.println(e.getMessage());
         }
         finally{
            System.out.println("I am in finally block");
            System.out.println("closing all the resources..");
         }
         System.out.println("terminated");
    }
        
    }