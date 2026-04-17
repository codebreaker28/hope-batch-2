import java.io.File;
import java.io.IOException;

public class FileExample{
    public static void main(String[] args) throws IOException{
        /*File newFile = new File("test.txt");
        System.out.println("File created");

        if(newFile.createNewFile()){
            System.out.println("File Created:"+newFile.getName());
        }
        //System.out.print("args");*/
        try{
            File newFile = new File("test.txt");
            System.out.println("File created");

            if(newFile.createNewFile()){
                System.out.println("File Created:"+newFile.getName());
            }
            else{
                System.out.println("Noy able to create file");
            }
        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
}
