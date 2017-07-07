import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mDescription;
  private boolean mDeleted;
  private LocalDateTime mCreatedAt;
  private static List<Task> instances = new ArrayList<Task>();
  private int mId;

  public Task(String description) {
    mDescription = description;
    mDeleted = false;
    mCreatedAt = LocalDateTime.now();
    instances.add(this);
    mId = instances.size();
  }

  public String getDescription() {
    return mDescription;
  }

  public boolean isDeleted() {
    return mDeleted;
  }

  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

  public static List<Task> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Task find(int id) {
    return instances.get(id - 1);
  }
}
