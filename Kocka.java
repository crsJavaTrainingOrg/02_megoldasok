import java.util.Random;

public class Kocka{
    
    
    public Kocka(){}
    
    public int dobas(){
        
        Random random = new Random();
        
        int x = random.nextInt(6)+1;
        return x;
    }
}
        
    
