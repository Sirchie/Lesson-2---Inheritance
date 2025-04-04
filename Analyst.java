public class Analyst extends Employee {

    //Consttuctor
    public Analyst(String name, double salary, int age) {
        super(name, age, salary);
    }

    public double getAnnualBonus() {
        return super.salary * .05;
    }

}