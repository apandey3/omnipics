package org.amanda;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Amanda Pandey <amanda.pandey@gmail.com>
 */
public class Photo extends DisplayMedia{

    private final File photoFile;

    public Photo(File photoFile){
        this.photoFile = photoFile;
    }

    public List<String> getTags() {
        return tags;
    }

    public File getPhotoFile(){
        return photoFile;
    }

}
