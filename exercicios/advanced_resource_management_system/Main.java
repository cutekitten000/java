public class Main {
    public static void main(String[] args) {
        ResourceManager resourceManager = new ResourceManager();

        Server server1 = new Server(1, 64, 256, 2);
        Server server2 = new Server(2, 32, 128, 1);
        resourceManager.addServer(server1);
        resourceManager.addServer(server2);

        Task task1 = new Task(101, 1, 16, 64, 1);
        Task task2 = new Task(102, 2, 32, 128, 1);
        Task task3 = new Task(103, 3, 64, 256, 2);

        resourceManager.allocateTask(task1);
        resourceManager.allocateTask(task2);
        resourceManager.allocateTask(task3);

        resourceManager.generateReports();

        resourceManager.rebalanceServers();
        resourceManager.generateReports();
    }
}
