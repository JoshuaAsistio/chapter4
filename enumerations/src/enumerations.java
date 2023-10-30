import javax.swing.JOptionPane;

public class enumerations {    
    // enum DaysOfTheWeek {
    //     MONDAY, 
    //     TUESDAY, 
    //     WEDNESDAY, 
    //     THURSDAY, 
    //     FRIDAY, 
    //     SATURDAY, 
    //     SUNDAY
    // }

    enum Property {
        SINGLE_FAMILY,
        MULTIPLE_FAMILY,
        CONDOMINIUM,
        LAND,
        BUSINESS
    }

    public static void main(String[] args) {
        // for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
        //     System.out.println(day);
        // }

        Property propForSale = Property.SINGLE_FAMILY;

        switch(propForSale) {
            case SINGLE_FAMILY:
            case MULTIPLE_FAMILY:
                JOptionPane.showMessageDialog(null, "The listing fee is 5%.");
                break;
            case CONDOMINIUM:
                JOptionPane.showMessageDialog(null, "The listing fee is 6%.");
            case LAND:
            case BUSINESS:
                JOptionPane.showMessageDialog(null, "We do not handle this type of property.");
        }
    }
}
