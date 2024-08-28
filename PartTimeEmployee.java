public class PartTimeEmployee extends Employee{
    private int noOfHoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int noOfHoursWorked, double hourlyRate){
        super(name, id);
        this.noOfHoursWorked=noOfHoursWorked;
        this.hourlyRate=hourlyRate;
    }
    @Override
    public double calculateSalary(){
        return noOfHoursWorked*hourlyRate;
    }
}
