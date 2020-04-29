package com.xcart.demostore.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Ravi's Creation
 * Date of Creation 29 Apr 20
 */
public class Loadproperty {

    String projectPath = System.getProperty("user.dir");

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key){
        prop = new Properties();

        try {
            input = new FileInputStream(projectPath + "/src/test/java/com/xcart/demostore/resources/properties/config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
