import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        new DoWhile().loopUntilQuit();
    }

    void youMustAnswer (){
        Scanner sc = new Scanner(System.in);
        String name;
        do {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            System.out.println(name);
        } while (name.length() != 0); //Stopper hvis man trykker Enter
        // hvis Enter tastes er length=0. Der er også isEmpty() som alternativ
    }

    void loopUntilQuit(){ //min løsning
        Scanner sc = new Scanner(System.in);
        String input="";
        System.out.print("Skriv en streng, skriv quit for at slutte: ");
        while (!input.equalsIgnoreCase("quit")){ //det skulle være while, men do while
            //havde været mere intuitivt til denne løsning. Så havde man ikke behøvet at initialisere input="";
            input = sc.nextLine();
            System.out.println("Streng: " + input);
        } //husk '' om enkelte tegn og "" om string/flere end et tegn

        String str1 = "hello";
        String str2 = "HELLO";
        System.out.println(str2.equalsIgnoreCase(str1)); //giver true fordi det er en boolean
    }

    void loopUntilQuitPatrick (){ //patricks anbefalede løsning til LoopUntil99 er brugt
        Scanner sc = new Scanner (System.in);
        String input;
        boolean reply =true;
        System.out.print("Skriv en streng, skriv quit for at slutte: ");
        while (reply) {
            input = sc.nextLine();
            System.out.println("Streng: " + input);
            if (input.equalsIgnoreCase("quit")){
                reply=false;
            }
        }

    }

}
/* Skriv klassen YouMustAnswer. Lad main() instantiere klassen og kalde en ikke-static metode,
som afvikler programmet.Programmet skal bede brugeren om at indtaste sit navn.
Dernæst skal programmet kvittere for modtagelsen ved at skrive navnet på skærmen.
Hvis brugeren blot taster Enter uden at skrive en tekststreng, skal programmet vedblive med at spørge,
indtil brugeren indtaster noget.
 */