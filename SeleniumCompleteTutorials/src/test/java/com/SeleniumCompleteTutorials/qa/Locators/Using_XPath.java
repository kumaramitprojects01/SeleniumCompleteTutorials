package com.SeleniumCompleteTutorials.qa.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 Locating by XPath
XPath is the language used when locating XML (Extensible Markup Language) nodes. Since HTML can be thought of as an implementation of XML, we can also use XPath in locating HTML elements.

        Advantage: It can access almost any element, even those without class, name, or id attributes.

        Disadvantage: It is the most complicated method of identifying elements because of too many different rules and considerations.

Fortunately, Firebug can automatically generate XPath Selenium locators



XPath in Selenium is an XML path used for navigation through the HTML structure of the page. It is a syntax or language for finding any element on a web page using XML path expression. XPath can be used for both HTML and XML documents to find the location of any element on a webpage using HTML DOM structure.
 
 Syntax for XPath selenium:

XPath contains the path of the element situated at the web page. Standard XPath syntax for creating XPath is.

Xpath=//tagname[@attribute='value']
// : Select current node.
Tagname: Tagname of the particular node.
@: Select attribute.
Attribute: Attribute name of the node.
Value: Value of the attribute.


Types of X-path
There are two types of XPath:

1) Absolute XPath

2) Relative XPath

Absolute XPath:
It is the direct way to find the element, but the disadvantage of the absolute XPath is that if there are any changes made in the path of the element then that XPath gets failed.

The key characteristic of XPath is that it begins with the single forward slash(/) ,which means you can select the element from the root node.

Below is the example of an absolute xpath expression of the element shown in the below screen.

Absolute XPath:

/html/body/div[2]/div[1]/div/h4[1]/b/html[1]/body[1]/div[2]/div[1]/div[1]/h4[1]/b[1]
 
 
 
 Relative Xpath:
Relative Xpath starts from the middle of HTML DOM structure. It starts with double forward slash (//). It can search elements anywhere on the webpage, means no need to write a long xpath and you can start from the middle of HTML DOM structure. Relative Xpath is always preferred as it is not a complete path from the root element.

Below is the example of a relative XPath expression of the same element shown in the below screen. This is the common format used to find element by XPath.


Relative XPath: //div[@class='featured-box cloumnsize1']//h4[1]//b[1]

What are XPath axes.

XPath axes search different nodes in XML document from current context node. XPath Axes are the methods used to find dynamic elements, which otherwise not possible by normal XPath method having no ID , Classname, Name, etc.

Axes methods are used to find those elements, which dynamically change on refresh or any other operations. There are few axes methods commonly used in Selenium Webdriver like child, parent, ancestor, sibling, preceding, self, etc.




Using XPath Handling complex & Dynamic elements in Selenium
1) Basic XPath:
XPath expression select nodes or list of nodes on the basis of attributes like ID , Name, Classname, etc. from the XML document as illustrated below.

Xpath=//input[@name='uid']


Some more basic xpath expressions:

Xpath=//input[@type='text']				
Xpath=	//label[@id='message23']
Xpath=	//input[@value='RESET']
Xpath=//*[@class='barone']
Xpath=//a[@href='http://demo.guru99.com/']
Xpath= //img[@src='//cdn.guru99.com/images/home/java.png']



2) Contains():
Contains() is a method used in XPath expression. It is used when the value of any attribute changes dynamically, for example, login information.

The contain feature has an ability to find the element with partial text as shown in below XPath example.

In this example, we tried to identify the element by just using partial text value of the attribute. In the below XPath expression partial value 'sub' is used in place of submit button. It can be observed that the element is found successfully.

Complete value of 'Type' is 'submit' but using only partial value 'sub'.

Xpath=//*[contains(@type,'sub')]  
Complete value of 'name' is 'btnLogin' but using only partial value 'btn'.

Xpath=//*[contains(@name,'btn')]


Similarly, in the below expression, we have taken the 'id' as an attribute and 'message' as a partial value. This will find 2 elements ('User-ID must not be blank' & 'Password must not be blank') as its 'name' attribute begins with 'message'.

Xpath=//*[contains(@id,'message')]	



In the below expression, we have taken the "text" of the link as an attribute and 'here' as a partial value as shown in the below screenshot. This will find the link ('here') as it displays the text 'here'.

Xpath=//*[contains(text(),'here')]
Xpath=//*[contains(@href,'guru99.com')]	


3) Using OR & AND:
In OR expression, two conditions are used, whether 1st condition OR 2nd condition should be true. It is also applicable if any one condition is true or maybe both. Means any one condition should be true to find the element.

In the below XPath expression, it identifies the elements whose single or both conditions are true.

Xpath=//*[@type='submit' or @name='btnReset']



In AND expression, two conditions are used, both conditions should be true to find the element. It fails to find element if any one condition is false.

Xpath=//input[@type='submit' and @name='btnLogin']


