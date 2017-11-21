public class Primszamok{

    public void kiiras(){

        for (int i=2; i <=100; i++){
            boolean primszam = true;
            for(int j = 2; j<i; j++){
                
                if(i % j == 0){
                    
                    primszam = false;
                    break;
                    
                }
            }
            if(primszam){
                
                System.out.println(i + " ");
                
            }
        }
    }
}

