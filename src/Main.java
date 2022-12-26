public class Main {
    public static void main(String[] args) {

        Istemci istemci1 = new Istemci(new BmwFabrika());
        istemci1.uret();

        System.out.println("-----------");

        Istemci istemci2 = new Istemci(new AudiFabrika());
        istemci2.uret();

        System.out.println("-----------");

        Istemci istemci3 = new Istemci(new MercedesFabrika());
        istemci3.uret();

    }
}