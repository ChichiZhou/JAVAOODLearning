package GoF.template;

public class TransferMoneyTask extends Task {
    /**
     * 虽然在 TransferMoney 中没有定义 execute
     * 但是在其父类中定义过了，所以可用
     */
    public TransferMoneyTask(AuditTrail auditTrail){
        super(auditTrail);
    }
    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }
}
