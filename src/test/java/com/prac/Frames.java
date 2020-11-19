package com.prac;

import java.awt.Dimension;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	static ChromeDriver driver;

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Hassan\\Desktop\\Photon Workspace\\NewMaven\\Drivers\\chromedriver.exe"
//				);
//
//		 driver = new ChromeDriver();
//
//		driver.get("http://demo.automationtesting.in/Alerts.html");
//
//		Dimension d = new Dimension(60,220);
//           d.setSize(d);
//           
//           
		
		Set si =new TreeSet();
		si.add(100);
		si.add(10);
		si.add(103);
		si.add(123);
		
		System.out.println(si);
	}
}