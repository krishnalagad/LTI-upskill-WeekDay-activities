package Problem3_NumberFormatException;

class ItemType {
    private String name;
    private Double deposit;
    private Double costPerDay;

    public ItemType() {
    }

    public ItemType(String name, Double deposit, Double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString() {
        return 
                "Name:" + name + "\n" +
                "Deposit:" + deposit + "\n" +
                "Cost Per Day:" + costPerDay;
    }
}
