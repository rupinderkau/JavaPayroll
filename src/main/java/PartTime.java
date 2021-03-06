abstract public class PartTime extends Employee {

    private float rate;
    private float hoursWorked;

    public PartTime()
    {
        super();
    }

    public PartTime(String name, int age, float rate, float hoursWorked) {
        super(name, age);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    abstract public float calEarnings();

   Vehicle v1 = new Motorcycle();
   Vehicle v2 = new Car();

    @Override
    public void printMyData()
    {
        System.out.println("\tRate:           " + getRate());
        System.out.println("\tHours Worked:   " + getHoursWorked());
    }
}
