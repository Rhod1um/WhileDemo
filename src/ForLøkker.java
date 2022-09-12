public class ForLøkker {
    public static void main(String[] args) {
        new ForLøkker().opgaveAlfabet();
    }

    void forLoop (){
        for (int i=0; i>=10; i+=2){ //initialiserer; condition; inkrementering (+= til tal større end 1)
        }

        for (char c='1'; c<='9'; c++){ //kan bruge char også Her er tallene karaktere
            //sout(c); den udskriver tallene som tegn op til 9
        }
    }

    void opgaveAlfabet(){
        for (char c='A'; c<='Z'; c++){
            System.out.print(c);
        }
        System.out.print("ÆØÅ");
        System.out.println();
        System.out.print("ÅØÆ");

        for (char c='Z'; c>='A'; c--){
            System.out.print(c);
        }
    }




}
