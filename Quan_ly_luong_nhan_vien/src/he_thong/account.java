package he_thong;
public class account {
    private String userName;
    private String passWord;
    public account(){
        userName="administator";
        passWord="admin";
    }
    public account(String userName,String passWord){
        this.userName=userName;
        this.passWord=passWord;
    }
    public void setPassWord(String passWord){
        this.passWord=passWord;
    }
     public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return userName;
    }
     public String getPassWord(){
        return passWord;
    }
}
