/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1;

/**
 *
 * @author LENOVO
 */
public class AccountModel {
    private String accountNumber;
    private String accountPassword;
    private float balance;
    
    public AccountModel(String number, String password, float balance) {
        accountNumber = number;
        accountPassword = password;
        this.balance = balance;
    }    
    public void Deposit(int amount) throws Exception {
        // TODO: Check amount is แบงค์
        if ( amount < 100) {
            throw new Exception("Can't Deposit money less than 100 Bath");
        }
            balance = balance + amount;
        
    }
    
    public void Withdraw(int amount) throws Exception {
        if ( amount > 20000 ) {
            throw new Exception("Can't Withdraw money more than 20,000 Bath");
        }
        if (amount>balance) {
            throw new Exception("Can't Withdraw money more than you have");
        }
            balance = balance - amount;
        
    }
    
    public float ViewBalance() {
        return balance;
    }
    
    public void Transfer(String targetAccount, float amount) throws Exception{
        if ( amount > 1000000 )
            throw new Exception("Can't transfer money more than 1,000,000.00 Bath");
            
        if (amount>balance) {
            throw new Exception("Can't Transfer money more than you have");
        }
        
        AccountModel target = Database.db.GetAccount(targetAccount);
        
        balance = balance - amount;
        target.balance += amount;
            
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountPassword() {
        return accountPassword;
    }
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
}
