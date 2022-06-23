package com.evs.vtiger.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.evs.vtiger.webUtil.GenericMethod;

public class CustomListeners implements ITestListener {
	GenericMethod gm;

	public CustomListeners(GenericMethod gm) {
		this.gm = gm;

	}

	public void onTestStart(ITestResult result) {

		ITestListener.super.onTestStart(result);
		System.out.println("OnTestStart");
	}

	public void onTestSuccess(ITestResult result) {

		ITestListener.super.onTestSuccess(result);
		System.out.println("onTestSuccess");

	}

	public void onTestFailure(ITestResult result) {

		ITestListener.super.onTestFailure(result);
		System.out.println("OnTestFailure");
	}

	public void onTestSkipped(ITestResult result) {

		ITestListener.super.onTestSkipped(result);
		System.out.println("OnTestSkipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		System.out.println("OnTestFailedButWithinSuccessPercentage");
	}

	public void onTestFailedWithTimeout(ITestResult result) {

		ITestListener.super.onTestFailedWithTimeout(result);
		System.out.println("OnTestFailedWithTimeout");
	}

	public void onStart(ITestContext context) {

		ITestListener.super.onStart(context);
		System.out.println("OnStart");
	}

	public void onFinish(ITestContext context) {

		ITestListener.super.onFinish(context);
		System.out.println("OnFinish");
	}

}
