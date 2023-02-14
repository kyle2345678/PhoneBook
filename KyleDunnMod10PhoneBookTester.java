import java.io.*; 
import java.util.*; 
public class KyleDunnMod10PhoneBookTester
{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    
    System.out.println("Last Name?");
    String findL = scan.nextLine(); 
    System.out.println("First Name?"); 
    String findF = scan.nextLine(); 
    PhoneEntry[] foundPhoneEntries;  
    
    if(findF != "") {
        foundPhoneEntries = PhoneBook.search(findF, findL);
    }
    else {
        foundPhoneEntries = PhoneBook.search(findL);
    }
    if (foundPhoneEntries.length > 0) {
      for (PhoneEntry phoneEntry : foundPhoneEntries) {
        System.out.println(phoneEntry.firstName + " " + phoneEntry.lastName + ": " + phoneEntry.phoneNumber);
      }
    } else {
      System.out.println("Phone entry not found.");
    }
  }
}
