package entities;

public class Employee {

    private Long id;
    private String name;
    private Double grossSalary;
    private Double tax = 0.0;
    private Double valuePerHour;
    private Integer hoursJobs;

    public Employee() {
    }

    public Employee(Long id, String name, Double grossSalary) {
        this.id = id;
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public Employee(String name, Double grossSalary, Double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public Employee(String name, Double valuePerHour, Integer hoursJobs) {
        this.name = name;
        this.valuePerHour = valuePerHour;
        this.hoursJobs = hoursJobs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHoursJobs() {
        return hoursJobs;
    }

    public void setHoursJobs(Integer hoursJobs) {
        this.hoursJobs = hoursJobs;
    }

    public double netSalary() {
        return getGrossSalary() - getTax();
    }

    public void increaseSalary(Double percentage) {
        this.grossSalary += ((getGrossSalary() * percentage) / 100);
    }

    public Double salaryPerHours(Double valuePerHour, Integer hoursJobs) {
        return valuePerHour * hoursJobs;
    }

    @Override
    public String toString() {

        if (tax == null) {
            return "Employee : [name= " +
                    name +
                    ", salary= " +
                    String.format("%.2f", netSalary()) +
                    ", tax= " +
                    String.format("%.2f", tax) + "]";
        }
        if (id != null) {
            return id + ", " + name + ", " + String.format("%.2f", grossSalary);
        }
        return name + " - $" + String.format("%.2f", salaryPerHours(getValuePerHour(), getHoursJobs()));
    }

}
