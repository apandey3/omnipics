import junit.framework.Assert;
import org.amanda.Album;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Amanda Pandey <amanda.pandey@gmail.com>
 */
public class AlbumTest {

    private File testDir;

    @Before
    public void setup() throws IOException {
        this.testDir = new File("/tmp/test/photos/2014/vacations/india-travel");
        this.testDir.mkdirs();
        //todo: add a.jpg and b.jpg to testDir
    }

    @After
    public void cleanup() throws IOException {
        this.testDir.delete();
    }


    @Test
    public void listPhotos(){
        Album a = new Album(testDir);
        Assert.assertTrue(a.getTags().size() > 0);
        Assert.assertTrue(a.getPhotos().size() > 0);
    }
}
