import java.util.Scanner;

public class NameBackwards {

    public static void main(String[] args) {
        new NameBackwards().sdrawkcabEman();
    }

    void sdrawkcabEman(){
        Scanner sc = new Scanner(System.in);
        String name;
        int length;
        System.out.print("Tast noget du vil have skrevet baglæns: ");
        do {
            name = sc.nextLine();
            length = name.length();
            for (int i=length-1; i>=0; --i){ //der skal -1 fordi string starter på position 0, og der skal >= af samme årsag
                System.out.print(name.charAt(i));
            }
        } while (name.length() == 0); //tvinger brugeren til at skrive noget
    }

}
/*
Programmet skal "insistere" på at få brugerens navn
 -altså bede om navnet og blive ved med at spørge, indtil
 brugeren har svaret på spørgsmålet.Når dette er sket,
 skal navnet udskrives bagfra med VERSALER.
 */