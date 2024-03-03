////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 1. Hallo Welt!
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class HalloWelt {
    public static void main(String[] args) {
        System.out.println("Hallo Welt!");
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 2. Einfache Benutzereingabe: Stell dich deinem Programm vor!
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class HalloWelt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine();

        System.out.println("Hallo " + name + "!");

        scanner.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 3. Deine erste eigene Methode
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Rechenprogramm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Geben Sie die erste Zahl ein: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Geben Sie die zweite Zahl ein: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Wählen Sie die Rechenart (1:Addition, 2:Subtraktion, 3:Multiplikation, 4:Division): ");
            int operation = Integer.parseInt(scanner.nextLine());

            switch (operation) {
                case 1:
                    System.out.println("Ergebnis: " + addiere(num1, num2));
                    break;
                case 2:
                    System.out.println("Ergebnis: " + subtrahiere(num1, num2));
                    break;
                case 3:
                    System.out.println("Ergebnis: " + multipliziere(num1, num2));
                    break;
                case 4:
                    System.out.println("Ergebnis: " + dividiere(num1, num2));
                    break;
                default:
                    System.out.println("Ungültige Rechenart!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Bitte geben Sie eine gültige Zahl ein!");
        } finally {
            scanner.close();
        }
    }

    private static double addiere(double a, double b) {
        return a + b;
    }

    private static double subtrahiere(double a, double b) {
        return a - b;
    }

    private static double multipliziere(double a, double b) {
        return a * b;
    }

    private static double dividiere(double a, double b) {
        if (b == 0) {
            System.out.println("Division durch Null ist nicht erlaubt!");
            return Double.NaN;
        } else {
            return a / b;
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 4. Fakultät berechnen (lassen)
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class FakultaetBerechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie eine Zahl für die Fakultätsberechnung ein: ");
        int zahl = scanner.nextInt();

        long fakultaet = berechneFakultaet(zahl);
        System.out.println("Fakultät von " + zahl + " ist: " + fakultaet);

        scanner.close();
    }

    // Methode zur Berechnung der Fakultät
    public static long berechneFakultaet(int n) {
        if (n < 0) {
            System.out.println("Fakultät für negative Zahlen ist nicht definiert.");
            return 0;
        }
        long fakultaet = 1;
        for (int i = 1; i <= n; i++) {
            fakultaet *= i;
        }
        return fakultaet;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 5. Lass dein Programm ein Quadrat zeichnen
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class SternchenRechteck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Quadrat zeichnen
        System.out.println("Quadrat (5x5):");
        zeichneRechteck(5, 5);

        // 2. Variables Rechteck zeichnen
        System.out.print("Geben Sie die Höhe des Rechtecks ein: ");
        int hoehe = scanner.nextInt();
        System.out.print("Geben Sie die Breite des Rechtecks ein: ");
        int breite = scanner.nextInt();

        zeichneRechteck(hoehe, breite);

        scanner.close();
    }

    // Methode zum Zeichnen eines Rechtecks aus Sternchen
    public static void zeichneRechteck(int hoehe, int breite) {
        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < breite; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 6. Lass dein Programm ein Dreieck zeichnen
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class SternchenDreieck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Gleichschenkliges Dreieck
        System.out.print("Geben Sie die Höhe des gleichschenkligen Dreiecks ein: ");
        int hoeheDreieck = scanner.nextInt();
        zeichneDreieck(hoeheDreieck);

        // 2. Tannenbaum
        System.out.print("Geben Sie die Höhe des Tannenbaums ein: ");
        int hoeheBaum = scanner.nextInt();
        zeichneDreieck(hoeheBaum);
        zeichneStamm(hoeheBaum);

        scanner.close();
    }

    // Methode zum Zeichnen eines gleichschenkligen Dreiecks
    public static void zeichneDreieck(int hoehe) {
        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < hoehe - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Methode zum Zeichnen des Stamms des Tannenbaums
    public static void zeichneStamm(int hoehe) {
        for (int i = 0; i < hoehe - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 7. Pascalsches Dreieck
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class PascalschesDreieck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der Zeilen für das Pascalsche Dreieck ein: ");
        int zeilen = scanner.nextInt();

        zeichnePascalschesDreieck(zeilen);

        scanner.close();
    }

    // Methode zum Zeichnen des Pascalschen Dreiecks
    public static void zeichnePascalschesDreieck(int zeilen) {
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < zeilen - i; j++) {
                System.out.print("  "); // Leerzeichen für die Formatierung
            }

            int zahl = 1;
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", zahl);
                zahl = zahl * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 8. Array sortieren
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class ArraySortieren {

    public static void main(String[] args) {
        int[] arr = {45, 52, 2, 1, 0, 98, 445, 4, 42, 65, 3, 12, 11, 20, 42};

        System.out.println("Ursprüngliches Array:");
        druckeArray(arr);

        sortiereAufsteigend(arr);
        System.out.println("Aufsteigend sortiertes Array:");
        druckeArray(arr);

        sortiereAbsteigend(arr);
        System.out.println("Absteigend sortiertes Array:");
        druckeArray(arr);
    }

    // Methode zum Ausdrucken des Arrays
    public static void druckeArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Methode zum Sortieren des Arrays in aufsteigender Reihenfolge
    public static void sortiereAufsteigend(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tausche arr[j] und arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Methode zum Sortieren des Arrays in absteigender Reihenfolge
    public static void sortiereAbsteigend(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Tausche arr[j] und arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 9. Quadratzahlen berechnen
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Quadratzahlen {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            int quadrat = i * i;
            System.out.println(i + " * " + i + " = " + quadrat);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 10. Zahlensysteme
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Zahlensysteme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eingabe;
        char auswahl;

        do {
            System.out.println("Menü: \"Z)eichen, O)ktal, heX), E)nde?\"");
            auswahl = scanner.nextLine().toUpperCase().charAt(0);

            switch (auswahl) {
                case 'Z':
                    System.out.print("Geben Sie ein Zeichen ein: ");
                    eingabe = scanner.nextLine();
                    char zeichen = eingabe.charAt(0);
                    System.out.println("Dezimal: " + (int) zeichen);
                    System.out.println("Binär: " + Integer.toBinaryString((int) zeichen));
                    break;
                case 'O':
                    System.out.print("Geben Sie eine Oktalzahl ein: ");
                    eingabe = scanner.nextLine();
                    int dezimalOktal = Integer.parseInt(eingabe, 8);
                    System.out.println("Dezimal: " + dezimalOktal);
                    System.out.println("Binär: " + Integer.toBinaryString(dezimalOktal));
                    break;
                case 'X':
                    System.out.print("Geben Sie eine Hexadezimalzahl ein: ");
                    eingabe = scanner.nextLine();
                    int dezimalHex = Integer.parseInt(eingabe, 16);
                    System.out.println("Dezimal: " + dezimalHex);
                    System.out.println("Binär: " + Integer.toBinaryString(dezimalHex));
                    break;
                case 'E':
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
                    break;
            }
        } while (auswahl != 'E');

        scanner.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 11. Steuerrechner
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Steuerrechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Feste Werte berechnen
        berechneSteuer(100, 20);

        // 2. Benutzereingaben für beliebige Werte
        System.out.print("Geben Sie den Bruttopreis in € ein: ");
        double bruttopreis = scanner.nextDouble();
        System.out.print("Geben Sie den Umsatzsteuersatz in % ein: ");
        double ustSatz = scanner.nextDouble();

        berechneSteuer(bruttopreis, ustSatz);

        scanner.close();
    }

    // Methode zur Berechnung der Steuer und des Nettopreises
    public static void berechneSteuer(double bruttopreis, double ustSatz) {
        double steuerbetrag = bruttopreis * ustSatz / (100 + ustSatz);
        double nettopreis = bruttopreis - steuerbetrag;

        System.out.println("Bruttopreis: " + bruttopreis + "€");
        System.out.println("Umsatzsteuersatz: " + ustSatz + "%");
        System.out.println("Steuerbetrag: " + steuerbetrag + "€");
        System.out.println("Nettopreis: " + nettopreis + "€");
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 12. Sparbuch
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Sparbuch {

    public static void main(String[] args) {
        double anfangsbetrag = 1000.0; // Beispielbetrag
        double zinssatz = 3.0; // Beispielzinssatz in Prozent

        berechneSparbuchWachstum(anfangsbetrag, zinssatz);
    }

    // Methode zur Berechnung der jährlichen Zunahme
    public static void berechneSparbuchWachstum(double anfangsbetrag, double zinssatz) {
        double aktuellerBetrag = anfangsbetrag;

        for (int jahr = 1; jahr <= 10; jahr++) {
            aktuellerBetrag *= (100.0 + zinssatz) / 100.0;
            System.out.println("Jahr " + jahr + ": " + String.format("%.2f€", aktuellerBetrag));
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 13. Polymorphismus
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Abstrakte Klasse Angestellter
abstract class Angestellter {
    private String name;

    public Angestellter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double getMonthlyPay();

    double getYearlyPay() {
        return getMonthlyPay() * 12;
    }
}

// Abgeleitete Klasse Sekretaerin
class Sekretaerin extends Angestellter {
    private double monthlySalary;

    public Sekretaerin(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double getMonthlyPay() {
        return monthlySalary;
    }
}

// Abgeleitete Klasse Verkaeufer
class Verkaeufer extends Angestellter {
    private double monthlySalary;
    private double salesCommission;

    public Verkaeufer(String name, double monthlySalary, double salesCommission) {
        super(name);
        this.monthlySalary = monthlySalary;
        this.salesCommission = salesCommission;
    }

    @Override
    double getMonthlyPay() {
        return monthlySalary + salesCommission;
    }
}

// Abgeleitete Klasse Manager
class Manager extends Angestellter {
    private double monthlySalary;
    private double bonus;

    public Manager(String name, double monthlySalary, double bonus) {
        super(name);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    double getMonthlyPay() {
        return monthlySalary + bonus;
    }
}

// Testprogramm
public class Gehaltsrechner {

    public static void main(String[] args) {
        Angestellter[] angestellte = new Angestellter[] {
            new Sekretaerin("Maria", 2000.0),
            new Verkaeufer("Tom", 1500.0, 300.0),
            new Manager("Anna", 3000.0, 500.0)
        };

        for (Angestellter angestellter : angestellte) {
            System.out.println(angestellter.getName() + ": Monatsgehalt = " 
                + angestellter.getMonthlyPay() + ", Jahresgehalt = " 
                + angestellter.getYearlyPay());
        }
    }
}
