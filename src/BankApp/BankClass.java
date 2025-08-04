package BankApp;

public class BankClass {
    
    int accountNumber = 122402;
    String name;
    float initialBalance = 0;
    int pin = 2002;
    
    public boolean verifyAccount(int acc, int pn){
        
        return !(acc != accountNumber || pn != pin);
    }
    
    public int setAccount(){
        return accountNumber;
    }
    
    public void viewBalance(){
    
    }
    
    
    
}