/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author MUHIT
 */
public class login {
private String usercb;   

    public login(String usercb) {
        this.usercb = usercb;
    }

    public String getUsercb() {
        return usercb;
    }

    public void setUsercb(String usercb) {
        this.usercb = usercb;
    }

    @Override
    public String toString() {
        return "login{" + "usercb=" + usercb + '}';
    }

    
}
