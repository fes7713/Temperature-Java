package Temperature;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

// Started from 10:32
// Ended at 11:10, Dinner time yeahhhhhh

// Total time 01:16

public class TemperatureManager {

    // This is a list of temperature
    List<Temperature> tempList;

    // It shows if the manager is active or not
    boolean active;

    // Prepare keyboard input
    Scanner kb;


    // This initialize the manager
    public TemperatureManager()
    {
        tempList = new ArrayList<Temperature>();
        active = true;
        kb = new Scanner(System.in);
    }

    // This gets temperature and add to the list
    private void add(Temperature t)
    {
        tempList.add(t);
    }

    // This gets keyboard input and add temperature to the list
    private void add_menu() {
        double temp = 0;
        String unit;


        System.out.println("\n### Temperature Adding Menu ###\n");

        // Getting temperature
        System.out.print("Type Temperature : ");
        temp = kb.nextDouble();
        kb.nextLine();

        // Getting unit
        System.out.print("Type unit (Celsius 1, Fahrenheit 2, Kelvin 3) : ");
        unit = kb.nextLine();

        // Convert unit if 1, 2 or 3 is pressed instead actual name
        switch (unit) {
            case "1" -> unit = "Celsius";
            case "2" -> unit = "Fahrenheit";
            case "3" -> unit = "Kelvin";
        }

        // Convert it
        // maybe you have not seen printf before but
        // This is printing with formatting. check it if you have an interest but we don't usually use it tho
        System.out.printf("Adding Temperature : %f,  Unit : %s\n\n", temp, unit);
        add(new Temperature(temp, unit));
    }
    private Temperature remove(int index)
    {
        return tempList.remove(index);
    }

    private void remove_menu()
    {
        int index = 0;
        String unit;
        System.out.println("\n### Temperature Removing Menu ###\n");
        System.out.println(this.toString());
        System.out.print("Type Index of Temperature you want to remove : ");
        index = kb.nextInt();
        kb.nextLine();

        System.out.printf("%s : %s\n%s\n\n", "Do you want to remove", tempList.get(index).toString(), "Y/N");
        String ok = kb.nextLine();
        if(ok.equals("Y")) {
            System.out.printf("%s : %s\n\n", "Removing", tempList.get(index).toString());
            remove(index);
        }
    }

    public void convert(int index, String unit)
    {
        tempList.get(index).changeUnit(unit);
    }

    private void convert_menu()
    {
        int index = 0;
        String unit;
        System.out.println("\n### Temperature Converting Menu ###\n");
        System.out.println(this.toString());
        System.out.print("Type Index of Temperature you want to convert : ");
        index = kb.nextInt();
        kb.nextLine();

        System.out.print("Type Target Unit (Celsius 1, Fahrenheit 2, Kelvin 3) : ");
        unit = kb.nextLine();
        switch (unit) {
            case "1" -> unit = "Celsius";
            case "2" -> unit = "Fahrenheit";
            case "3" -> unit = "Kelvin";
        }
        System.out.printf("%s : %s to %s\n\n", "Converting", tempList.get(index).toString(), unit);
        convert(index, unit);


    }
    public String toString()
    {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < tempList.size(); i++)
        {
            result.append(String.valueOf(i) + ":\t" + tempList.get(i).toString() + "\n");
        }
        return result.toString();
    }
    public void menu()
    {
        System.out.println("//////////////////////////////////////");
        System.out.println("////////Temperature Manager///////////");
        System.out.println("//////////////////////////////////////");
        while(active) {
            System.out.printf("%d: %-20s", 1, "Add Temperature");
            System.out.printf(" %d: %-20s%s", 2, "Remove Temperature", "\n");

            System.out.printf("%d: %-20s", 3, "Convert Temperature");
            System.out.printf(" %d: %-20s%s", 4, "Exit", "\n");
            System.out.print(": ");

            String action = kb.nextLine();
            switch(action)
            {
                case "1"->add_menu();
                case "2"->remove_menu();
                case "3"->convert_menu();
                case "4"->active = false;
            }
            System.out.println(toString()+"\n\n");
        }

    }
    public static void main(String[] argv)
    {

        TemperatureManager manager = new TemperatureManager();
        manager.menu();
    }
}
