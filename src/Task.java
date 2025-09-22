import java.time.LocalDateTime;

public class Task {
  public enum Status { TODO, IN_PROGRESS, DONE }
  private int id;
  private String description; 
  private Status status;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public Task(int id, String description) {
    this.id = id;
    this.description = description;
    this.status = Status.TODO;
    this.createdAt = LocalDateTime.now();
    this.updatedAt = LocalDateTime.now();
  }

  @Override
  public String toString() {
    return "Task ID: " + id + ", Description: " + description + ", Status: " + status + ", Created At: " + createdAt + ", Updated At: " + updatedAt;
  } 
}