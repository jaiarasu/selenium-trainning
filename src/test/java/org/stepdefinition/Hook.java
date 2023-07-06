package org.stepdefinition;

import org.sam.Baseclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Baseclass {
@Before(order = 2)
private void precondition2() {
	// TODO Auto-generated method stub
launchBrowser();
System.out.println("launch the browser");
}
@Before(order = 1)
private void precondition1() {
	// TODO Auto-generated method stub
WindowMaximize();
System.out.println("max the window");
}
@Before (order = 3,value = "@Sanity")
private void precondition3() {
	// TODO Auto-generated method stub
System.out.println("precondition 3");
}

@After(order = 10 , value = "@Sanity")
private void postcondition2() {
	// TODO Auto-generated method stub
System.out.println("take ascreen shot");
}
@After(order = 4)
private void postcondition1() {
	// TODO Auto-generated method stub
closeEntireBrowser();
System.out.println("close the window");
}
}