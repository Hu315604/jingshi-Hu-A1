public class Appointment {
    // 实例变量
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor;

    // 默认构造函数
    public Appointment() {
    }

    // 带参数的构造函数
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // 打印预约详情
    public void printAppointmentDetails() {
        System.out.println("Patient: " + patientName);
        System.out.println("Mobile: " + patientMobile);
        System.out.println("Time: " + timeSlot);
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Doctor Type: " + (doctor instanceof GeneralPractitioner ? "General Practitioner" : "Surgeon"));
    }

    // Getter和Setter方法
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
}