import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectOutputStream;   // ✅ ADD THIS

class Student implements Serializable {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream {
    CustomObjectOutputStream(FileOutputStream fo) throws IOException {
        super(fo);
    }
    protected void writeStreamHeader() throws IOException {
        // Do not write a header
    }
}

public class serialisation {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("Alice", 85);

        FileOutputStream fo = new FileOutputStream("studentest.txt"); // ✅ specify the file name
        CustomObjectOutputStream oo = new CustomObjectOutputStream(fo);// ✅ use CustomObjectOutputStream to write the object

        oo.writeObject(s1);// ✅ serialize the object

        oo.close(); // ✅ close the Custom ObjectOutputStream
        fo.close();   // ✅ good practice

        System.out.println("Serialized successfully");
    }
}
