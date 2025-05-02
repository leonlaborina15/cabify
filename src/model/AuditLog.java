
package model;

import java.security.Timestamp;


public class AuditLog {
      private int logId;
    private int userId;
    private String action;
    private String description;
    private Timestamp createdAt;

    public AuditLog(int logId, int userId, String action, String description, Timestamp createdAt) {
        this.logId = logId;
        this.userId = userId;
        this.action = action;
        this.description = description;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
    
}
