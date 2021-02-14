package com.SeleniumCompleteTutorials.qa.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 Getting Started with CSS Selectors
A CSS Selector is a combination of an element selector and a value which identifies the web element within a web page.  They are string representations of HTML tags, attributes, Id and Class.  As such they are patterns that match against elements in a tree and are one of several technologies that can be used to select nodes in an XML document. 

Today we'll cover simple CSS selectors, then more advanced, then pseudo-classes, which are essentially powerful, built-in matching functions that reduce a search to just what you are looking for.
 
 
 
 
I: Simple
Id
An element’s id in XPATH is defined using: “[@id='example']” and in CSS using: “#” - ID's must be unique within the DOM.

Examples:

XPath: //div[@id='example']
CSS: #example


Element Type
The previous example showed //div in the xpath. That is the element type, which could be input for a text box or button, img for an image, or "a" for a link. 

Xpath: //input or
Css: =input
Direct Child
HTML pages are structured like XML, with children nested inside of parents. If you can locate, for example, the first link within a div, you can construct a string to reach it. A direct child in XPATH is defined by the use of a “/“, while on CSS, it’s defined using “>”.  

Examples:

XPath: //div/a
CSS: div > a
Child or Sub-Child
Writing nested divs can get tiring - and result in code that is brittle. Sometimes you expect the code to change, or want to skip layers. If an element could be inside another or one of its children, it’s defined in XPATH using “//” and in CSS just by a whitespace.

Examples:

XPath: //div//a
CSS: div a
Class
For classes, things are pretty similar in XPATH: “[@class='example']” while in CSS it’s just “.”

Examples:

XPath: //div[@class='example']
CSS: .example
II: Advanced
Next Sibling
This is useful for navigating lists of elements, such as forms or ul items. The next sibling will tell selenium to find the next adjacent element on the page that’s inside the same parent. Let’s show an example using a form to select the field after username.

<form class = "form-signin" role = "form" action = "/index.php" method = "post">
<h4 class = "form-signin-heading"></h4> 
<input type = "text" class = "form-control" id = "username" name = "username" placeholder = "username" required autofocus></br> 
<input type = "password" class = "form-control" id = "password" name = "password" placeholder = "password" required> 
<p> 
<button class = "btn btn-lg btn-primary btn-block radius" type = "submit" name = "login">Login</button> 
</form> 
Let’s write an XPath and css selector that will choose the input field after “username”. This will select the “alias” input, or will select a different element if the form is reordered.

XPATH: //input[@id='username']/following-sibling:input[1]
CSS: #username + input
Attribute Values
If you don’t care about the ordering of child elements, you can use an attribute selector in selenium to choose elements based on any attribute value. A good example would be choosing the ‘username’ element of the form above without adding a class.

We can easily select the username element without adding a class or an id to the element.

XPATH: //input[@name='username']
CSS: input[name='username']
We can even chain filters to be more specific with our selectors.

XPATH: //input[@name='login'and @type='submit']
CSS: input[name='login'][type='submit']
Here Selenium will act on the input field with name="login" and type="submit"

Choosing a Specific Match
CSS selectors in Selenium allow us to navigate lists with more finesse than the above methods. If we have a ul and we want to select its fourth li element without regard to any other elements, we should use nth-child or nth-of-type. Nth-child is a pseudo-class. In straight CSS, that allows you to override behavior of certain elements; we can also use it to select those elements.

<ul id = "recordlist">
<li>Cat</li>
<li>Dog</li>
<li>Car</li>
<li>Goat</li>
</ul>
If we want to select the fourth li element (Goat) in this list, we can use the nth-of-type, which will find the fourth li in the list. Notice the two colons, a recent change to how CSS identifies pseudo-classes.

CSS: #recordlist li::nth-of-type(4)
On the other hand, if we want to get the fourth element only if it is a li element, we can use a filtered nth-child which will select (Car) in this case.

CSS: #recordlist li::nth-child(4)
Note, if you don’t specify a child type for nth-child it will allow you to select the fourth child without regard to type. This may be useful in testing css layout in selenium.

CSS: #recordlist *::nth-child(4)
In XPATH this would be similar to using [4].

Sub-String Matches
CSS in Selenium has an interesting feature of allowing partial string matches using ^=, $=, or *=. I’ll define them, then show an example of each:

^= Match a prefix
CSS: a[id^='id_prefix_']
A link with an “id” that starts with the text “id_prefix_”

