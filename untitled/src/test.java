public class test {
    public static void main(String[] args) {
        employee [] arr = new employee[10];
        employeeFulltime staff1 = new employeeFulltime("1", "A", 18, "0123456789", "@mail.com", 100000, 20000, 5000000);
        employeeFulltime staff2 = new employeeFulltime("2", "B", 18, "0123456789", "@mail.com", 200000, 20000, 5000000);
        employeeFulltime staff3 = new employeeFulltime("3", "C", 18, "0123456789", "@mail.com", 300000, 20000, 5000000);
        employeeFulltime staff4 = new employeeFulltime("4", "D", 18, "0123456789", "@mail.com", 400000, 20000, 5000000);
        employeeFulltime staff5 = new employeeFulltime("5", "E", 18, "0123456789", "@mail.com", 500000, 20000, 5000000);

        employeeParttime staff6 = new employeeParttime("6", "a", 20, "113", "codegym.com", 8);
        employeeParttime staff7 = new employeeParttime("7", "a", 20, "113", "codegym.com", 8);
        employeeParttime staff8 = new employeeParttime("8", "a", 20, "113", "codegym.com", 8);
        employeeParttime staff9 = new employeeParttime("9", "a", 20, "113", "codegym.com", 8);
        employeeParttime staff10 = new employeeParttime("10", "a", 20, "113", "codegym.com", 8);

        System.out.println("luong cua nhan vien: "+ arr[0].getSalary());

        String arrangeSalary = arrangeBySalary(arr);
        System.out.println("nhan vien co muc luong thap hon tb: " + arrangeSalary);
        int salaryPartTime = getSalaryparttime(arr);
        System.out.println("so tien cua nhan vien parttime nhan duoc la: " +salaryPartTime);

        employee[] listFullTime = countEmployee(arr);
        employee[] ListSortSalary = sortEmployee(listFullTime);

        String displayReview = reviewArr(ListSortSalary);
        System.out.println("Luong nhan vien FullTime theo thu tu tu thap den cao la: "+displayReview);
    }

    private static int getSalaryparttime(employee[] arr) {
        return 0;
    }


    public static int getSalaryParttime(employee[] arr){
        int sum = 0;
        for (employee employee : arr) {
            if (employee instanceof employeeParttime) {
                sum += employee.getSalary();
            }
        }
        return sum;

    }

    public static int averageSalary(employee[] arr){
        int sum = 0;
        for (employee employee : arr) {
            sum += employee.getSalary();
        }
        return sum/arr.length;
    }
    public static employee[] countEmployee(employee[] arr){
        int count = 0;
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof employeeFulltime){
                count++;
            }
        }
        employee[] newArr = new employee[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof employeeFulltime){
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }

    public static employee[] sortEmployee(employee [] arr){
        employee temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].getSalary() > arr[j].getSalary()){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    //    DUyet mang
    public static String reviewArr(employee[] arr){
        String displayReviewArr = "";
        for (employee employee : arr) {
            displayReviewArr += employee.getName() + "; ";
        }
        return displayReviewArr;
    }



    public static  String arrangeBySalary(employee[] arr){
        StringBuilder displayArrangeBySalary = new StringBuilder();
        for (employee employee : arr) {
            if (employee instanceof employeeFulltime) {
                if (employee.getSalary() < averageSalary(arr)) {
                    displayArrangeBySalary.append(employee.getName()).append("; ");
                }
            }
        }
        return displayArrangeBySalary.toString();

    }
}
