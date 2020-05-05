package Models;


public class Admin {
    public String UserName ;
    public String Password;
    
    
    public Admin(String UserName,String Password){
        this.UserName=UserName;
        this.Password=Password;
       
    
    
    }  
    @Override
    public String toString()
    {
        return "UserName "+this.UserName+" Password"+this.Password;
    }
}
