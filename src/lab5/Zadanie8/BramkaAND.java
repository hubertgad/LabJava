package lab5.Zadanie8;

import java.util.InputMismatchException;

public class BramkaAND extends Bramka
{
    BramkaAND()
    {
        ;
    }
    BramkaAND(String input)
    {
        this.Input =  input;
        calculateOutput();
    }
    @Override
    protected void calculateOutput()
    {
        if (this.Input.contains("0"))
        {
            this.Output = "0";
        }
        else if (this.Input.contains("1"))
        {
            this.Output = "1";
        }
        else
        {
            throw new InputMismatchException();
        }
    }
}
