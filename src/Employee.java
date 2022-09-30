public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private int id;
    static int counter;

    public Employee(String fullName, int department, double salary) {
        if (department < 0 || department > 5) throw new IllegalArgumentException(" Ведено неверное значение ");
        this.id = ++counter;
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return   fullName + ". Номер отдела " + department + " . Зароботная плата " + salary + ". Порядковый номер " + id ;
    }
}

