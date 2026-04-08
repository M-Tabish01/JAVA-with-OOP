
package bank;
// protected class is used for use that class on another file but only sub classes can access it  
class Account{
    public String name;
    protected String email;
    private String password;
    
    // getter & setter
    public String getpassword(){
        return this.password;
}
 
    public void setpassword(String pass){
        this.password = pass;
    }
    
}
    
public class Bank {
    public static void main(String[] args){
        Account account1 = new Account();
        account1.name = "Guess who";
        account1.email = "guesswho@gmail.com";
        account1.setpassword("Guesswhooooo");
        System.out.println(account1.getpassword());
    }
}
