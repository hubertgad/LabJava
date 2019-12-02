package lab4;

public class Macierz
{
	private static int COUNTER = 0;
	private int macierz[][];
	Macierz(int macierz[][])
	{
		this.macierz = macierz.clone();
	}
	public int[][] getMacierz()
	{
		return this.macierz;
	}
	public String toString()
	{
		String output = "";
		output += rysujRamke();
		for (int w = 0; w < macierz.length; w++)
		{
			output += ("|");
			for (int k = 0; k < macierz[w].length; k++)
			{
				output += String.format("%4d  ", (macierz[k][w]));
			}
			output += ("|\n");
		}
		output += rysujRamke();
		return output;
	}
	int[][] dodajMacierz(Macierz that)
	{
		int[][] wynik = new int[this.macierz.length][this.macierz[0].length];
		for (int w = 0; w < this.macierz.length; w++)
		{
			for (int k = 0; k < this.macierz[w].length; k++)
			{
				wynik[k][w] = this.macierz[k][w] + that.getMacierz()[k][w];
			}
		}
		return wynik;
	}
	private String rysujRamke()
	{
		String output = "----";
		for (int i = 0; i < this.macierz[0].length-1; i++)
		{
			output += "      ";
		}
		output += "----\n";
		return output;
	}
	private int[] zmienNaListe(int[][] m)
	{
		int temp = 0;
		int[] l = new int[m.length*m.length];
		for (int w = 0; w < m.length; w++)
		{
			for (int k = 0; k < m.length; k++)
			{
				l[k + w * m.length] = m[k][w];
			}
		}
		return l;
	}
	private int[][] zmienNaMacierz(int[] l)
	{
		int[][] m = new int[(int)Math.sqrt(l.length)][(int)Math.sqrt(l.length)];
		for (int w = 0; w < m.length; w++)
		{
			for (int k = 0; k < m.length; k++)
				m[k][w] = l[k + w * m.length];
		}
		return m;
	}
	public int[][] sortujBabelkowo()
	{
		int[] l = zmienNaListe(this.macierz);
		for (int w = 0; w < l.length; w++)
		{
			for(int k = 0; k < l.length-1; k++)
			{
				if ((k == 0)&&(w == 0)) System.out.println("SORTOWANIE BABELKOWE:");
				if ((k < 5)&&(w == 0))
				{
					System.out.print("Krok " + (k+1) + ": ");
					System.out.print("Porownujemy element nr " + k + " z elementem nr " + (k+1) + ". ");
					if (l[k] > l[k+1])
					{
						System.out.println("Poniewaz " + l[k] + " jest wieksze od " + l[k+1] + " zamieniamy je miejscami.");
					}
					else
					{
						System.out.println("Poniewaz " + l[k] + " nie jest wieksze od " + l[k+1] + " to zostawiamy jak jest.");
					}
				}
				if (l[k] > l[k+1])
				{
					zamienMiejscami(l, k, k+1);
				}
			}
		}
		int[][] wynik = zmienNaMacierz(l);
		return wynik;
	}
	public int[][] sortowanieQuickSort()
	{
		System.out.println("SORTOWANIE QUICK-SORT: ");
		return sortujQuickSort(zmienNaListe(this.macierz), 0, macierz.length*macierz.length-1);
	}
	public int[][] sortujQuickSort(int[] l, int lewy, int prawy)
	{
		COUNTER++;
		int 	i = lewy - 1,
				j = prawy + 1,
				pivot = l[(prawy + lewy) / 2];
		komentarz1(l, lewy, prawy, pivot);
		while (true)
		{
			while (pivot > l[++i]);
			if (j != 0)
				while (pivot < l[--j]);
			if (i <= j)
			{
				komentarz2(l, i, j);
				zamienMiejscami(l, i, j);
			}
			else
				break;
		}
		if (j > lewy)
		{
			komentarz3(l, lewy, j);
			sortujQuickSort(l, lewy, j);
		}
		if (i < prawy)
		{
			sortujQuickSort(l, i, prawy);
		}
		int[][] wynik = zmienNaMacierz(l);
		return wynik;
	}
	private void zamienMiejscami(int[] l, int i, int j)
	{
		int temp;
		temp = l[i];
		l[i] = l[j];
		l[j] = temp;
	}
	private void komentarz1(int[] l, int lewy, int prawy, int pivot)
	{
		if (COUNTER < 6)
		{
			System.out.println("\nKROK " + COUNTER + ": Badamy elementy od l[" + lewy + "] = " + l[lewy] + " do l[" + prawy + "] = " + l[prawy] + ". "
					+ "Ustawiamy pivot na srodku tablicy: l[" + (prawy + lewy) / 2 + "] = " + pivot +
					"\nSzukamy po lewej stronie elementu mniejszego od pivota, a po prawej elementu od niego wiekszego, " +
					"zaczynajac od zewnetrzej strony. Znalezione elementy zamieniamy miejcami.");
		}
	}
	private void komentarz2(int[] l, int i, int j)
	{
		if (COUNTER < 6)
		{
			System.out.println("l[" + i + "] = " + l[i] + " <-- swap --> l[" + j + "] = " + l[j]);
		}
	}
	private void komentarz3(int[] l, int lewy, int j)
	{
		if (COUNTER < 6)
		{
			System.out.println("Okej, nasze liczniki sie spotkaly - nic juz wiecej nie znajdziemy. Wyznaczamy teraz podzbior ograniczony z lewej strony przez licznik znacznik: " + lewy + " a z prawej strony przez " + j +
					". Umieszczamy nasz pivot na srodku podzbioru: " + (lewy + j) / 2 + " i powtorka: ");
			System.out.println((new Macierz(this.zmienNaMacierz(l))).toString());
		}
	}
}