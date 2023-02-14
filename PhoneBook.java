import java.util.*;

class PhoneBook {
    static PhoneEntry[] phoneEntries = {
            new PhoneEntry( "James", "Barclay", "(418) 665-1223" ),
            new PhoneEntry( "Grace", "Dunbar", "(860) 399-3044"),
            new PhoneEntry( "Paul", "Kratides", "(815) 439-9271" ),
            new PhoneEntry( "Violet", "Smith", "(312) 223-1937" ), 
            new PhoneEntry( "John", "Wood", "(913) 883-2874" ),
            new PhoneEntry("Laura", "Wood", "(919) 457-2354"),
            new PhoneEntry("Kyle", "Dunn", "(919) 457-2354"),
            new PhoneEntry("Kyl", "Dunn", "(919) 457-2354"),
            new PhoneEntry("Ky", "Dunn", "(919) 457-2354"),
            new PhoneEntry("K", "Dunn", "(919) 457-2354"),
        };

    public static PhoneEntry[] search(String firstName, String lastName) {
        List<PhoneEntry> results = new ArrayList<>();
        for (PhoneEntry phoneEntry : phoneEntries) {
            if (phoneEntry.firstName.equals(firstName) && phoneEntry.lastName.equals(lastName)) {
                results.add(phoneEntry);
            }
        }
        return results.toArray(new PhoneEntry[0]);
    }

    public static PhoneEntry[] search(String lastName) {
        List<PhoneEntry> results = new ArrayList<>();
        for (PhoneEntry phoneEntry : phoneEntries) {
            if (phoneEntry.lastName.equals(lastName)) {
                results.add(phoneEntry);
            }
        }
        return results.toArray(new PhoneEntry[0]);
    }
}
