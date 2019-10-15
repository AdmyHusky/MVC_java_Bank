/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1;

public class AccountController {
    
    private AccountView view;
    
    public AccountController (){
        this.view = new AccountView(this);
        view.setVisible(true);
    }
    
    public void Login(String username ,String password){
        AccountModel account = Database.db.GetAccount(username);
        if (account == null){
            view.ShowMessage("ไม่มีผู้นี้ในระบบ");
            return;
        }
        
        if (!account.getAccountPassword().equals(password)){
            view.ShowMessage("รหัสผ่านไม่ถูกต้อง");
            return;
        }
        
        view.ShowLogin();
    }

}
