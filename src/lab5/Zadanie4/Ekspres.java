package lab5.Zadanie4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Ekspres implements InterfejsEkspresu
{
    private List<Przepis> Przepisy;
    private ZbiornikKawy zbiornikKawy;
    private ZbiornikWody zbiornikWody;
    private ZbiornikMleka zbiornikMleka;
    private ZbiornikCukru zbiornikCukru;
    private int wybranaKawa;
    private IloscCukru iloscCukru = IloscCukru.C0;
    private Scanner kb = new Scanner(in);

    Ekspres() {
        this.wybranaKawa = 0;
        this.Przepisy = new ArrayList<>();
        this.Przepisy.add(new Przepis(0, 20, 0, 9, 80, 30));
        this.Przepisy.add(new Przepis(1, 50, 0, 3, 80,20));
        this.Przepisy.add(new Przepis(2, 80, 120, 4, 80,25));
        this.Przepisy.add(new Przepis(3, 120, 0, 5, 80,20));
        this.Przepisy.add(new Przepis(4, 220, 20, 11, 80,15));
        this.zbiornikKawy = new ZbiornikKawy();
        this.zbiornikWody = new ZbiornikWody();
        this.zbiornikMleka = new ZbiornikMleka();
        this.zbiornikCukru = new ZbiornikCukru();
        menu();
    }

    @Override
    public void realizujPrzepis(List<Przepis> Przepisy)
    {
        wybierzIloscCukru();
        int i = 0;
        out.println("Wybierz przepis, ktory chcesz zrealizowac: ");
        for (var element : this.Przepisy)
        {
            out.println(++i + ". " + element.toString());
        }
        do
        {
            this.wybranaKawa = this.kb.nextInt()-1;
        }
        while ((this.wybranaKawa < 0) || (this.wybranaKawa > this.Przepisy.size()));
        zbiornikKawy.setIloscDoPodania(this.Przepisy.get(this.wybranaKawa).iloscKawy);
        zbiornikKawy.nasyp();
        zbiornikWody.setCisnienie(this.Przepisy.get(this.wybranaKawa).cisnienieWody);
        zbiornikWody.setTemperatura(this.Przepisy.get(this.wybranaKawa).temperaturaWody);
        zbiornikWody.setIloscDoPompowania(this.Przepisy.get(this.wybranaKawa).iloscWody);
        zbiornikWody.pompuj();
        zbiornikMleka.setIloscDoPompowania(this.Przepisy.get(this.wybranaKawa).iloscMleka);
        zbiornikMleka.pompuj();
        zbiornikCukru.setIloscDoPodania(this.iloscCukru);
        zbiornikCukru.nasyp();
        out.println("Twoja kawa jest gotowa.\n");
    }

    @Override
    public void dodajNowyPrzepis(List<Przepis> Przepisy)
    {
        int     ID = this.Przepisy.size(),
                iloscWody = 0,
                iloscMleka = 0,
                cisnienieWody = 0,
                temperaturaWody = 0,
                iloscKawy = 0;
        boolean wyjatek = true;
        while (wyjatek)
        {
            try
            {
                out.print("\nPodaj ilosc wody: ");
                iloscWody = kb.nextInt();
                out.print("\nPodaj ilosc mleka: ");
                iloscMleka = kb.nextInt();
                out.print("\nPodaj cisnienie wody: ");
                cisnienieWody = kb.nextInt();
                out.print("\nPodaj temperature wody: ");
                temperaturaWody = kb.nextInt();
                out.print("\nPodaj ilosc kawy: ");
                iloscKawy = kb.nextInt();
                wyjatek = false;
            }
            catch (Exception e)
            {
                out.println("Wprowadzono nieprawidlowa wartosc. Sprobuj jeszcze raz: ");
            }
        }
        Przepisy.add(new Przepis(ID, iloscWody, iloscMleka, cisnienieWody, temperaturaWody, iloscKawy));
    }

    private void menu()
    {
        while (true)
        {
            out.println("1. Zrealizuj przepis");
            out.println("2. Dodaj nowy przepis");
            int wybor;
            try
            {
                wybor = this.kb.nextInt();
                if (wybor == 1)
                {
                    realizujPrzepis(this.Przepisy);
                }
                if (wybor == 2)
                {
                    dodajNowyPrzepis(this.Przepisy);
                }
            }
            catch (Exception e)
            {
                out.println("Wprowadzono niewlasciwa wartosc. Sprobuj ponownie...");
            }
        }
    }

    @Override
    public void wybierzIloscCukru()
    {
        boolean wyjatek = true;
        int wybor = 0;
        while (wyjatek)
        {
            try
            {
                out.println("Wybierz ilosc cukru (1 - 5):");
                wybor = this.kb.nextInt();
                if ((wybor < 1) || (wybor > 5))
                {
                   throw new Exception("Niewlasciwy wybor.");
                }
                wyjatek = false;
            }
            catch (Exception e)
            {
                out.println("Podano nieprawidlowa wartosc. Sprobuj jeszcze raz.");
            }
        }
        switch (wybor)
        {
            case 1:
            {
                this.iloscCukru = IloscCukru.C0;
                break;
            }
            case 2:
            {
                this.iloscCukru = IloscCukru.C1;
                break;
            }
            case 3:
            {
                this.iloscCukru = IloscCukru.C2;
                break;
            }
            case 4:
            {
                this.iloscCukru = IloscCukru.C3;
                break;
            }
            case 5:
            {
                this.iloscCukru = IloscCukru.C4;
                break;
            }
        }
    }
}