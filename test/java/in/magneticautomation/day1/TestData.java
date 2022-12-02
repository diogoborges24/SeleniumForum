package in.magneticautomation.day1;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name= "calc-Data")
	Object [][] testData(){
		return new Object [][] {
			{"2 + 3", "5"}, //data set
			{"sqrt 16", "4"},//data set
			{"3 - 2", "1"}
		};	
	}
	
	@DataProvider(name= "titlles")
	Object [][] testData1(){
		return new Object [][] {
			{"Diogo", "Diogo"}, //data set
			{"Bola", "Bola"},//data set
			{"Solera", "Solera"}
		};	
	}

}
