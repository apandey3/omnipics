package org.amanda;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Amanda Pandey <amanda.pandey@gmail.com>
 */
public class Photo implements Media{

    private final List<String> tags = new ArrayList<>();
    private final File photoFile;

    public Photo(File photoFile){
        this.photoFile = photoFile;
    }

    public List<String> getTags() {
        return tags;
    }

}
