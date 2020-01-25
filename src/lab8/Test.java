package lab8;
import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		StudentInstytut student = new StudentInstytut();
		Scanner kb = new Scanner(System.in);
		System.out.println("Podaj dane studenta: \n"
				+ "Imie: ");
		student.setImie(kb.nextLine());
		System.out.println("Nazwisko: ");
		student.setNazwisko(kb.nextLine());
		System.out.println("Numer indeksu: ");
		student.setIndeks(kb.nextLine());		
		System.out.println("Wydzial: ");
		student.setWydzial(kb.nextLine());
		System.out.println("Instytut: ");
		student.setInstytut(kb.nextLine());
		
		System.out.println(student.getImie() + "\n" + student.getNazwisko() + "\n" 
				+ student.getIndeks() + "\n" + student.getWydzial() + "\n"
				+ student.getInstytut() );
	}
}