import junit.framework.Assert;
import org.amanda.Album;
import org.junit.Test;

import java.io.File;

/**
 * @author Amanda Pandey <amanda.pandey@gmail.com>
 */
public class AlbumTest {

    @Test
    public void listPhotos(){
        Album a = new Album(new File("/Users/amanda/Photos/2014/vacations/india"));
        Assert.assertTrue(a.getTags().size() > 0);
        Assert.assertTrue(a.getPhotos().size() > 0);
    }
}
