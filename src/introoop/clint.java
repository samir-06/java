package introoop;

public class clint {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "samir";
        st.age = 21;
        st.attandance();
        st.setPsp(1);
        System.out.println(st.age);
        System.out.println(st.getPsp());

    }
}
