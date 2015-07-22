package org.amanda;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Amanda Pandey <amanda.pandey@gmail.com>
 */
public class Album extends DisplayMedia{

    private final List<Photo> photos = new ArrayList<>();
    private String name;


    public String getName(){
        return name;
    }

    @Override
    public List<String> getTags() {
        return tags;
    }

    public List<Photo> getPhotos(){
        return photos;
    }

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

        String photoDr = photoDirectory.getName();
        String[] parts = photoDr.split("-");
        String s="";
        for (int i = 0; i < parts.length; i++) {
            tags.add(parts[i]);
            s += " "+Character.toUpperCase(parts[i].charAt(0)) + parts[i].substring(1);
        }

        this.name = s.trim();

        File[] pdr = photoDirectory.listFiles();
        for (int i = 0; i < pdr.length; i++){
            Photo p = new Photo(pdr[i]);
            photos.add(p);
        }




        //TODO: Collect list of files in the directory, create Photo from each file and then add Photo to photos


        /**
         * TODO:
         *  1. get all files within this directory get all the photo files and add them to photos list
         *  2. Parse directory name and capture tags and add them to tags
         */
    }


}
