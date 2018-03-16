package cn.edu.cuit.cuitapp.properties;

/**
 * @author sunshixiong
 * @date 2018/3/16 17:35
 */
public class BrowerProperties {

    private String loginPage = "/loginin.html";

    private LoginTpye loginTpye = LoginTpye.JSON;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginTpye getLoginTpye() {
        return loginTpye;
    }

    public void setLoginTpye(LoginTpye loginTpye) {
        this.loginTpye = loginTpye;
    }
}
