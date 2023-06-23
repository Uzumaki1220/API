package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class ComplexJSON {

	@Test
	public void coursesDemo(){
	
	JsonPath js=new JsonPath(Payloads.Course());
	
	//no.of.courses
	int noOfcourses=js.getInt("courses.size()");
	System.out.println(noOfcourses);
	//totalAount
	int totalAmount=js.getInt("dashboard.purchaseAmount");
	System.out.println(totalAmount);
	//1st course
	String firstCourse=js.getString("courses[0].title");
	System.out.println(firstCourse);
	//All courses
	for(int i=0;i<noOfcourses;i++)
	{
		String course=js.getString("courses["+i+"].title");
		String price=js.getString("courses["+i+"].price");
		System.out.println(course+"price is"+" "+price);
		
	}

	//copies sold by RPA
	int RPAcopies=js.getInt("courses[2].copies");
	System.out.println(RPAcopies);
	
	//Verify if Sum of all Course prices matches with Purchase Amount
	int sum=0;
	for(int i=0;i<noOfcourses;i++)
	{
		
	int 	eachprice=js.getInt("courses["+i+"].price");
	int eachcopies=js.getInt("courses["+i+"].copies");
	int eachtotal=eachprice*eachcopies;
	sum=sum+eachtotal;	
	
	}
	System.out.println(sum);
	Assert.assertEquals(sum, totalAmount);
	
	
	}
}
