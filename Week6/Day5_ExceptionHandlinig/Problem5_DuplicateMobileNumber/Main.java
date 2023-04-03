package Problem5_DuplicateMobileNumber;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the contact details");
        String[] details = scanner.nextLine().split(",");
        String mobileNumber = details[0];
        String alternateMobileNumber = details[1];
        String landline = details[2];
        String email = details[3];
        String address = details[4];
        try {
            ContactDetailBO.validate(mobileNumber, alternateMobileNumber);
            ContactDetail contactDetail = new ContactDetail(mobileNumber, alternateMobileNumber, landline, email,
                    address);
            System.out.println(contactDetail);
        } catch (DuplicateMobileNumberException e) {
            System.out.println(e);
        }
    }
}
