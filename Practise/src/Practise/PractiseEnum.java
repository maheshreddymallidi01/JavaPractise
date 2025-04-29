package Practise;

public class PractiseEnum {
	enum Day {
        MONDAY("Start of the work week..."),
        TUESDAY("Work in progress..."),
        WEDNESDAY("Mid of the week..."),
        THURSDAY("About to Complete..."),
        FRIDAY("Last day of the work week"),
        SATURDAY("Weekend!"),
        SUNDAY("Rest day");
        private String description;
        //Creating a Constructor
        Day(String description) {
            this.description = description;
        }
        
        public String getDay() {
        	return this.description;
        }
       
        // Method to return custom description
        @Override
        public String toString() {
            return this.description;
        }
    }
    public static void main(String[] args) {
        // ordinal()  method
        System.out.println("The ordinal() values are:");
        for (Day d : Day.values()) {
            System.out.println(d.name() + " -> ordinal: " + d.ordinal());
        }
        // compareTo() method
        System.out.println("\n compareTo() example:");
        System.out.println("MONDAY vs FRIDAY: " + Day.MONDAY.compareTo(Day.FRIDAY)); 
        System.out.println("SUNDAY vs SUNDAY: " + Day.SUNDAY.compareTo(Day.SUNDAY));  
        // toString() method
        System.out.println("\ntoString() example:");
        for (Day d : Day.values()) {
            System.out.println(d.name() + " says: " + d.toString());
        }
        // name() method
        System.out.println("\nname() example:");
        Day today = Day.THURSDAY;
        System.out.println("Enum constant name: " + today.name());
        // valueOf() method
        System.out.println("\nvalueOf() example:");
        String input = "FRIDAY";
        Day dayFromString = Day.valueOf(input);
        System.out.println("\nConverted from string: " + dayFromString.name());
        // values() method
        System.out.println("\nvalues() iteration:");
        for (Day d : Day.values()) {
            System.out.println(d + " (" + d.name() + ")");
        }
        
        System.out.println("\ngetDay() example:");
        for(Day d: Day.values()) {
        	if(d.getDay().equals("Start of the work week...")) {
        		System.out.println("It's Monday");
        	}
        }
    }
}
