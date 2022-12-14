public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Игорь", 3, 20500.00);
        employees[1] = new Employee("Гаврилин Сергей", 2, 28950.00);
        employees[2] = new Employee("Кравцов Евгений", 5, 55000);
        System.out.println(getCalculateSumSalary());
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println(getAverageSalaryEmployee());
        printNameAllEmployee();


    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
            getCalculateSumSalary();

        }

    }

    public static double getCalculateSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double min = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee employeeMinSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMinSalary = employees[i];
            }
        }
        return employeeMinSalary;

    }
    public static Employee getEmployeeMaxSalary() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee employeeMaxSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if ( employees[i] == null) continue;
            if (employees[i].getSalary() > max){
                max = employees[i].getSalary();
                employeeMaxSalary = employees[i];
            }
        }
        return  employeeMaxSalary;
    }
    public static double getAverageSalaryEmployee() {
        double sum = 0;
        int countEmp = 0;
        for (Employee emp : employees) {
            if ( emp == null) continue;
            countEmp++;
            sum += emp.getSalary();
        }
        return sum / countEmp;
    }

    public static void printNameAllEmployee() {
        for (Employee empl : employees) {
            if (empl == null) continue;
            System.out.println(empl.getFullName());
        }
    }

}





