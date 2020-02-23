package com.logger.saroj.com.Task5;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class SimpleInterest {
	static Logger logger = Logger.getLogger(CalculateInterest.class);
	float principleAmount,rate,time,simpleInterest;
	void readValues() throws IOException{
		Scanner sc = new Scanner(System.in);
		logger.info("Enter Principle Amount : ");
		principleAmount = sc.nextFloat();
		logger.info("Enter Rate : ");
		rate = sc.nextFloat();
		logger.info("Enter Time Period : ");
		time = sc.nextFloat();
	}
	void calculateSimpleInterest(){
		simpleInterest = (principleAmount * rate * time)/100;
	}
	void displayAmount() throws IOException{
		logger.info("Total Interest : "+simpleInterest);
	}

}
