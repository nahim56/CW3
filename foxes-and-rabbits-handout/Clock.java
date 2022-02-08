
/**
 * Write a description of class Clock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clock
{
    // instance variables - replace the example below with your own
    private int hour;
    private int minute;
    /**
     * Constructor for objects of class Clock
     */
    public Clock()
    {
        hour = 0;
        minute = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void simulateMinute(){
        minute++;
        if (minute > 59){
            hour++;
            if (hour > 23){
                hour = 0;
            }
            minute = 0;
        }
        
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
        // public String getHour(){
            // if (hour < 10){
                // return "0"+ hour;
            // }
            // else{
                // return "" + hour;
            // }
    // }
    // public String getMinute(){
        // if (minute < 10){
            // return "0"+ minute;
        // }
        // else{
            // return "" + minute;
        // }
        
    // }
    
}
