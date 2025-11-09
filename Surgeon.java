public class Surgeon extends HealthProfessional {
    // 额外实例变量 - 区分外科医生
    private String surgeryType;

    // 默认构造函数
    public Surgeon() {
    }

    // 带参数的构造函数
    public Surgeon(int id, String name, String specialization, String surgeryType) {
        super(id, name, specialization);
        this.surgeryType = surgeryType;
    }

    // 打印详细信息
    public void printDetails() {
        System.out.println("=== Surgeon Details ===");
        System.out.println("Type: Surgeon");
        super.printDetails();
        System.out.println("Surgery Type: " + surgeryType);
        System.out.println("=====================");
    }

    // Getter和Setter
    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }
}