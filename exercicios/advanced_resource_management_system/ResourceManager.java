public class ResourceManager {
    private List<Server> serverList;
    private List<Task> taskQueue;

    public ResourceManager() {
        this.serverList = new ArrayList<>();
        this.taskQueue = new ArrayList<>();
    }

    // Add Server
    public void addServer(Server server) {
        serverList.add(server);
    }

    // Remove Server
    public void removeServer(Server server) {
        serverList.remove(server);
    }

    // Allocate Task
    public void allocateTask(Task task) {
        Server bestServer = null;

        for (Server server : serverList) {
            if (server.addTask(task)) {
                bestServer = server;
                break;
            }
        }

        if (bestServer == null) {
            taskQueue.add(task);
            System.out.println("Task " + task.getTaskId() + " is queued due to insufficient resources.");
        } else {
            System.out.println("Task " + task.getTaskId() + " allocated to Server " + bestServer.getServerId());
        }
    }

    // Rebalance Servers
    public void rebalanceServers() {
        for (Server server : serverList) {
            List<Task> tasksToReallocate = new ArrayList<>();

            for (Task task : server.getTaskList()) {
                if (!server.addTask(task)) {
                    tasksToReallocate.add(task);
                    server.removeTask(task);
                }
            }

            for (Task task : tasksToReallocate) {
                allocateTask(task);
            }
        }
    }

    // Generate Reports
    public void generateReports() {
        for (Server server : serverList) {
            System.out.println("Server ID: " + server.getServerId());
            System.out.println("Total CPU: " + server.getTotalCpu() + " Cores");
            System.out.println("Total Memory: " + server.getTotalMemory() + " GB");
            System.out.println("Total Storage: " + server.getTotalStorage() + " TB");
            System.out.println("Allocated CPU: " + server.getAllocatedCpu() + " Cores");
            System.out.println("Allocated Memory: " + server.getAllocatedMemory() + " GB");
            System.out.println("Allocated Storage: " + server.getAllocatedStorage() + " TB");
            System.out.println("Running Tasks: " + server.getTaskList().size());
            System.out.println("--------------------");
        }
    }
}
