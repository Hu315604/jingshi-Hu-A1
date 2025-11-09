public class GeneralPractitioner extends HealthProfessional {
    // 额外实例变量 - 区分全科医生和其他医生
    private boolean canPrescribeMedication;

    // 默认构造函数
    public GeneralPractitioner() {
    }

    // 带参数的构造函数
    public GeneralPractitioner(int id, String name, String specialization, boolean canPrescribeMedication) {
        super(id, name, specialization); // 调用父类构造函数
        this.canPrescribeMedication = canPrescribeMedication;
    }

    // 打印详细信息（重写父类方法）
    public void printDetails() {
        System.out.println("=== General Practitioner Details ===");
        System.out.println("Type: General Practitioner");
        super.printDetails(); // 调用父类的打印方法
        System.out.println("Can Prescribe Medication: " + (canPrescribeMedication ? "Yes" : "No"));
        System.out.println("================================");
    }

    // Getter和Setter
    public boolean isCanPrescribeMedication() {
        return canPrescribeMedication;
    }

    public void setCanPrescribeMedication(boolean canPrescribeMedication) {
        this.canPrescribeMedication = canPrescribeMedication;
    }
}