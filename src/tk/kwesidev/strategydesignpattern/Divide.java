package tk.kwesidev.strategydesignpattern;

public class Divide implements Strategy{
    
    
    
    @Override
    public int dOperation(int x,int y){
        
        
       try{
           
           
           return(x/y);
           
       }        
       
     catch(Exception e){
         
         System.out.println("Division by zero"+e.getMessage());
         return 0;
         
         
     }
        
      
    }

    
    
}

