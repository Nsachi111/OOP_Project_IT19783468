
package Models;


public abstract class User {
   public String User_Name ;
   public String Password;
    
    
    public User(String User_Name,String Password){
        this.User_Name=User_Name;
        this.Password=Password;
    
    
    
    
}
    
  @Override
    public String toString()
    {
        return "User_Name "+this.User_Name+" Password"+this.Password;
    }  
    
}
