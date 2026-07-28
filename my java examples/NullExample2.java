
class Student
{
    String name ="ashu";
    int age;
}

class NullExample2
{
    public static void main(String[] args)
    {
        Student s = null;

        try
        {
            System.out.println("Student Name: " + s.name);
        }
        catch(NullPointerException e)
        {
            System.out.println("Student object is not created.");
        }

        System.out.println("Program completed.");
    }
}