package Part_1_2;

class lesson 
{
	private String name;

	public lesson(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}

public class JavaCourse
{
  public int studentCount = 0;
  public static String platform = "Product Star";

  public JavaCourse (int studentCount)
  {
    this.studentCount = studentCount;
  }


  public static void main (String[]args)
  {
    JavaCourse firstCourse = new JavaCourse (10);
    System.out.println (firstCourse.studentCount);
    System.out.println (JavaCourse.platform);
    
    JavaCourse secondCourse = new JavaCourse(100);
    System.out.println (secondCourse.studentCount);
    System.out.println (JavaCourse.platform);
    
    System.out.println (JavaCourse.platform);
    
    lesson firstLesson = new lesson("First lesson");
    System.out.println (firstLesson.getName());
  }
}