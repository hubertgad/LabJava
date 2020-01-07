package lab7;

public class Student
{
    String imie;
    String nazwisko;
    int numerIndeksu;
    Student()
    {
        ;
    }
    Student(String imie, String nazwisko, int numerIndeksu)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.imie)
                .append(" ")
                .append(this.nazwisko)
                .append(", numer indeksu: ")
                .append(this.numerIndeksu);
        return sb.toString();
    }
}
