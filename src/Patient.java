public class Patient {
    private String name;
    private int age;
    private String patientId;
    private String medicalHistory;
    public Patient(String name, int age, String patientId, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.patientId = patientId;
        this.medicalHistory = medicalHistory;
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

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void updateMedicalHistory(String newEntry) {
         medicalHistory =  medicalHistory +" & "+ newEntry;
    }
    public boolean isMinor(){
        return age < 18;
    }
    public static String getHospitalName() {
        return "General Hospital";
    }
}
class patientTest{
    public static void main(String[] args) {
        Patient p = new Patient("ahmed", 20, "A1", "A");
        p.updateMedicalHistory("B");
        System.out.println(p.getMedicalHistory());
        System.out.println(p.isMinor());
        System.out.println("patientId: " + p.getPatientId() + " name: " + p.getName() + " age: " + p.getAge() + " medicalHistory: " + p.getMedicalHistory());
        System.out.println(Patient.getHospitalName());
    }
}
