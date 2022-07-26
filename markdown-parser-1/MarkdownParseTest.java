import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile() throws IOException
    {
        String contents = Files.readString(Path.of("D:/UCSD/cse 15l/github/markdown-parser-1/test-file.md"));
        List<String> expect = List.of("https://something.com", "some-thing.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile2() throws IOException {
        String contents= Files.readString(Path.of("D:/UCSD/cse 15l/github/markdown-parser-1/test-file2.md"));
        List<String> expect = List.of("https://google.com", "some-thing.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile3() throws IOException{
        Path fileName = Path.of("D:/UCSD/cse 15l/github/markdown-parser-1/test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }


}