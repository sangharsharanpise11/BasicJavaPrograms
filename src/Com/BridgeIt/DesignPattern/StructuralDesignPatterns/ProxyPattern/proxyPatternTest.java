/**
 * Created by :Sangharsha Ranpise.
 * Date :25/03/2019.
 * Purpose :StructuralDesignPatterns(ProxyPattern)
 */
package Com.BridgeIt.DesignPattern.StructuralDesignPatterns.ProxyPattern;

public class proxyPatternTest 
{

    public static void main(String[] args) 
    {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
        try 
        {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e)
        {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }
}
