package GoF.template;

public abstract class Task {
    private AuditTrail auditTrail;

    // 两个构造器
    public Task(){
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail){
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
