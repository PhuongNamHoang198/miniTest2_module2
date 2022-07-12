public class employeeFulltime extends employee {
    private double bonus;
    private double fine;
    private double salary;

    public  employeeFulltime(){}
    @Override
    public int getSalary() {
        return (int) (getSalary() + getBonus()- getFine());
    }
    public employeeFulltime(String employeeCode, String name, int age, String phoneNumber, String email, double bonus, double fine, double salary) {
        super(Integer.parseInt(employeeCode), name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public employeeFulltime(double bonus, double fine, double salary) {
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

//    public int getSalary() {
//        return (int) salary;
//    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
