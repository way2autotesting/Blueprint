Feature: Smoke Test

 # Scenario: Check page navigation
 #   Given I am an MFA User
 #   When I login with correct username and password
 #   And I activate MFA "Text"
 #   And I click "Create a New MS Teams Site"
 #   Then I navigate to Power App UI "BEIS MS Teams Site Request Form"

    @e2e
  Scenario: 1 Smoke test via Energy supply and security
    Given that I am requesting a Teams site via the provisioning App
    Then I navigate Power Apps with "BEIS MS Teams Site Request Form" subtitle
    When I Begin button
    Then I validate "Purpose" page text 1 contains "Why do you need this new site? Please provide a description to explain the purpose of this site to colleagues."
    Then I validate "Purpose" page text 2 contains "This information will populate the description of the site. Max 1000 characters."
    Then I validate "Purpose" page text 3 contains "What would you like to call your new site?"
    Then I validate "Purpose" page text 4 contains "Keep it short and specific. Acronyms are fine."
    Then I validate "Purpose" page button contains "Previous Section" and "Next Section"
    When I add a description to the new site "Purpose" such as "Communication and networking space for the future leaders scheme 2021-2022"
    When I add desired title to the new site "Purpose" such as "Future leaders scheme 2021-2022"
    When I click "Next Section" in "Purpose"
    Then I validate "Activity" page text 1 contains "Is the site for core BEIS or another Public Body / Agency?"
    Then I validate "Activity" page radio button contains "BEIS" and "Public Body / Agency"
    Then I validate "Activity" page button contains "Previous Section" and "Next Section"
    And I have selected "BEIS" as the Public body/Agency that will own the site
    Then I validate "Activity" page text 2 contains "Which of BEIS' responsibilities does this site relate to?"
    Then I validate "Activity" page text 3 contains "This will help to ensure your workspace is managed carefully during departmental restructuring"
      And I have selected that the site relates to the BEIS responsibility "Energy supply and security"
    Then I validate "Activity" page text 4 contains "Which activity does this Energy supply and security site belong to?"
    Then I validate "Activity" page button contains "Previous Section" and "Next Section"
    #When I click on the activity drop down list for "Energy supply and security"
      When I click on the activity drop down list
    Then the list is expanded
    And there is an entry for "Energy Infrastructure Development"
    And there is an entry for "Energy Infrastructure Resilience"
    And there is not an entry for "Energy Infrastructure Development and Resilience"
    And I have selected that "Energy Infrastructure Development" activity drop down list from "Energy supply and security"
    When I click "Next Section" in "Activity"
    Then I validate "Ownership" page text 1 contains "Is this site co-owned with another government organisation?"
    Then I validate "Ownership" page text 2 contains "This could be a government department (e.g. Cabinet Office) or a partner organisation (e.g. MET Office). Select 'Yes' for joint teams, i.e. where you share the responsibility and accountability for the information created in your new site with another body?"
    Then I validate "Ownership" page text 3 contains "Who will be the owners of this site, responsible for its administration?"
    Then I validate "Ownership" page text 4 contains "Staff appointed as site owners will manage the site membership, configuration and settings."
    Then I validate "Ownership" page button contains "Previous Section" and "Next Section"
    Then I validate "Ownership" page radio button contains "Yes" and "No"
    When I click "No" on the activity radio button to confirm if the site co owned with another government organisation
    When I click the button "Select Site Owners"
    Then I navigate to add users as the owners of the site "Please select users in response to the below question:"
    Then I validate "Ownership of the site" page 1 contains "Selected users (1)"
    When I search for users by name "BEIS Admin"
    Then I validate "Ownership of the site" page 2 contains "Selected users (2)"
    When I click to "Confirm Selection"
    Then I validate "Ownership" page owners site contains "BEIS Admin"
    When I click "Next Section" in "Ownership"
    Then I validate "Retention" page text 1 contains "Will the content stored within this site be of National Significance?"
    Then I validate "Retention" page text 2 contains "Will the content in this site have Extended Value?"
    Then I validate "Retention" page text 3 contains "Will the content stored within this site be of Organisational Significance?"
    Then I validate "Retention" page button contains "Previous Section" and "Next Section"
    When I select radio button "No" to National Significance
    When I select radio button "No" to Extended Value
    When I select radio button "No" to Organisational Significance
    When I click "Next Section" in "Retention"
    Then I validate "Security" page text 1 contains "Will you be using this site to collaborate with people outside your organisation?"
    Then I validate "Security" page text 2 contains "How sensitive might the information contained within this site be? What is the maximum security classification of the content that might be stored in this site?"
    Then I validate "Security" page radio button contains "Yes" and "No"
    Then I validate "Security" page button contains "Previous Section" and "Next Section"
    When I select radio button "No" to collaborate with people outside your organisation
    When I select "Official Sensitive" as the securty classification from the dropdown
    When I click "Next Section" in "Security"
    Then I validate "Summary" page text 1 contains "You're nearly there!"
    Then I validate "Summary" page text 2 contains "Thank you for completing the site creation form. Please review your results here before selecting 'Submit Form'."
    Then I validate "Summary" page button contains "Previous Section" and "Submit Form"
    When I click "Submit Form" in "Summary"
    Then I validate "Success" page text 1 contains "Form successfully submitted!"
    Then I validate "Success" page button are enabled and contains "Request another site" and "Exit Form"
    When I switch window back to Workspace Request Portal
    When I click "Workspace Directory" in the Site sub header host
    Then I validate "Workspace Request Portal" page the "Workspace Name" contains "Future leaders scheme 2021-2022"
    Then I validate "Workspace Request Portal" page the "Provisioning Status" contains "Submitted"
    Then I validate "Workspace Request Portal" page the "Team Owners" contains "BEIS Admin"
    Then I validate "Workspace Request Portal" page the "Created By" contains "Ahmed Awesu"


  Scenario: 2 Smoke test via Corporate
    Given that I am requesting a Teams site via the provisioning App
    Then I navigate Power Apps with "BEIS MS Teams Site Request Form" subtitle
    When I Begin button
    Then I validate "Purpose" page text 1 contains "Why do you need this new site? Please provide a description to explain the purpose of this site to colleagues."
    Then I validate "Purpose" page text 2 contains "This information will populate the description of the site. Max 1000 characters."
    Then I validate "Purpose" page text 3 contains "What would you like to call your new site?"
    Then I validate "Purpose" page text 4 contains "Keep it short and specific. Acronyms are fine."
    Then I validate "Purpose" page button contains "Previous Section" and "Next Section"
    When I add a description to the new site "Purpose" such as "Communication and networking space for the future leaders scheme 2021-2022"
    When I add desired title to the new site "Purpose" such as "Future leaders scheme 2021-2022"
    When I click "Next Section" in "Purpose"
    Then I validate "Activity" page text 1 contains "Is the site for core BEIS or another Public Body / Agency?"
    Then I validate "Activity" page radio button contains "BEIS" and "Public Body / Agency"
    Then I validate "Activity" page button contains "Previous Section" and "Next Section"
    And I have selected "BEIS" as the Public body/Agency that will own the site
    Then I validate "Activity" page text 2 contains "Which of BEIS' responsibilities does this site relate to?"
    Then I validate "Activity" page text 3 contains "This will help to ensure your workspace is managed carefully during departmental restructuring"
    And I have selected that the site relates to the BEIS responsibility "Corporate"
    Then I validate "Activity" page text 4 contains "Which activity does this Corporate site belong to?"
    Then I validate "Activity" page button contains "Previous Section" and "Next Section"
    When I click on the activity drop down list
    Then the list is expanded
    #And I have selected that "Energy Infrastructure Development" activity drop down list from "Energy supply and security"
    And I have selected "Digital" from the activities site
    When I click "Next Section" in "Activity"
    Then I validate "Ownership" page text 1 contains "Is this site co-owned with another government organisation?"
    Then I validate "Ownership" page text 2 contains "This could be a government department (e.g. Cabinet Office) or a partner organisation (e.g. MET Office). Select 'Yes' for joint teams, i.e. where you share the responsibility and accountability for the information created in your new site with another body?"
    Then I validate "Ownership" page text 3 contains "Who will be the owners of this site, responsible for its administration?"
    Then I validate "Ownership" page text 4 contains "Staff appointed as site owners will manage the site membership, configuration and settings."
    Then I validate "Ownership" page button contains "Previous Section" and "Next Section"
    Then I validate "Ownership" page radio button contains "Yes" and "No"
    When I click "No" on the activity radio button to confirm if the site co owned with another government organisation
    When I click the button "Select Site Owners"
    Then I navigate to add users as the owners of the site "Please select users in response to the below question:"
    Then I validate "Ownership of the site" page 1 contains "Selected users (1)"
    When I search for users by name "BEIS Admin"
    Then I validate "Ownership of the site" page 2 contains "Selected users (2)"
    When I click to "Confirm Selection"
    Then I validate "Ownership" page owners site contains "BEIS Admin"
    When I click "Next Section" in "Ownership"
    Then I validate "Retention" page text 1 contains "Will the content stored within this site be of National Significance?"
    Then I validate "Retention" page text 2 contains "Will the content in this site have Extended Value?"
    Then I validate "Retention" page text 3 contains "Will the content stored within this site be of Organisational Significance?"
    Then I validate "Retention" page button contains "Previous Section" and "Next Section"
    When I select radio button "Almost certainly" to National Significance
    And I select "BEIS's principle policy delivery goals" checkbox category for the national significant work
    #And I select "Operation of BEIS's statutory duties" checkbox category for the national significant work
    And I select "Constitutional matters; devolution" checkbox category for the national significant work
    When I select radio button "No" to Extended Value
    When I select radio button "No" to Organisational Significance
    When I click "Next Section" in "Retention"
    Then I validate "Security" page text 1 contains "Will you be using this site to collaborate with people outside your organisation?"
    Then I validate "Security" page text 2 contains "How sensitive might the information contained within this site be? What is the maximum security classification of the content that might be stored in this site?"
    Then I validate "Security" page radio button contains "Yes" and "No"
    Then I validate "Security" page button contains "Previous Section" and "Next Section"
    When I select radio button "No" to collaborate with people outside your organisation
    When I select "Official Sensitive" as the securty classification from the dropdown
    When I click "Next Section" in "Security"
    Then I validate "Summary" page text 1 contains "You're nearly there!"
    Then I validate "Summary" page text 2 contains "Thank you for completing the site creation form. Please review your results here before selecting 'Submit Form'."
    Then I validate "Summary" page button contains "Previous Section" and "Submit Form"
    When I click "Submit Form" in "Summary"
    Then I validate "Success" page text 1 contains "Form successfully submitted!"
    Then I validate "Success" page button are enabled and contains "Request another site" and "Exit Form"
    When I switch window back to Workspace Request Portal
    When I click "Workspace Directory" in the Site sub header host
    Then I validate "Workspace Request Portal" page the "Workspace Name" contains "Future leaders scheme 2021-2022"
    Then I validate "Workspace Request Portal" page the "Provisioning Status" contains "Submitted"
    Then I validate "Workspace Request Portal" page the "Team Owners" contains "BEIS Admin"
    Then I validate "Workspace Request Portal" page the "Created By" contains "Ahmed Awesu"