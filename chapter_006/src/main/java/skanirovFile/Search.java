package skanirovFile;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.nio.file.Path;

public class Search {
    public static void main(String[] args) throws IOException {
        Path start = Paths.get(".");
        //Files.walkFileTree(start, new SimpleFileVisitor<Path>() ;
        Files.walkFileTree(start, new PrintFiles());

    }
    public static List<String> search(Path root, String ext) throws IOException {






                     //   public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) throws IOException {
                          /*  if (path.toFile().getName().equals(fileNameToFind)) {
                                List<String> list = new Search().search(Paths.get("."), "js");
                                list.add(path.toString());
                                System.out.println("Found: " + list.toString());
                            }
                            return FileVisitResult.CONTINUE;
                        }
                    });


        return null;*/
                            Files.walkFileTree(root, new PrintFiles());
                            return PrintFiles.result(ext);
                        }
    }






