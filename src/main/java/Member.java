import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mDescription;
  private boolean mDeleted;
  private LocalDateTime mCreatedAt;
  private static List<Member> instances = new ArrayList<Member>();
  private int mId;

  public Member(String description) {
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

  public static List<Member> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Member find(int id) {
    return instances.get(id - 1);
  }
}
