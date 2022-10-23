import java.util.ArrayList;
import java.util.Date;

public class StudentList {
    ArrayList<Student> List;

    StudentList() {
        this.List = new ArrayList<>();
    }

    StudentList(StudentList studentList) {
        this.List = new ArrayList<>();
        for (Student student : studentList.List){
            this.List.add(new Student(student.getFirstname(), student.getLastname(), student.getStudentId(), student.getWeight(), new Date(student.getBirthday().getTime())));
        }
    }

    boolean add(Student student) {
        for (int i = 0; i < this.List.size(); i++) {
            if (student.getStudentId() == this.List.get(i).getStudentId()) {
                return false;
            }
        }
        this.List.add(student);
        return true;
    }

    boolean remove(Student student) {
        for (int i = 0; i < this.List.size(); i++) {
            if (student.getStudentId() == this.List.get(i).getStudentId()) {
                this.List.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * @param pos the index of the entry to be deleted
     * @return null if no entry was deleted else the deleted Student is returned
     */
    Student remove(int pos) {
        if (pos < this.List.size() && pos >= 0) {
            Student student = this.List.get(pos);
            this.List.remove(pos);
            return student;
        }
        return null;
    }

    Student get(int pos) {
        if (pos < this.List.size() && pos >= 0) {
            return this.List.get(pos);
        }
        return null;
    }

    ArrayList<Integer> findLastname(String lastname) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < this.List.size(); i++) {
            if (lastname.equals(this.List.get(i).getLastname())) {
                indices.add(i);
            }
        }
        return indices;
    }

    ArrayList<Integer> findFirstname(String firstname) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < this.List.size(); i++) {
            if (firstname.equals(this.List.get(i).getFirstname())) {
                indices.add(i);
            }
        }
        return indices;

    }
    ArrayList<Integer> findStudentsByAge(int age) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < this.List.size(); i++) {
            long diff = new Date().getTime() - this.List.get(i).getBirthday().getTime();
            int studentAge = new Date(diff).getYear();
            if (age == studentAge) {
                indices.add(i);
            }
        }
        return indices;
    }
    int size(){
        return this.List.size();
    }
    private boolean containsId(final long studentId){
        for (int i = 0; i < this.List.size(); i++) {
            if (studentId == this.List.get(i).getStudentId()) {
                return true;
            }
        }
        return false;
    }
}