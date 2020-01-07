package lab5.Zadanie8;

abstract public class Bramka
{
    protected int inputs;
    String Input = "";
    String Output;

    void setInputs(String inputs)
    {
        this.Input = inputs;
    }
    String getOutput()
    {
        return this.Output;
    }
    void calculateInputs()
    {
        this.inputs = this.Input.length();
    }
    abstract protected void calculateOutput();
}