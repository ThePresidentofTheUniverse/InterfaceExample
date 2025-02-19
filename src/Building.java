/*----------------------------------------------------
 * Program Title: [InterfaceExample]
 * Author: Nolan Abbott
 * Date: [02/18/2025]
 * Description: [Curious to see what can be done here]
 * Usage / Issues: This program is an example of how an interface can be used.
 *-----------------------------------------------------
 */
public interface Building {

    //Declaring the constants (what all buildings have)
    String getName();
    String getLocation();
    double getWidth();
    double getLength();
    double getHeight();

    //Declaring the abstract methods
    void whatIs();

}
