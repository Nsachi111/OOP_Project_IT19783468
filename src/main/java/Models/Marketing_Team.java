
package Models;


public class Marketing_Team {
    public String Team_Name;
    
     public Marketing_Team(String TeamName){
        this.Team_Name=TeamName;
 
                
    
     }
    
    @Override
    public String toString()
    {
        return "Team_Name "+this.Team_Name;
    }
    
    
}
