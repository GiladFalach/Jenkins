import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JenkinsTask {

    public static void main(String[] args) throws IOException {

        File dir = new File("c:\\AAAA");
        Stack<File> stack = new Stack<File>();
        stack.push(dir);
        while(!stack.isEmpty()) {
          File child = stack.pop();
          if (child.isDirectory()) {
            for(File f : child.listFiles()) stack.push(f);
          } else if (child.isFile()) {
            System.out.println(child.getPath());
          }
        }
		
		
	}
}

