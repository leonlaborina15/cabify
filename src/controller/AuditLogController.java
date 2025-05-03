package controller;

import java.util.ArrayList;
import java.util.List;
import model.AuditLog;

public class AuditLogController {
    private List<AuditLog> auditLogs;

    public AuditLogController() {
        this.auditLogs = new ArrayList<>();
    }

    public void addLog(AuditLog log) {
        auditLogs.add(log);
        System.out.println("Audit log added: " + log.getAction());
    }

    public List<AuditLog> getAllLogs() {
        return auditLogs;
    }
}