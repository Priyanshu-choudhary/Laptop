public class Encapluation {
    public static void main(String[] args) {
        Encapluation  obj = new  Encapluation();
        Employee doctor = new  Employee();
        
        doctor.setEmpName("priyanshu");
        doctor.setEmpId(99999); 
        doctor.setEmpSalery(00000);

        System.out.println(doctor.getEmpId());
        System.out.println(doctor.getEmpSalery());
        System.out.println(doctor.getEmpName());
        
    }

   
}
