package Demo_Src;

public class SimpleRemoteControl {
	//Invoker
	Command slot;  // only one button
	  
    public SimpleRemoteControl()
    {
    }
  
    public void setCommand(Command command)
    {
        // set the command the remote will
        // execute
        slot = command;
    }
  
    public void buttonWasPressed()
    {
        slot.execute();
    }
}
