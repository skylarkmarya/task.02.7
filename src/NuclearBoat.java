/**
 * Class "NuclearBoat"
 * @author Masha
 * @version 1.01
 */
public class NuclearBoat {
    /**Method "launchEngine" need for launch nuclear reactor */
    void launchEngine(){
        NuclearBoatEngine nuclearBoatEngine = new NuclearBoatEngine();
        nuclearBoatEngine.startEngine();
    }
    /**Class "NuclearBoatEngine"
     * This class describe nuclear boat engine
     */
    public class NuclearBoatEngine{
        /**Method "startEngine" describe launch of nuclear reactor */
        void startEngine(){
            System.out.println("You successfully launch nuclear engine of nuclear boat!");
        }
    }
}