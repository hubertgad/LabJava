package lab5.Zadanie8;

import java.util.InputMismatchException;

public class AND extends Bramka
{
    @Override
    public void setInputs(int inputs)
    {
        {
            this.inputs = inputs;
        }
    }
    @Override
    public int getOutput()
    {
        if (this.Output == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    private void calculateOutput()
    {
        char[] charArray = this.Input.toCharArray();
        for (var c : charArray)
        {
            if ((c != 0) && (c != 1))
            {
                throw new InputMismatchException();
            }
            else if (c == 0)
            {
                this.Output = 0;
                break;
            }
            else if (c == 1)
            {
                this.Output = 1;
            }
        }
    }
}
