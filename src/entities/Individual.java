package entities;

public final class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public final Double tax() {
        if (getAnnualIncome() < 20000 && healthExpenditures == null || healthExpenditures == 0.0) {
            return getAnnualIncome() * 0.15;
        } else if (getAnnualIncome() < 20000 && healthExpenditures != null) {
            return getAnnualIncome() * 0.15 - (healthExpenditures * 0.5);
        } else if (getAnnualIncome() > 20000 && healthExpenditures == null || healthExpenditures == 0.0) {
            return getAnnualIncome() * 0.25;
        } else {
            return getAnnualIncome() * 0.25 - (healthExpenditures * 0.5);
        }
    }
}
