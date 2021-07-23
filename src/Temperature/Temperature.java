package Temperature;
import java.lang.IllegalArgumentException;


// Started from 9:00
// Ended at 9:26, Dinner time yeahhhhhh
// Started again at 10:00
// Ended at 10:12
// Speed Coding Challenge!!
public class Temperature {

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
    public Temperature(double t, String unit)
    {
        if(!(unit.equals("Celsius") || unit.equals("Fahrenheit") || unit.equals("Kelvin")))
            throw new IllegalArgumentException("Invalid Temperature Unit. Unit should be either Celsius, Fahrenheit or Kelvin");
        temp = t;
        this.unit = unit;
    }


    // Okay you see two constructors that has same name.
    // Why don't we have conflict here?
    // This is called "Overload", check "Java Overload" on internet or ask question in group chat
    public Temperature()
    {
        temp = 0;
        unit = "Celsius";
    }

    // These called getters and setters.
    // It just returns data fields.
    // Why do we need this?? Ohh well, we made data field private
    // private double temp; so we cannot get temperature from outside of this file.
    // This is to secure the data and avoid random coder to change data.
    // Since this method(function) is public everyone can use it.
    public String getUnit()
    {
        return unit;
    }

    public double getTemp()
    {
        return temp;
    }




    // This is toString method.
    // We dont want to write each time like System.out.println(String.valueOf(temperature) + "/" + unit)
    // So we define toString() function that we can reuse many time when we want to print out this temperature.
    public String toString()
    {
        return String.valueOf(getTemp()) + "/" + getUnit();
    }

    public void increaseTempe(double num)
    {
        temp += num;
    }



    // This converts the unit by seeing the unit specified and unit that temperature holds.
    public void changeUnit(String unit)
    {
        if(this.unit.equals("Celsius"))
        {
            // Converting unit from C to F
            if(unit.equals("Fahrenheit"))
                temp = C2F(temp);

            // Converting unit from C to K
            else if(unit.equals("Kelvin"))
                temp = C2K(temp);

            // if those units are same meaning converting from C to C
            // Just skip it
            else
                return;
        }
        // same thing is happening down below
        else if(this.unit.equals("Fahrenheit"))
        {
            if(unit.equals("Celsius"))
                temp = F2C(temp);
            else if(unit.equals("Kelvin"))
                temp = F2K(temp);
            else
                return;
        }
        else if(this.unit.equals("Kelvin"))
        {
            if(unit.equals("Celsius"))
                temp = K2C(temp);
            else if(unit.equals("Fahrenheit"))
                temp = K2F(temp);
            else
                return;
        }
        this.unit = unit;
    }




    // These are inside convertors.
    // There are 6 types of convertors.
    private double C2F(double Celsius)
    {
        return Celsius*9/5+32;
    }

    private double F2C(double Fahrenheit)
    {
        return (Fahrenheit - 32) * 5 / 9;
    }

    private double F2K(double Fahrenheit)
    {
        return C2K(F2C(Fahrenheit));
    }

    private double C2K(double Celsius)
    {
        return Celsius + 273.15;
    }

    private double K2C(double Kelvin)
    {
        return Kelvin - 273.15;
    }

    private double K2F(double Kelvin)
    {
        return C2F(K2C(Kelvin));
    }

    public static void main(String[] argv)
    {
        System.out.println("### Testing Temperature Class ###");

        Temperature t1 = new Temperature(20, "Celsius");

        System.out.println(t1.toString());

        t1.changeUnit("Fahrenheit");

        System.out.println(t1.toString());

        Temperature t2 = new Temperature(273.15, "Kelvin");

        System.out.println(t2.toString());

        t2.changeUnit("Celsius");

        System.out.println(t2.toString());
    }
}
