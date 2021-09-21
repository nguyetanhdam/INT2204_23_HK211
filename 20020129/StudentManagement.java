public class StudentManagement {
    /**
     * same Group.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        } else {
            return false;
        }
    }

    public int cnt = 0;
    boolean[] used = new boolean[100];
    Student[] students = new Student[100];

    public void addStudent(Student newStudent) {
        students[cnt] = newStudent;
        cnt++;
    }

    /**
     * GroupBy.
     */
    public String studentsByGroup() {
        String res = "";
        for (int i = 0; i < cnt; i++) {
            used[i] = false;
        }

        for (int i = 0; i < cnt; i++) {
            if (used[i] == false) {
                res += students[i].getGroup() + '\n';
                res += students[i].getInfo() + '\n';
                for (int j = i + 1; j < cnt; j++) {
                    if (sameGroup(students[i], students[j]) == true) {
                        res += students[j].getInfo() + '\n';
                        used[j] = true;
                    }
                }
            }
        }
        return res;
    }

    /**
     * remove.
     */
    public void removeStudent(String id) {
        int pos = 0;
        for (int i = 0; i < cnt; i++) {
            if (students[i].getId().equals(id)) {
                pos = i;
            }
        }
        for (int i = pos; i < cnt - 1; i++) {
            Student t = new Student(students[i + 1]);
            students[i] = t;
        }
        cnt--;
    }

    /*
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Nguyen Van An");
        s.setId("17020001");
        s.setGroup("K62CC");
        s.setEmail("17020001@vnu.edu.vn");

        Student s1 = new Student();
        s1.setName("Nguyen Van B");
        s1.setId("17020002");
        s1.setGroup("K62CC");
        s1.setEmail("17020002@vnu.edu.vn");

        Student s2 = new Student();
        s2.setName("Nguyen Van C");
        s2.setId("17020003");
        s2.setGroup("K62CB");
        s2.setEmail("17020003@vnu.edu.vn");

        Student s3 = new Student();
        s3.setName("Nguyen Van D");
        s3.setId("17020004");
        s3.setGroup("K62CB");
        s3.setEmail("17020004@vnu.edu.vn");

        StudentManagement sm = new StudentManagement();
        sm.addStudent(s);
        sm.addStudent(s1);
        sm.addStudent(s2);
        sm.addStudent(s3);

        String info = (String) sm.studentsByGroup();
        System.out.println(info);
    }
     */
}