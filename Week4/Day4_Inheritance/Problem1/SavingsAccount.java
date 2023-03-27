package Problem1;

public class SavingsAccount extends Account {
    private String orgName;

    public SavingsAccount() {
    }

    public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
        super.setAccName(accName);
        super.setAccNo(accNo);
        super.setBankName(bankName);
        this.orgName = orgName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void display() {
        super.display();
        System.out.println("Organisation Name:" + this.orgName);
    }
}
