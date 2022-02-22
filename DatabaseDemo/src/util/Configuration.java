package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;

public class Configuration {
	double version;
	String language;

//getter/setter	
public double getVersion() {
	return version;
}
public void setVersion(double version) {
	this.version = version;
}

public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}

//Konstruktor
public Configuration(double version, String language) {
	
	this.version = version;
	this.language = language;
}

//Methode zum Lesen der config.json
public void read (){	
	try {
		byte[] jsonbyte = Files.readAllBytes(Paths.get("config.json"));
		String jsonfile = new String(jsonbyte);
		Configuration c = new Gson().fromJson(jsonfile, Configuration.class);
		System.out.println(c);
		System.out.println(new Gson().toJson(c));

//		Files.write(Paths.get("config.json"), new Gson().toJson(c).getBytes());
//		System.out.println(Base64.getEncoder().encodeToString(new Gson().toJson(c).getBytes()));
		
	} catch (FileNotFoundException e2) {
		e2.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
}	

//Methode zum Schreiben der config.json
public void write (Configuration c){	
	try {
		Files.write(Paths.get("config.json"), new Gson().toJson(c).getBytes());
		c.write(this);		
		
		
		System.out.println(c);
	
		System.out.println(new Gson().toJson(c));
//		Files.write(Paths.get("config.json"), new Gson().toJson(c).getBytes());
//		System.out.println(Base64.getEncoder().encodeToString(new Gson().toJson(c).getBytes()));
		
	} catch (FileNotFoundException e2) {
		e2.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
}

// muss später weg:
public static void main(String[] args) {
	Configuration c = new Configuration(1.0, "EN");
//	c.read();
	c.write(c);
	}
}
