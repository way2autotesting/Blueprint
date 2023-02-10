@Sprint_16 @USERSTORY_5781
Feature: Taxonomy Changes
  As a policy official creating a new site
  I need the relevant functional and activity labels available in the request form
  So I can quickly associate the site with the departmental function and create the site at pace
Background:
  Given that I am requesting a Teams site via the provisioning App
  Then I navigate Power Apps with "BEIS MS Teams Site Request Form" subtitle
  When I Begin button

@SmokeT
  Scenario: 1 Energy Infrastructure Development and Energy Infrastructure Resilience are separate terms
    Then I validate "Purpose" page text 1 contains "Why do you need this new site? Please provide a description to explain the purpose of this site to colleagues.99"
    Then I validate "Purpose" page text 2 contains "This information will populate the description of the site. Max 1000 characters."
    Then I validate "Purpose" page text 3 contains "What would you like to call your new site?"
    Then I validate "Purpose" page text 4 contains "Keep it short and specific. Acronyms are fine."
    When I add a description to the new site "Purpose" such as "Communication and networking space for the future leaders scheme 2021-2022"
    When I add desired title to the new site "Purpose" such as "Future leaders scheme 2021-2022"
    When I click "Next Section" in "Purpose"
    Then I validate "Activity" page text 1 contains "Is the site for core BEIS or another Public Body / Agency?"
    And I have selected "BEIS" as the Public body/Agency that will own the site
    And I have selected that the site relates to the BEIS responsibility "Energy supply and security"
    When I click on the activity drop down list for "Energy supply and security"
    Then the list is expanded
    And there is an entry for "Energy Infrastructure Development"
    And there is an entry for "Energy Infrastructure Resilience"
    And there is not an entry for "Energy Infrastructure Development and Resilience"

@DAT
  Scenario: 2 The list of Partner Organisations terms does not include the Group and Directorate administration terms
    When I add a description to the new site "Purpose" such as "Communication and networking space for the future leaders scheme 2021-2022"
    When I add desired title to the new site "Purpose" such as "Future leaders scheme 2021-2022"
    When I click "Next Section" in "Purpose"
    And I have selected "BEIS" as the Public body/Agency that will own the site
    And I have selected that the site relates to the BEIS responsibility "Partner organisations"
    When I click on the activity drop down list for "Partner organisations"
    Then the list is expanded
    And there is not an entry for "DGs Office"
    And there is not an entry for "Directors Office"
    And there is not an entry for "Learning and development"
    And there is not an entry for "People management"


  Scenario: 3 The list of Corporate terms include 'Commercial'
    When I add a description to the new site "Purpose" such as "Communication and networking space for the future leaders scheme 2021-2022"
    When I add desired title to the new site "Purpose" such as "Future leaders scheme 2021-2022"
    When I click "Next Section" in "Purpose"
    And I have selected "BEIS" as the Public body/Agency that will own the site
    And I have selected that the site relates to the BEIS responsibility "Corporate"
    When I click on the activity drop down list for "Corporate"
    Then the list is expanded
    And there is an entry for "Commercial"
    And there is not an entry for "Commercial/Government Commercial Organisation"


