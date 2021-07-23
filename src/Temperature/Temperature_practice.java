package Temperature;

// Started from 9:00
// Ended at 9:26, Dinner time yeahhhhhh
// Started again at 10:00
// Ended at 10:12
// Speed Coding Challenge!!
public class Temperature_practice {

    // These things called Data field.
    // You need to define all of data here!!
    // In this example, temperature need its degree and unit so
    // You need to have two data fields that one holds degree and another holds unit
    // This private and public are called access key and it shows the who can access it
    // Public then it is not secured and everyone can access it
    // Private then data can be accessed only from this file. (Ask me for more detail)
    private double temp;
    private String unit;



    // This is constructor
    public Temperature_practice(double t, String unit)
    {

    }


    // Okay you see two constructors that has same name.
    // Why don't we have conflict here?
    // This is called "Overload", check "Java Overload" on internet or ask question in group chat

    // This is default constructor, check it on the internet or just skip it.
    // it is not that important anyways
    public Temperature_practice()
    {

    }

    // These called getters and setters.
    // It just returns data fields.
    // Why do we need this?? Ohh well, we made data field private
    // private double temp; so we cannot get temperature from outside of this file.
    // This is to secure the data and avoid random coder to change data.
    // Since this method(function) is public everyone can use it.

    // Getters and setters, if you want (Optionals)
    // Search about is on the internet

    public double getTemp()
    {
        return 0.0;
    }

    public String getUnit()
    {
        return "";
    }

    public void setTemp()
    {
        
    }





    // This is toString method.
    // We dont want to write each time like System.out.println(String.valueOf(temperature) + "/" + unit)
    // So we define toString() function that we can reuse many time when we want to print out this temperature.
    public String toString()
    {
        // Change this line
        return "";
    }

    // Completely optional
    public void increaseTempe(double num)
    {
        temp += num;
    }



    // This converts the unit by seeing the unit specified and unit that temperature holds.


    // It gets target unit and compare unit that this class holds (private String unit;)
    // If they are different, convert temperature unit to target unit
    // For example if the target unit was Kelvin and this class had Celsius,
    // Do Celsius to Kelvin conversion and update temp data field accordingly.
    public void changeUnit(String unit)
    {
    }




    // These are inside convertors.
    // There are 6 types of convertors.
    private double C2F(double Celsius)
    {
        return 0.0;
    }

    private double F2C(double Fahrenheit)
    {
        return 0.0;
    }

    private double F2K(double Fahrenheit)
    {
        return 0.0;
    }

    private double C2K(double Celsius)
    {
        return 0.0;
    }

    private double K2C(double Kelvin)
    {
        return 0.0;
    }

    private double K2F(double Kelvin)
    {
        return 0.0;
    }

    public static void main(String[] argv)
    {
        System.out.println("### Testing Temperature Class ###");
        // Write some test codes.



    }
}
