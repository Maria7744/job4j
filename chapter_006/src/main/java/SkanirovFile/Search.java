package SkanirovFile;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.List;
import java.nio.file.Path;

public class Search {
    public static void main(String[] args) {

    }

    public static void search(Path root, String ext) throws IOException {
        List<String> list = new LinkedList<>();
        Path start = Paths.get(".");
        String fileNameToFind = "js";
        try {

            Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
                    if (path.toFile().getName().equals(fileNameToFind)) {
                        list.add(path.toString());
                        System.out.println("Found: " + path.toString());
                    }
                    return FileVisitResult.CONTINUE;
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





