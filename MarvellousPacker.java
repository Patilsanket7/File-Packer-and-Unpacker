import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class MarvellousPacker
{
    FileOutputStream outputStream = null;

    String ValidExt[] = {".txt", ".c",".java",".cpp"};

    public MarvellousPacker(String src, String Dest) throws Exception
    {
       String Magic = "Marvellous11";
       byte arr[] = Magic.getBytes();
       File outfile = new File(Dset);

       File folder = new File(src);

       System.setProperty("user.dir",src);

       listAllFiles(src);
    }

    public void listAllFiles(String path)
    {
        try
        (Stream<Path> paths = Files.walk(paths.get(path)))
        {
            paths.forEach(filePath->
            {
             if(File.isRegularFile(filePath))
                {
                 try
                   {
                     String name = filePath.getFileName().toString();
                     String ext = name.substring(name.lastIndexOf("."));

                     List<String> list = Array.asList(ValidExt);

                     if(list.contans(ext))
                      {
                        File file = new File(filePath.getFileName().toString());

                        pack(file.getAbsolutePath());
                      }
                   }
                   catch(Exception e)
                    {
                      System.out.println(e);
                    }
                }
            });
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    public void Pack(String filePath)
    {
        FileInputStream inputStream = null;
        
        try
        {
            byte[] buffer = new bytr[1024];

            int length;
            byte temp[] = new  byte[100];

            File fobj = new File(filePath);

            String Header = filePath+" "+fobj.length();

            for(int i = Header.length(); i < 100; i++)
              Header+=" ";

            temp = Header.getBytes();
            
            inStream = new FileInputStream(filePath);

            outStream.write(temp, 0 , temp.length);

            while((length = instream.read(buffer)) > 0)
            {
                outstraem.write(buffer, 0 , length);
            }

            instream.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
