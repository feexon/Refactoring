/**
 * Created by L.x on 14-10-15.
 */
public class Example {
    private int _numberOfLateDeliveries;

    int getRating() {
        return _numberOfLateDeliveries > 5 ? 2 : 1;
    }

}
