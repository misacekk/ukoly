public class Main {
    public static void main(String[] args) {

        Uzivatel uzivatel = new Uzivatel("Pe pa.", "Nová-. k", "25.1.1990", "pepanovak@gmail.com", "AbrKabr322");
        System.out.println("Jméno:" + uzivatel.upravaJmena());
        System.out.println("Příjmení:" + uzivatel.upravaPrijmeni());
        System.out.println("Generace E-mailu:" + uzivatel.generaceEmailu());
        System.out.println("Je E-mail?:" + uzivatel.jeEmail());
        System.out.println("Náhodné heslo:" + uzivatel.nahodneHeslo());
        System.out.println("Zastření E-mailu:" + uzivatel.zastreniEmailu());
        System.out.println("Narozeniny za:" + uzivatel.dnyDoNarozenin() + "dny");

    }
}