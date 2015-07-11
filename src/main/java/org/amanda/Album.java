package org.amanda;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Amanda Pandey <amanda.pandey@gmail.com>
 */
public class Album extends DisplayMedia{

    private final List<Photo> photos = new ArrayList<>();

    /**
     *
     * Creates an album by capturing all the photos inside photoDirectory.
     *
     * @param photoDirectory Path to a directory which has photo files
     *
     *                       Directory name is any name with optional '-' separated words. Each word should be
     *                       interpreted as a tag.
     *
     *                       e.g. amanda-16th-birthday will result in to 3 tags: amanda, 16th and birthday
     *
     * @throws IllegalArgumentException if photoDirectory is either not
     */
    public Album(File photoDirectory){
        if(!photoDirectory.isDirectory() && !photoDirectory.canRead()){
            throw new IllegalArgumentException(photoDirectory.getName() + " must be a directory and readable.");
        }

        /**
         * TODO:
         *  1. get all files within this directory get all the photo files and add them to photos list
         *  2. Parse directory name and capture tags and add them to tags
         */
    }

    @Override
    public List<String> getTags() {
        return tags;
    }

    public List<Photo> getPhotos(){
        return photos;
    }
}
