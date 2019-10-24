/*
  W salonie samochodowym zaoferowano sprzedaz leasingowa pojazdow. 
  Napisz kod, ktory policzy miesieczne zobowiazanie z uwzglednieniem odsetek i wpaaconego kapitalu wlasnego.
  Dane wejsciowe to maksymalna kwota: 300 tys PLN, liczba rat do 96. Oprocentowanie wynosi:
  - do 24 miesiecy 2%
  - do 48 miesiecy 3%
  - do 60 miesiecy 4%
  - do 72 miesiecy 5%
  - do 96 miesiecy 6%
*/

package lab2;
import java.util.Scanner;

public class Zadanie6
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Witaj! Obliczymy Ci mega korzystna ratke! Podaj kwote kretytu, wplate wlasna oraz liczbe rat.");
		System.out.println("Kwota kredytu (maksymalnie 300 000): ");
		int wartosc = keyboard.nextInt();
		System.out.println("Podaj wysokosc wplaty wlasnej: ");
		int wplata_wlasna = keyboard.nextInt();
		System.out.println("Podaj ilosc rat (maksymalnie 96): ");
		int ilosc_rat = keyboard.nextInt();
		keyboard.close();
		double oprocentowanie = 1;
		if (ilosc_rat <= 24)
			oprocentowanie = 1.02;
		else if (ilosc_rat <= 48)
			oprocentowanie = 1.03;
		else if (ilosc_rat <= 60)
			oprocentowanie = 1.04;
		else if (ilosc_rat <= 72)
			oprocentowanie = 1.05;
		else if (ilosc_rat <= 96)
			oprocentowanie = 1.06;
		int kwota_splaty = wartosc - wplata_wlasna;
		double wysokosc_raty = kwota_splaty * oprocentowanie / ilosc_rat;
		System.out.print("Wysokosc raty: ");
		System.out.format("%.2f%n", wysokosc_raty);
		}
}
