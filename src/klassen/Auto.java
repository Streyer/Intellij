package klassen;

public class Auto {

    public static final int DEFAULT_TUNEWERT = 25;

    public static int erstellteAutos = 0;

    static {
        System.out.println("Die klassen.Auto-Klasse wurde initialisiert.");

    }

    // Instanz-Variablen ( oder auch Attribute, Member)
    // <Datentyp> <name> [<Zuweisung>];
    private int leistung; // PS
    private final String hersteller;


    // Instanz-Methoden
    // beschreibt was man mit der Klasse machen kann
    // <Rückgabedatentyp> <name> ([<Parameterliste]) {Rumpf (Logik)}
    public void tunen(int tuneWert) {
        /*
        TODO
        Wir müssen noch den Wert tuneWert überprüfen!
        falls er negativ ist -> Reagiere darauf!
         */
        leistung += tuneWert;
    }

    // Methode überladen
    public void tunen(){
        tunen(DEFAULT_TUNEWERT);
    }


    //Getter:
    public int getLeistung() {
        return leistung;
    }

    public String getHersteller() {
        return hersteller;
    }

    //Setter:
    private void setLeistung(int leistung) {
        /*
        TODO
        Wir müssen noch den Wert neueLeistung überprüfen!
        falls er negativ ist -> Reagiere darauf!
         */
        this.leistung = leistung;
    }



    // Konstruktoren
    // <KlassenName> (<Parameterliste>) {Rumpf (Logik)}
    public Auto(int leistung, String hersteller) {
        this.hersteller = hersteller;
        setLeistung(leistung);
        erstellteAutos++;
        System.out.println("Es wurde soeben das " + erstellteAutos + ". klassen.Auto erstellt.");
    }

    //das ist ein überladener Konstruktor
    public Auto(String hersteller){
        this(100, hersteller);

    }

    public static void printInfos(Auto auto) {
        System.out.println("Die Leistung ist: " + auto.leistung + ", der Hersteller ist: " + auto.hersteller);
    }


}
