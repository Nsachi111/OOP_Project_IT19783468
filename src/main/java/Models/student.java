
package Models;

 
public class student {
    public String First_Name;
    public String Last_Name;
    public String Student_ID;       
    public String Address;
    public int Acedemic_Year;
    public String Phone;
    
     public student(String First_Name ,String Last_Name ,String  Student_ID,String Address,int Acedemic_Year,String Phone ){
        this.First_Name=First_Name;
        this.Last_Name=Last_Name;
        this.Student_ID=Student_ID;
        this.Address=Address;
        this.Acedemic_Year=Acedemic_Year;
        this.Phone=Phone;  
    
    
}
    
   @Override
    public String toString()
    {
        return " First_Name"+this.First_Name+"Last_Name "+this.Last_Name+"Student_ID"+this.Student_ID+"Address"+this.Address+"Acedemic_Year"+this.Acedemic_Year+"Phone"+this.Phone;
    }
    
    
}
