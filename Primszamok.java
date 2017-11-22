public class Primszamok{

    public void kiiras(){

        int primekszama = 0;
        int szam = 2;

        while(primekszama<=100){
            boolean primszam = true;
            for (int i=2; i<=Math.sqrt(szam); i++){

                if( szam % i == 0){
                    primszam = false;
                    break;

                }
            }

            if(primszam){
                primekszama++;   
                System.out.println(szam + " ");

            }
            szam++;

        }

    }
}

