public class Task {
  public enum Status { TODO, IN_PROGRESS, DONE }
  private int id;
  private String description; 
  private Status status;
  private java.util.Date createdAt;
  private java.util.Date updatedAt;

  public Task(int id, String description) {
    this.id = id;
    this.description = description;
    this.status = Status.TODO;
    this.createdAt = new java.util.Date();
    this.updatedAt = new java.util.Date();
  }

  @Override
  public String toString() {
    return "Task ID: " + id + ", Description: " + description + ", Status: " + status + ", Created At: " + createdAt + ", Updated At: " + updatedAt;
  } 
}