public class employeeParttime extends employee {
    private int workHours;

    public employeeParttime() {}

    public employeeParttime(int workHours) {
        this.workHours = workHours;
    }

    public employeeParttime(String employeeCode, String name, int age, String phoneNumber, String email, int workHours) {
        super(Integer.parseInt(employeeCode), name, age, phoneNumber, email);
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getSalary() {
        return (int) (getWorkHours()*100000);
    }
}
