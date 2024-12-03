package introoop;

public class Student {
    protected String name;
    public int age;
    private int psp;
    int roll ;
    public Student()
    {
        name = "new student";
        age = 20;
        psp = 100;
        roll = 2;
    }

    void  attandance(){
        System.out.println("student " + name + " is attandance class");
    }
    public int getPsp(){
        return psp;
    }
    public void setPsp(int pspval){
        if(pspval < 0 || pspval > 100){
            throw new RuntimeException("Invalid psp");
        }
        psp = pspval;
    }
}

