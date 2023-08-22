 class Employee{
     private static int empId=2;
     private String empName="yadi";
     private int empSalery=1000;
   
    public static int getEmpId() {
        return empId;
    }
    public static void setEmpId(int empId) {
        Employee.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpSalery() {
        return empSalery;
    }
    public void setEmpSalery(int empSalery) {
        this.empSalery = empSalery;
    }

}
