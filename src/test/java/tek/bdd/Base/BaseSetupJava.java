package tek.bdd.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetupJava {
    //make a logger vaiable to be able to log the initialization process
    public static final Logger LOGGER = LogManager.getLogger(BaseSetupJava.class);
    //make an instantiated variable of driver
    private static WebDriver driver;
    //make a variable to get access to properties library and use config file
    private Properties properties;

    public BaseSetupJava() {
        try {
            String configFilePath = System.getProperty("user.dir") +
                    "/src/test/resources/configs/dev-config.properties";
            LOGGER.info("Reading Config file: {}", configFilePath);
            File file = new File(configFilePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch ( IOException e) {
            LOGGER.error("Error Reading Config file ", e);
            throw new RuntimeException("Config file is wrong check the config file", e);
        }
    }




}

