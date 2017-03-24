import java.util.ArrayList;
import java.util.List;

public class Category {
  private String mName;
  private static List<Category> instances = new ArrayList<Category>();
  private int mId;
  private List<Task> mTasks;

  public Category(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
    mTasks = new ArrayList<Task>();
  }

  public String getName() {
    return mName;
  }

  public static List<Category> getAllCategories() {
    return instances;
  }

  public static void clearCategoryArray() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public List<Task> getTasks() {
    return mTasks;
  }

  public void addTask(Task task) {
    mTasks.add(task);
  }

  public static Category findCategoryIndex(int id) {
    return instances.get(id - 1);
  }
}
