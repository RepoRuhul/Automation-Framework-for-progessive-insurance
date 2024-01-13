package utils;

import java.io.IOException;
import java.util.Properties;

import constants.Profile;

public class Configuration {

	private Properties properties = new Properties();

	String generalConfig = "configuration.properties";
	String browserStackConfig = "browserstack.properties";

	public Configuration(Profile profile) {

		switch (profile) {
		case GENERAL:
			loadProperty(generalConfig);
			break;
		case BROWSERSTACK:
			loadProperty(browserStackConfig);
			break;
		default:
			break;
		}
	}

	public void loadProperty(String Profile) {
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Individual return type method created
	public String getProperties(String key) {
		return properties.getProperty(key);
	}

}