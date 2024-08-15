public class Server {
    private int serverId;
    private int totalCpu;
    private int totalMemory;
    private int totalStorage;
    private int allocatedCpu;
    private int allocatedMemory;
    private int allocatedStorage;
    private List<Task> taskList;

    public Server(int serverId, int totalCpu, int totalMemory, int totalStorage) {
        this.serverId = serverId;
        this.totalCpu = totalCpu;
        this.totalMemory = totalMemory;
        this.totalStorage = totalStorage;
        this.allocatedCpu = 0;
        this.allocatedMemory = 0;
        this.allocatedStorage = 0;
        this.taskList = new ArrayList<>();
    }

    // Add Task
    public boolean addTask(Task task) {
        if (canAllocate(task)) {
            taskList.add(task);
            allocatedCpu += task.getCpuRequirement();
            allocatedMemory += task.getMemoryRequirement();
            allocatedStorage += task.getStorageRequirement();
            task.setStatus("Running");
            return true;
        }
        return false;
    }

    // Remove Task
    public void removeTask(Task task) {
        if (taskList.remove(task)) {
            allocatedCpu -= task.getCpuRequirement();
            allocatedMemory -= task.getMemoryRequirement();
            allocatedStorage -= task.getStorageRequirement();
            task.setStatus("Stopped");
        }
    }

    // Check if resources are available
    private boolean canAllocate(Task task) {
        return allocatedCpu + task.getCpuRequirement() <= totalCpu &&
               allocatedMemory + task.getMemoryRequirement() <= totalMemory &&
               allocatedStorage + task.getStorageRequirement() <= totalStorage;
    }

    // Getters

    public int getServerId() {
        return serverId;
    }

    public int getTotalCpu() {
        return totalCpu;
    }

    public int getTotalMemory() {
        return totalMemory;
    }

    public int getTotalStorage() {
        return totalStorage;
    }

    public int getAllocatedCpu() {
        return allocatedCpu;
    }

    public int getAllocatedMemory() {
        return allocatedMemory;
    }

    public int getAllocatedStorage() {
        return allocatedStorage;
    }

    public List<Task> getTaskList() {
        return taskList;
    }
}
