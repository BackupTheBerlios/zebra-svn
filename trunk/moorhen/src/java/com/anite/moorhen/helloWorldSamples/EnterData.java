/*
 * Created on 20-Feb-2005
 */
package com.anite.moorhen.helloWorldSamples;

import java.util.Date;

import org.apache.tapestry.IRequestCycle;
import org.apache.tapestry.html.BasePage;

/**
 * @author Ben Gidley
 */
public abstract class EnterData extends BasePage {
	public abstract Date getExpiryDate();
	
	/**
	 * Listener for first form submit
	 * @param cycle
	 */
	public void firstForm(IRequestCycle cycle){
		cycle.setAttribute("date", this.getExpiryDate());
		cycle.activate("EnterDataSuccess");
	}
}
