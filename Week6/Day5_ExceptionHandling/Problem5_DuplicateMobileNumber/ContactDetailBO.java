package Problem5_DuplicateMobileNumber;

class ContactDetailBO {
    public static void validate(String mobileNumber, String alternateMobileNumber)
            throws DuplicateMobileNumberException {
        if (mobileNumber.equals(alternateMobileNumber)) {
            throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");
        }
    }
}
