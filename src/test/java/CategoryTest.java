import org.junit.*;
import static org.junit.Assert.*;

public class CategoryTest {

  @After
  public void tearDown() {
    Category.clearCategoryArray();
  }

  @Test
  public void category_instantiatesObjectCorrectly_true() {
    Category myCategory = new Category("home");
    assertEquals(true, myCategory instanceof Category);
  }

  @Test
  public void category_addsNameToNewObject() {
    Category myCategory = new Category("home");
    assertEquals("home", myCategory.getName());
  }

  @Test
  public void category_addAllObjectsToArrayList() {
    Category myCategory = new Category("home");
    Category myCategory2 = new Category("home");
    assertEquals(myCategory, Category.getAllCategories().get(0));
  }

  @Test
  public void category_eachObjectAssignedIdCorrectly() {
    Category myCategory = new Category("home");
    assertEquals(myCategory.getId(), 1);
  }

  @Test
  public void getTasks_initiallyReturnsEmptyList_ArrayList() {
    Category myCategory = new Category("home");
    assertEquals(0, myCategory.getTasks().size());
  }

  @Test
  public void addTask_addsTaskToList_true() {
    Category myCategory =  new Category("home");
    Task myTask = new Task("Shine your shoes");
    myCategory.addTask(myTask);
    assertTrue(myCategory.getTasks().contains(myTask));
  }
}
