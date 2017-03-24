import java.util.ArrayList;
import java.util.List;

public class Task {
  private String mName;
  private static List<Task> instances = new ArrayList<Task>();
  private int mId;

  public Task(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mName;
  }

  public static void clearTaskArray() {
    instances.clear();
  }

  public static List<Task> getAllTasks() {
    return instances;
  }

  public int getId() {
    return mId;
  }
}
