package scanirovFile;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import skanirovFile.Search;

import java.io.File;
import java.io.IOException;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SearchTest  {
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();


@Test
    public void searchTest() throws IOException {
        List<File> expec = new ArrayList<>();



        File createFolder = folder.newFolder ("next");


        expec.add(folder.newFile("ten.js"));
        expec.add(folder.newFile("sourc.txt"));

        List<String> out =   new Search().search(Paths.get("next "),"js");

        boolean ext = true;
        for(String p:out) {
           if (!p.endsWith("js")) {
               ext = false;
          }
        }
       assertThat(ext, is(true));
        //для прповерки список временных файлов созданных
   // System.out.println(expec.toString());

    }


}