4) Xpath Starts-with
XPath starts-with() is a function used for finding the web element whose attribute value gets changed on refresh or by other dynamic operations on the webpage. In this method, the starting text of the attribute is matched to find the element whose attribute value changes dynamically. You can also find elements whose attribute value is static (not changes).

For example -: Suppose the ID of particular element changes dynamically like:

Id=" message12"

Id=" message345"

Id=" message8769"

and so on.. but the initial text is same. In this case, we use Start-with expression.

In the below expression, there are two elements with an id starting "message"(i.e., 'User-ID must not be blank' & 'Password must not be blank'). In below example, XPath finds those element whose 'ID' starting with 'message'.

Xpath=//label[starts-with(@id,'message')]




5) XPath Text() Function
The XPath text() function is a built-in function of selenium webdriver which is used to locate elements based on text of a web element. It helps to find the exact text elements and it locates the elements within the set of text nodes. The elements to be located should be in string form.

In this expression, with text function, we find the element with exact text match as shown below. In our case, we find the element with text "UserID".

Xpath=//td[text()='UserID']




6) XPath axes methods:
These XPath axes methods are used to find the complex or dynamic elements. Below we will see some of these methods.

For illustrating these XPath axes method, we will use the Guru99 bank demo site.

a) Following:
Selects all elements in the document of the current node( ) [ UserID input box is the current node] as shown in the below screen.

Xpath=//*[@type='text']//following::input



There are 3 "input" nodes matching by using "following" axis- password, login and reset button. If you want to focus on any particular element then you can use the below XPath method:

Xpath=//*[@type='text']//following::input[1]
You can change the XPath according to the requirement by putting [1],[2]…………and so on.

With the input as '1', the below screen shot finds the particular node that is 'Password' input box element.


d) Preceding:
Select all nodes that come before the current node as shown in the below screen.

In the below expression, it identifies all the input elements before "LOGIN" button that is Userid and password input element.

Xpath=//*[@type='submit']//preceding::input



Summary:

XPath is required to find an element on the web page as to do an operation on that particular element.

There are two types of selenium XPath:
Absolute XPath
Relative XPath
XPath Axes are the methods used to find dynamic elements, which otherwise not possible to find by normal XPath method
XPath expression select nodes or list of nodes on the basis of attributes like ID , Name, Classname, etc. from the XML document .
 


 
 
 
 
 
 
 
 */






public class Using_XPath {
	
	public static WebDriver driver; 
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://demoqa.com/text-box");
		 
		 //Using contains() to locate full name and enter data
		 driver.findElement(By.xpath("//input[contains(@id, 'userN')]")).sendKeys("User Name");
		 
		 //using placeholder
		 driver.findElement(By.xpath("//input[contains(@placeholder, 'example')]")).sendKeys("Using Placeholder");
		 
		 //using start-with() 
		 driver.findElement(By.xpath("//input[starts-with(@placeholder,'Fu')]")).sendKeys("Using start with");
		 
		 //using text() to get label
		 String text = driver.findElement(By.xpath("//label[text()='Email']")).getText();
		 System.out.println(text);
		 
		 //using AND operator to locate full name
		 driver.findElement(By.xpath("//input[@placeholder ='Full Name' and @type = 'text']")).sendKeys("AND operator");
		 
		 //using OR operator to locate full name
		 driver.findElement(By.xpath("//input[@placeholder ='Full Name' or @type = 'text']")).sendKeys("OR operator");
		 
		 //using ancestor to locate form tag
		 boolean bol =driver.findElement(By.xpath("//label[text()='Full Name']/ancestor::form")).isDisplayed();
		 System.out.println("Form is displayed : "+bol);
		 
		 //using child to locate full name textbox from form
		 String label = driver.findElement(By.xpath("//form[@id='userForm']/child::div[1]//label")).getText();
		 System.out.println("The label text is : "+ label);
		 
		 
		 //using decendent axis to locate yes radio
		 driver.get("https://www.demoqa.com/radio-button");
		 driver.findElement(By.xpath("//div[@class= 'custom-control custom-radio custom-control-inline']/descendant::input/following-sibling::label")).click();
		 
		 //using parent axis to locate yes radio
		 boolean bo = driver.findElement(By.xpath("//input[@id='yesRadio']/parent::div")).isSelected();
		 System.out.println("The Yes radio is selected : "+bo);
		 
		 //using following axis to locate current address
		 driver.get("https://demoqa.com/text-box");
		 driver.findElement(By.xpath("//input[@id=\"userName\"]/following::textarea")).sendKeys("Text Area locate following");
		 
		 //using following-sibling to locate email 
		 driver.findElement(By.xpath("(//div[@class='col-md-3 col-sm-12']/following-sibling::div/input)[2]")).sendKeys("abc@xyz.com");
		 
		 //using preceding-axis to locate full name
		 String preceding = driver.findElement(By.xpath("//input[@id='userName']/preceding::label")).getText();
		 System.out.println("The value of preceding : "+preceding);
		
		
	}
	
}