$= Match a suffix
CSS: a[id$='_id_sufix']
A link with an “id” that ends with the text “_id_sufix”

*= Match a substring
CSS: a[id*='id_pattern']
A link with an “id” that contains the text “id_pattern”
 
 
#3 – Attribute
In this example, the script will access the “Sign in” button located beneath the login form at Gmail.com.

The “Sign in” button carries a type attribute with the value “submit”. This type attribute and its value can be utilized to create a CSS Selector that will access the preferred web element.

Here’s how to create a CSS Selector for the web element

Locate the web element – “Sign in” button. The HTML tag, in this case, is “input”, the attribute is type and value of the attribute is “submit”. Combined, they refer to the “Sign in” button.

Verify locator value

Type “css=input[type=’submit’]” (locator value) in Selenium IDE. Click on the Find Button. The “Sign in” button will be highlighted, verifying the locator value.

Syntax

css=<HTML tag><[attribute=Value of attribute]>



#4 – Sub-string
In Selenium, CSS allows the matching of a partial string which, offers a way to create CSS selectors utilizing sub-strings. This can be done in three ways.

Types of mechanisms use to match sub-strings

Matching a prefix
Matching a suffix
Matching a substring
Match a prefix

The purpose of this is to correspond to the string by using a matching prefix.

Syntax

css=<HTML tag><[attribute^=prefix of the string]>
^ : the symbol used to match a string using a prefix
Prefix: the string on the basis of which the match operation is performed.
If one intends to identify the “Password textbox”, the CSS Selector, in this case, would be:

css=input#Passwd[name^='Pass']
Match a suffix

The purpose of this is to correspond to the string by using a matching suffix.

Syntax

css=<HTML tag><[attribute$=suffix of the string]>
#: the symbol used to match a string using a suffix.
Suffix: the string on the basis of which the match operation is performed.
Again, if one intends to identify the “Password textbox”, the CSS Selector, in this case would be:

css=input#Passwd[name$='wd']
Match a substring

The purpose of this is to correspond to the string by using a matching substring.

Syntax

css=<HTML tag><[attribute*=sub string]>
*: the symbol to match a string using sub-string
Sub string: the string on the basis of which the match operation is performed.
Again, if one intends to identify the “Password textbox”, the corresponding CSS Selector would be:

css=input#Passwd[name$='wd']



#5 – Inner text
Using inner text helps identify and create CSS Selectors by utilizing a string pattern that the HTML Tag manifests on the web page. This mechanism is used most frequently to locate web elements on account of its simplified syntax.

In this example, focus on the “Forgot email?” hyperlink present beneath the login form at Gmail.com.

css=<HTML tag><:><contains><(text)>


 */

public class Using_Css_Selectors {
	public static WebDriver driver; 
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("https://en.wikipedia.org/wiki/Wikipedia");
	//	 History
		 
		 
		//1. css=<HTML tag><#><Value of ID attribute> 
		//driver.findElement(By.cssSelector("#firstName")).sendKeys("Amit");
		
		Thread.sleep(3000);
		
		//2. css=<HTML tag><.><Value of Class attribute>
		//driver.findElement(By.cssSelector("input.VfPpkd-muHVFf-bMcfAe")).click();
		
		//3.Using attribute
		Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("input[type=\'password\']")).sendKeys("amkhsj");
	//	English Wikipedia
		
		//4. Using Match a prefix: Match a prefix: css=<HTML tag><[attribute^=prefix of the string]>
        //driver.findElement(By.cssSelector("a[title^=\'English Wiki\']")).click();
		
		
		
		//5. Match a Suffix;css=<HTML tag><[attribute$=suffix of the string]>
 
	    //	driver.findElement(By.cssSelector("a[title$=\'sh Wikipedia\']")).click();
		
		
		//6: Match a substring: css=<HTML tag><[attribute*=sub string]>
	//	driver.findElement(By.cssSelector("a[title*=\'ish Wikip\']")).click();
		
		//#5 – Inner text: css=<HTML tag><:><contains><(text)>
		
		/*
		As an alternative for contains() pseudo-class, you can use the innerText attribute (does not work with Firefox) or textContent attribute (for Firefox) in the following ways:
		WebElement cell = driver.findElement(By.cssSelector("td[innerText='Item 1']"));
		WebElement cell = driver.findElement(By.cssSelector("td[textContent='Item 1']"))
		 *
		 *
		 */
		
		//driver.findElement(By.cssSelector("span[innerText='History']")).click();;
		
	}
	
}
