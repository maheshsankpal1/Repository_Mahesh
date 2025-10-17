package Test;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Spliterator;
import java.util.Vector;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Common {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		WebElement drag = driver.findElement(By.id("test"));
		WebElement drop = driver.findElement(By.id("test"));


		
		

	}

}
