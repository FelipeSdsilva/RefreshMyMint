package entities;

public final class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Double valuePerHour, Integer hoursJobs, Double additionalCharge) {
        super(name, valuePerHour, hoursJobs);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

}
