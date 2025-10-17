package Test;

import java.io.File;

public class FolderCreation {

    public static void main(String[] args) {
        String basePath = "D:\\foldertest";
        String[] folderNames = {"new", "new2", "new3"};

        for (int i = 0; i < folderNames.length; i++) {
            File subFolder = new File(basePath + "\\" + folderNames[i]);
            
            if (subFolder.mkdir()) {
                System.out.println(folderNames[i] + " created.");
            } else {
                System.out.println(folderNames[i] + " creation failed or already exists.");
            }
        }
    }
}
