package HandlingMechanisms;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;


public class CreateNewFile {

	
        void createFileUsingFileClass1() {
		}
        void createFileUsingFileOutputStreamClass1() {
		}
       void createFileIn_NIO1() {
		}
 
    public static void createFileUsingFileClass() throws IOException
    {
          File file = new File("c://temp//testFile1.txt");
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Test data");
          writer.close();
    }
 
    public static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("c://temp//testFile2.txt");
        out.write(data.getBytes());
        out.close();
    }
 
    public static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data";
        Files.write(Paths.get("c://temp//testFile3.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
       Files.write(Paths.get("file6.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);


	}

}
