package protectionapp;

/**
 * Proxy -  Controls access to the real subject and may be responsible for creating and deleting it.
 */
public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy {

    private Staff staff;

    public ReportGeneratorProtectionProxy(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String generateDailyReport() {
        return staff.isOwner()
                ? "Report is generated AS OWNER"
                : "Not Authorized to view report.";
    }
}
