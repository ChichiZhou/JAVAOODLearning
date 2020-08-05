package GoF.template;

public class Main {
    public static void main(String[] args) {
        AuditTrail auditTrail = new AuditTrail();
        Task taskTansferMoney = new TransferMoneyTask(auditTrail);
        taskTansferMoney.execute();

        Task generateReport = new GenerateReportTask(auditTrail);
        generateReport.execute();

    }
}
