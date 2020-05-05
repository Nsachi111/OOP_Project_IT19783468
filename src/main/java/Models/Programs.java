
package Models;


public class Programs {
    public String Program_ID;
    public String Program_Name;
    public int Duration;       
    public String Subjects;
    public int Payment_Details;
    
     public Programs(String Program_ID  ,String Program_Name ,int Duration,String Subjects,int Payment_Details ){
        this.Program_ID=Program_ID;
        this.Program_Name=Program_Name;
        this.Duration=Duration;
        this.Subjects=Subjects;
        this.Payment_Details=Payment_Details;        
    
     }
    @Override
    public String toString()
    {
        return "Program_ID "+this.Program_ID+" Program_Name"+this.Program_Name+"Duration"+this.Duration+"Subjects"+this.Subjects+"Payment_Details"+this.Payment_Details;
    }
}
