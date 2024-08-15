public class Task {
    private int taskId;
    private int priority; // 1 - HIGH 2 - MEDIUM 3 - LOW
    private int cpuRequirement;
    private int memoryRequirement;
    private int storageRequirement;
    private String status;
    
    public Task(int taskId, int priority, int cpuRequirement, int memoryRequirement, int storageRequirement) {
        this.taskId = taskId;
        this.priority = priority;
        this.cpuRequirement = cpuRequirement;
        this.memoryRequirement = memoryRequirement;
        this.storageRequirement = storageRequirement;
        this.status = "Pending";
    }
    
    public int getTaskId() {
        return taskId;
    }
    
    public int getPriority() {
        return priority;
    }
    
    public int getCpuRequirement() {
        return cpuRequirement;
    }
    
    public int getMemoryRequirement() {
        return memoryRequirement;
    }
    
    public int getStorageRequirement() {
        return storageRequirement;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
