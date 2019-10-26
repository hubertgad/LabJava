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
		boolean kwotaPrawidlowa = false, 
			iloscRatPrawidlowa = false, 
			wplataWlasnaPrawidlowa = false;
		int wplataWlasna = 0,
			wartosc = 0,
			kwotaSplaty = 0,
			iloscRat = 0;
		double wysokoscRaty = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Witaj! Obliczymy Ci mega korzystna ratke! Podaj kwote kretytu, wplate wlasna oraz liczbe rat.");
		while (kwotaPrawidlowa == false)
		{
			System.out.println("Podaj kwote kredytu (maksymalnie 300000): ");
			wartosc = keyboard.nextInt();
			if ((wartosc <= 300000) & (wartosc>0))
				kwotaPrawidlowa = true;
		}
		while (wplataWlasnaPrawidlowa == false)
		{
			System.out.println("Podaj wysokosc wplaty wlasnej (0 - " + wartosc + "): ");
			wplataWlasna = keyboard.nextInt();
			if ((wplataWlasna >= 0 ) & (wplataWlasna <= wartosc))
				wplataWlasnaPrawidlowa = true;
		}
		while (iloscRatPrawidlowa == false)
		{
			System.out.println("Podaj ilosc rat (maksymalnie 96): ");
			iloscRat = keyboard.nextInt();
			if ((iloscRat > 0) & (iloscRat <= 96)) 
				iloscRatPrawidlowa = true;
		}
		keyboard.close();
		double oprocentowanie = 1;
		if (iloscRat <= 24)
			oprocentowanie = 1.02;
		else if (iloscRat <= 48)
			oprocentowanie = 1.03;
		else if (iloscRat <= 60)
			oprocentowanie = 1.04;
		else if (iloscRat <= 72)
			oprocentowanie = 1.05;
		else if (iloscRat <= 96)
			oprocentowanie = 1.06;
		kwotaSplaty = wartosc - wplataWlasna;
		wysokoscRaty = kwotaSplaty * oprocentowanie / iloscRat;
		System.out.print("Wysokosc raty: ");
		System.out.format("%.2f%n", wysokoscRaty);
		}
}
