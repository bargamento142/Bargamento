package BankApp;

public class BankClass {
    
    int accountNumber = 122402;
    String name;
    float initialBalance = 0;
    int pin = 2002;
    
    public boolean verifyAccount(int acc, int pn){
        
            if (pn == pin && accountNumber == acc){
                return true;
            }else{
                return false;
            }
    }
    
    public int setAccount(){
        return accountNumber;
    }
    
    public void viewBalance(){
    
    
    }
    
    
    
}
