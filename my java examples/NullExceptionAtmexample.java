class NullExceptionAtmexample{
    String Holdername="ashu";
    int balance=5000;

}
class Atm{
    public static void main(String args[]){
        NullExceptionAtmexample atm=null;
        try
        {
            System.out.println("Card Holder: " + atm.Holdername);
            System.out.println("Balance: " + atm.balance);
        }
        catch(NullPointerException e)
        {
            System.out.println("Please insert your ATM card.");
        }

        System.out.println("Thank you for using our ATM.");
    }
}