public class Jatekos{

    private Kocka kocka;
    private String jatekosneve;

    public Jatekos(Kocka k, String nev){

        kocka = k;
        jatekosneve = nev;
    }

    public int jatek(int dobasokszama){
        int osszeg = 0;
        int i = 1;
        while(i <=dobasokszama){
            osszeg = osszeg + kocka.dobas();
            i++;

        }
        return osszeg;
    }
}
