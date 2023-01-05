@USERSTORY_5781
Feature:
  As a policy official creating a new site
  I need the relevant functional and activity labels available in the request form
  So I can quickly associate the site with the departmental function and create the site at pace


  Scenario 1: Energy Infrastructure Development and Energy Infrastructure Resilience are separate terms
    Given that I am requesting a Teams site via the provisioning App
    And I have selected 'BEIS' as the Public body/Agency that will own the site
    And I have selected that the site relates to the BEIS responsibility 'Energy supply and security'
    When I click on the activity drop down list for Energy supply and security
    Then the list is expanded
    And there is an entry for 'Energy Infrastructure Development'
    And there is an entry for 'Energy Infrastructure Resilience'
    And there is not an entry for 'Energy Infrastructure Development and Resilience'

  Scenario 2:  The list of Partner Organisations terms does not include the Group and Directorate administration terms
    Given that I am requesting a Teams site via the provisioning App
    And I have selected 'BEIS' as the Public body/Agency that will own the site
    And I have selected that the site relates to the BEIS responsibility 'Partner Organisations'
    When I click on the activity drop down list for Partner organisations
    Then the list is expanded
    And the following activities are NOT in the list
  DGs Office
  Directors Office
  Learning and development
  People management

  Scenario 3: The list of Corporate terms include 'Commercial'
    Given that I am requesting a Teams site via the provisioning App
    And I have selected 'BEIS' as the Public body/Agency that will own the site
    And I have selected that the site relates to the BEIS responsibility 'Corporate'
    When I click on the activity drop down list for Corporate
    Then the list is expanded
    And there is an entry for 'Commercial'
    And there is not an entry for 'Commercial/Government Commercial Organisation'