public class RecurringTask extends Task {
    private String frequency;
    
    public RecurringTask(String title, String description, String status, String frequency) {
        super(title, description, status);
        this.frequency = frequency;
    }
    
    public String getFrequency() {
        return frequency;
    }
    
    public String toString() {
        return super.toString() + "Frequency: " + frequency + "\n";
    }
}
