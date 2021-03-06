abstract public class Employee {

    private String name;
    private int age;

    public Employee()
    {

    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calBirthYear()
    {
        return (2018-age);
    }

    abstract public float calEarnings();
    /* {
        return (1000f);
    }*/

    public void printMyData()
    {
        System.out.println("Name:           " + getName());
        System.out.println("Year of Birth:  " + calBirthYear());
    }

}
