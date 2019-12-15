
@tag
Feature: Mercury site

Background: 

 Given url is provided
    Then enter username
    And enter password
 #
    Then click on login

  @tag1
  Scenario: Login to mercury site
  #Then scroll down
  Then click on continue
  And get multiple elements size
        #And print the title of the page
    
    
    @tag2
  Scenario: Login to mercury site
  
    Then get the cookie information
    
    