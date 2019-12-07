package lab5.Zadanie8;
import java.util.InputMismatchException;
public class BramkaOR extends Bramka
{
    BramkaOR()
    {
        ;
    }
    BramkaOR(String input)
    {
        this.Input = input;
        calculateOutput();
    }
    @Override
    protected void calculateOutput()
    {
        if (this.Input.contains("1"))
        {
            this.Output = "1";
        }
        else if (this.Input.contains("0"))
        {
            this.Output = "0";
        }
        else
        {
            throw new InputMismatchException();
        }
    }
}
