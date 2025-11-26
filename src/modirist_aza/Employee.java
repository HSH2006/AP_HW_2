package modirist_aza;

public class Employee extends Person {
    private String employeeId;
    private String position;
    private double salary;
    private int hoursWorked;
    private static int employeeCounter = 1;

    public Employee(String name, String phoneNumber, String position, double salary) {
        super(name, phoneNumber);
        if (employeeCounter < 10)
            this.employeeId = "E00" + employeeCounter;
        else if (employeeCounter < 100)
            this.employeeId = "E0" + employeeCounter / 10 + employeeCounter;
        else
            this.employeeId = "E" + employeeCounter / 100 + employeeCounter / 10 + employeeCounter;
        employeeCounter++;
        this.position = position;
        this.salary = salary;
        this.hoursWorked = 0;
    }

    public void addHoursWorked(int hours) {
        this.hoursWorked += hours;
    }

    public double calculateSalary() {
        double ans = salary;

        if (hoursWorked > 160) {
            int overTime = hoursWorked - 160;
            double overtimePay = (salary / 160) * 1.5 * overTime;
            ans += overtimePay;
        }

        return ans;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getInfo() {
        return ("ID: " + employeeId + ", Name: " + getName()+", Phone: " + getPhoneNumber() +", Position: " +
                position + ", HoursWorked: " + hoursWorked);
    }
}

