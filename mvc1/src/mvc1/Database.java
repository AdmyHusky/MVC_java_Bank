/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class Database {
    
    public static Database db = new Database();
    
    private Map<String, AccountModel> dictionary = new HashMap<String, AccountModel>();
    
    public Database(){
        AccountModel model = new AccountModel("2562-34-21-10001", "6969", 35285.53f);
        dictionary.put(model.getAccountNumber(), model);
        
        //AccountModel account1 = new AccountModel("2562-34-21-10001", "6969", 35285.53f);
        //dictionary.put(account1.accountNumber, account1);
        
        dictionary.put("2562-34-21-10002", new AccountModel("2new562-34-21-10002", "4117", 103478.98f));
        dictionary.put("2562-34-21-10003", new AccountModel("2562-34-21-10003", "8143", 1781.25f));
    }
    
    public AccountModel GetAccount (String number){
        return dictionary.get(number);
    }
}
