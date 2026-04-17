import java.io.FileReader;
import java.io
public class FileRead {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("test.txt");
            int character;
            while((character = fr.read())!=-1){
                //character = fr.read();
                System.out.print(character);
            }
        }
        catch(IOException e){
            System.out.printl(e);
        }
    }
}
