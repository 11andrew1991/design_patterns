package protectionapp;

/**
 * RealSubject
 */
public interface Staff {

    boolean isOwner();

    void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
