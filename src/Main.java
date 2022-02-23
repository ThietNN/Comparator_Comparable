import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Thiet","HN",24);
        Student student2 = new Student("Trang","HN",23);
        Student student3 = new Student("Huyen","SG",16);
        Student student4 = new Student("Linh","SG",15);

        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for (Student st : list)
            System.out.println(st.toString());

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for (Student st : list)
            System.out.println(st.toString());

    }
}
