import java.util.ArrayList;

public class AssignmentOne {

    // 用于存储预约的列表
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        System.out.println("Part 3 – Using classes and objects");

        // 创建3个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", "Family Medicine", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Johnson", "General Practice", true);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Brown", "Pediatrics", false);

        // 创建2个外科医生对象
        Surgeon surgeon1 = new Surgeon(201, "Dr. Wilson", "Cardiac Surgery", "Heart Surgery");
        Surgeon surgeon2 = new Surgeon(202, "Dr. Davis", "Orthopedics", "Knee Replacement");

        // 打印所有医生的详细信息
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        surgeon1.printDetails();
        surgeon2.printDetails();

        System.out.println("---");

        // Part 5 – Collection of appointments
        System.out.println("Part 5 – Collection of appointments");

        // 创建预约
        createAppointment("John Doe", "0412345678", "09:00", gp1);
        createAppointment("Jane Smith", "0498765432", "10:30", gp2);
        createAppointment("Alice Brown", "0432145698", "14:00", surgeon1);
        createAppointment("Bob White", "0456789123", "15:30", surgeon2);

        // 打印现有预约
        printExistingAppointments();

        // 取消一个预约
        cancelBooking("0498765432");

        // 再次打印预约以显示更新
        printExistingAppointments();

        System.out.println("---");
    }

    // 创建预约的方法
    public static void createAppointment(String patientName, String patientMobile,
                                         String timeSlot, HealthProfessional doctor) {
        if (patientName != null && !patientName.isEmpty() &&
                patientMobile != null && !patientMobile.isEmpty() &&
                timeSlot != null && !timeSlot.isEmpty() &&
                doctor != null) {

            Appointment newAppointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
            appointments.add(newAppointment);
            System.out.println("Appointment created successfully for " + patientName);
        } else {
            System.out.println("Failed to create appointment. All fields are required.");
        }
    }

    // 打印现有预约
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Current Appointments:");
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println("-------------------");
            }
        }
    }

    // 取消预约
    public static void cancelBooking(String patientMobile) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientMobile)) {
                String patientName = appointments.get(i).getPatientName();
                appointments.remove(i);
                System.out.println("Appointment for " + patientName + " (Mobile: " + patientMobile + ") has been cancelled.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with mobile number: " + patientMobile);
        }
    }
}