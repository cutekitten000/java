public class Task {
    private String title;
    private String description;
    private String status;
    
    public Task(String title, String description, String status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nStatus: " + status + "\n"; 
    }
}
