
import studenttemplate.StudentTemplate;


public class StudentTexture 
{
public static void main(String [] args)
{
    Student s1 = new Student("Jomal");
    Student s2 = new Student("Jomal");
    Student s3 = new Student("Jomal");
    
   
    Student[] list = new Student[3];
    list[0] = s1;
    list[1] = s2;
    list[3] = s3;
    for(int i = 0;i<list.length;i++){
    System.out.println(list[i].getName());
    }
    
    
}
}
