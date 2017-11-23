package protectionapp;

public class Main {

    public static void main(String[] args) {
        Owner owner = new Owner();

        ReportGeneratorProxy reportGenerator = new ReportGeneratorProtectionProxy(owner);
        owner.setReportGenerator(reportGenerator);

        Employee employee = new Employee();
        reportGenerator = new ReportGeneratorProtectionProxy(employee);
        employee.setReportGenerator(reportGenerator);

        System.out.println("[For owner]: \t\t" + owner.generateDailyReport());
        System.out.println("[For employee]: \t" + employee.generateDailyReport());

    }

}
