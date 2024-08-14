public class PriorityTask extends Task {
    private int priorityLevel;
    
    public PriorityTask(String title, String description, String status, int priorityLevel) {
        super(title, description, status);
        this.priorityLevel = priorityLevel;
    }
    
    public int getPriorityLevel() {
        return priorityLevel;
    }
    
    public String toString() {
        String tempPriority = "";
        
        if (priorityLevel == 1) {
            tempPriority = "High";
        } else if (priorityLevel == 2) {
            tempPriority = "Medium";
        } else if (priorityLevel == 3) {
            tempPriority = "Low";
        }
        return super.toString() + "Priority: " + tempPriority + "\n";
    }
}
