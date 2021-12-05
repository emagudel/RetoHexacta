package com.company.certification.hexacta.util.properties;

import com.company.certification.hexacta.exceptions.HexactaException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HexactaProperties {

    private static Properties prop = null;

    private HexactaProperties() {
        throw new IllegalStateException();

    }

    public static String getUrlFront() {
        loadProperties();
        return prop.getProperty("UrlFront");

    }

    public static void loadProperties() {
        if (prop == null) {
            prop = new Properties();
            File objclasspathRoot = new File(System.getProperty("user.dir"));
            String strFilePath = objclasspathRoot.getAbsolutePath();

            try {
                prop.load(new FileReader(strFilePath + "/hexacta.properties"));
            } catch (IOException e) {
                throw new HexactaException(e);
            }
        }
    }



}
