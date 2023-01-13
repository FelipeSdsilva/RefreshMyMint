package entities;

public final class Company extends TaxPayer {

    private Integer numberOfEmployee;

    public Company() {
        super();
    }

    public Company(String name, Double annualIncome, Integer numberOfEmployee) {
        super(name, annualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }

    public Integer getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(Integer numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public Double tax() {
        if (getNumberOfEmployee() > 10) {
            return getAnnualIncome() * 0.14;
        } else {
            return getAnnualIncome() * 0.16;
        }
    }
}
