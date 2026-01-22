public class Main {
    public static void main(String[] args) {

        Uzivatel uzivatel = new Uzivatel("Pe pa.", "Nová-. k", "1.1.2002", "pepanovak@gmail.com", "AbrKabr322");
        System.out.println("Jméno:" + uzivatel.upravaJmena());
        System.out.println("Příjmení:" + uzivatel.upravaPrijmeni());
        System.out.println("Generace E-mailu:" + uzivatel.generaceEmailu());
        System.out.println("Je E-mail?:" + uzivatel.jeEmail());
        System.out.println("Náhodné heslo:" + uzivatel.nahodneHeslo());

    }
}