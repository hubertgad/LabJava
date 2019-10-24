/*
  W salonie samochodowym zaoferowano sprzedaż leasingową pojazdów. 
  Napisz kod, który policzy miesięczne zobowiązanie z uwzględnieniem odsetek i wpłaconego kapitału własnego.
  Dane wejściowe to maksymalna kwota: 300 tyś PLN, liczba rat do 96. Oprocentowanie wynosi:
  - do 24 miesięcy 2%
  - do 48 miesięcy 3%
  - do 60 miesięcy 4%
  - do 72 miesięcy 5%
  - do 96 miesięcy 6%
*/

package lab2;
import java.util.Scanner;

public class Zadanie6
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Witaj! Obliczymy Ci mega korzystną ratke! Podaj kwote kretytu, wplate wlasna oraz liczbe rat.");
		System.out.println("Kwota kredytu (maksymalnie 300 000): ");
		int wartosc = keyboard.nextInt();
		System.out.println("Podaj wysokosc wplaty wlasnej: ");
		int wplata_wlasna = keyboard.nextInt();
		System.out.println("Podaj ilosc rat (maksymalnie 96): ");
		int ilosc_rat = keyboard.nextInt();
		keyboard.close();
		int oprocentowanie;
		if (ilosc_rat <= 24)
			oprocentowanie = 2;
		else if (ilosc_rat <= 48)
			oprocentowanie = 3;
		else if (ilosc_rat <= 60)
			oprocentowanie = 4;
		else if (ilosc_rat <= 72)
			oprocentowanie = 5;
		else if (ilosc_rat <= 96)
			oprocentowanie = 6;
		wysokosc_raty = ((wartosc - wplata_wlasna) * wysokosc_raty / 100 + (wartosc - wplata_wlasna)) / ilosc_rat;
	}
}
