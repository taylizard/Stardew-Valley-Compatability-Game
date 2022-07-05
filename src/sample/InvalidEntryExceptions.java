
package sample;

public class InvalidEntryExceptions extends Exception
{
    public InvalidEntryExceptions()
    {
        super("ERROR! This is an invalid entry! Please ONLY enter letters A through Z!!");
    }

    public InvalidEntryExceptions(String message)
    {
        super(message);
    }
}

