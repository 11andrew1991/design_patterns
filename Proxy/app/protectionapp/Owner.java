package protectionapp;

/**
 * RealSubject - A protection proxy controls access to the original object
 */
public class Owner implements Staff {

    private boolean isOwner;

    private ReportGeneratorProxy reportGenerator;

    @Override
    public boolean isOwner() {
        return true;
    }

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public String generateDailyReport(){
        try {
            return reportGenerator.generateDailyReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
