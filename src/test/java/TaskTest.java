import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @After
    public void tearDown() {
      Task.clearTaskArray();
    }

  @Test
  public void task_objectInstantiatesCorrectly_true() {
    Task myTask = new Task("do some stuff");
    assertEquals(true, myTask instanceof Task);
  }

  @Test
  public void task_nameIsAssignedCorrectly_true() {
    Task myTask = new Task("do some stuff");
    assertEquals("do some stuff", myTask.getName());
  }

  @Test
  public void task_allObjectsAssignedToArrayList() {
    Task myTask = new Task("eat something today");
    Task myTask2 = new Task("work out");
    assertEquals(myTask, Task.getAllTasks().get(0));
  }

  @Test
  public void task_allObjectsAssignedIdCorrectly() {
    Task myTask = new Task("eat something today");
    assertEquals(myTask.getId(), 1);
  }

}
