package programme;


import klassen.Auto;


public class AutoProgramm {

    public static void main(String[] args) {

        System.out.println("Das Programm ist gestartet...");

        Auto bmw = new Auto("BMW");
        Auto audi = new Auto(150, "Audi");

        //Punkt-Notation:
        bmw.tunen(25);

        Auto.printInfos(bmw);
        Auto.printInfos(audi);



      //  System.out.println(bmw.getLeistung());
      //  System.out.println(audi.getLeistung());
      //  System.out.println(bmw.getHersteller());

    }


}