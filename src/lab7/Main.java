package lab7;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> studenci = new ArrayList<Student>();
        studenci.add(new Student("Krzysztof", "Kononowicz", 265651));
        studenci.add(new Student("Krystyna", "Pawlowicz", 265495));
        studenci.add(new Student("Zbigniew", "Stonoga", 265489));
        studenci.add(new Student("Zbigniew", "Ziobro", 265488));
        studenci.add(new Student("Grzegorz", "Schetyna", 265314));
        studenci.add(new Student("Jaroslaw", "Kaczynski", 265449));

        System.out.println("Lista zawiera " + studenci.size() + " studentow.");
        System.out.println("Na 3 miejscu listy znajduje sie " + studenci.get(2) + ".");
    }
}