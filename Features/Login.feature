Feature: Gmail Login 

Scenario: Login with Valid Credentials on gmail 

	Given User is able to launch chrome browser 
	When User is able to open  URL with "https://www.gmail.com" 
	And User enters username as "abs@gmail.com" 
	And Click On Next button 
	And user entrs password As "******" 
	And Click On another Next button 
	And Click on Compose Button 
	And Add receipent As "pqr@gmail.com" 
	And write subject As "Incubyte" 
	And write body As "Automation QA test for Incubyte" 
	Then Mail Should be sent 
	
	
 