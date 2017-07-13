1 # Selenium Test With Assertion check

2 # Selenium Test in a single class with assertion check

3 # Required : (A)Eclipse (B) Maven project(C)TestNG (D)Initiate Web driver (E) Web Application URl (F) WebElement Collection

4 # Step:

5 # Open eclipse.

6 # Create maven project.

7 # Delete Auto generated Package from source folder.

8 # Add TestNG as external jar file.

9 # Delete Junit dependency from pom.xml.

10 # Add dependency for Selenium(suported version) and testng(current version) within pom.xml dependencies.

11 # Create one Package name as test and one class as name as feature name. 

12 # Need @Before class annotation and class setup method.

13 # Declare and initiate driver. 

14 # Maximize browser window.

15 # Driver need to URl address bar to open web application.

16 # Actual Test so need to @test annotation (run test by test ).

17 # Create one method for target job (here i want to get one tiltle)

18 # Inspect target webElemwnt and collect Html Element and store in a bucket.

19 # Send collected WebElement (title).

20 # Check assertion with Collected Web element(title) and Actual text( google).

21 #  Need @After class annotation and class tear down method.

22 # Web appliction Close by quit method.
