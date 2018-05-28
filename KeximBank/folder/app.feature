Feature: login
Scenario: Validate the userid field
Given     launch the site
When      Enter the login fields 
Then      Branches button should be displayed 
And       close site


Scenario: validate the Branch creation
Given     launch the site
When      Enter the login fields 
Then      click on branches button
And       close site

Scenario Outline: validate the branch creation with excel data
Given     launch the site
When      Enter the login fields 
Then      click on branches button
And       click on newbranch and create the branch "<row_index>" details
And       close site
Examples: 
         |row_index|
         |1|
         |2|
         |3|
         
         
         






 
 



