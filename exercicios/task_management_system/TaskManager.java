public class TaskManager {
    private List<Task> tasks;
    
    public TaskManager() {
        tasks = new ArrayList<>();
    }
    
    public void addTask(Task task) {
        tasks.add(task);
    }
    
    public void removeTask(String title) {
        tasks.removeIf(task -> task.getTitle().equals(title));
    }
    
    public void listTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
