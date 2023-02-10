$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("IssueTaxonomyChanges.feature");
formatter.feature({
  "line": 2,
  "name": "Taxonomy Changes",
  "description": "As a policy official creating a new site\r\nI need the relevant functional and activity labels available in the request form\r\nSo I can quickly associate the site with the departmental function and create the site at pace",
  "id": "taxonomy-changes",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sprint_16"
    },
    {
      "line": 1,
      "name": "@USERSTORY_5781"
    }
  ]
});
formatter.before({
  "duration": 18049822800,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "1 Energy Infrastructure Development and Energy Infrastructure Resilience are separate terms",
  "description": "",
  "id": "taxonomy-changes;1-energy-infrastructure-development-and-energy-infrastructure-resilience-are-separate-terms",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SmokeT"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "that I am requesting a Teams site via the provisioning App",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I navigate Power Apps with \"BEIS MS Teams Site Request Form\" subtitle",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I Begin button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I validate \"Purpose\" page text 1 contains \"Why do you need this new site? Please provide a description to explain the purpose of this site to colleagues.99\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I validate \"Purpose\" page text 2 contains \"This information will populate the description of the site. Max 1000 characters.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I validate \"Purpose\" page text 3 contains \"What would you like to call your new site?\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I validate \"Purpose\" page text 4 contains \"Keep it short and specific. Acronyms are fine.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I add a description to the new site \"Purpose\" such as \"Communication and networking space for the future leaders scheme 2021-2022\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I add desired title to the new site \"Purpose\" such as \"Future leaders scheme 2021-2022\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I click \"Next Section\" in \"Purpose\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I validate \"Activity\" page text 1 contains \"Is the site for core BEIS or another Public Body / Agency?\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I have selected \"BEIS\" as the Public body/Agency that will own the site",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I have selected that the site relates to the BEIS responsibility \"Energy supply and security\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on the activity drop down list for \"Energy supply and security\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the list is expanded",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "there is an entry for \"Energy Infrastructure Development\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "there is an entry for \"Energy Infrastructure Resilience\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "there is not an entry for \"Energy Infrastructure Development and Resilience\"",
  "keyword": "And "
});
formatter.match({
  "location": "IssueTaxonomyChangesStepdef.IssueTaxonomyChangesStepdef()"
});
formatter.result({
  "duration": 63234977700,
  "error_message": "org.openqa.selenium.TimeoutException: timeout\n  (Session info: chrome\u003d109.0.5414.74)\n  (Driver info: chromedriver\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e),platform\u003dWindows NT 10.0.18363 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027Way2AutoTesting\u0027, ip: \u0027192.168.1.94\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578737 (49da6702b16031..., userDataDir: C:\\Users\\Kunle\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:63796}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 109.0.5414.74, webStorageEnabled: true}\nSession ID: 5433a84dfa28d23e38aa77a568d3e64b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat com.powerApp.framework.controls.internals.ControlBase.click(ControlBase.java:26)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat com.powerApp.framework.controls.api.ControlHandler.invoke(ControlHandler.java:43)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat com.powerApp.framework.base.DriverContext.WaitForElementToBeClickable(DriverContext.java:235)\r\n\tat com.powerApp.test.pages.MicrosoftStaySignedPage.ClickYesButton3(MicrosoftStaySignedPage.java:26)\r\n\tat com.powerApp.test.stepdefs.IssueTaxonomyChangesStepdef.IssueTaxonomyChangesStepdef(IssueTaxonomyChangesStepdef.java:30)\r\n\tat ✽.Given that I am requesting a Teams site via the provisioning App(IssueTaxonomyChanges.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "BEIS MS Teams Site Request Form",
      "offset": 28
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iNavigatePowerAppsWithSubtitle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "IssueTaxonomyChangesStepdef.iBeginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Purpose",
      "offset": 12
    },
    {
      "val": "1",
      "offset": 31
    },
    {
      "val": "Why do you need this new site? Please provide a description to explain the purpose of this site to colleagues.99",
      "offset": 43
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iValidatePageTextContains(String,int,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Purpose",
      "offset": 12
    },
    {
      "val": "2",
      "offset": 31
    },
    {
      "val": "This information will populate the description of the site. Max 1000 characters.",
      "offset": 43
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iValidatePageTextContains(String,int,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Purpose",
      "offset": 12
    },
    {
      "val": "3",
      "offset": 31
    },
    {
      "val": "What would you like to call your new site?",
      "offset": 43
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iValidatePageTextContains(String,int,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Purpose",
      "offset": 12
    },
    {
      "val": "4",
      "offset": 31
    },
    {
      "val": "Keep it short and specific. Acronyms are fine.",
      "offset": 43
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iValidatePageTextContains(String,int,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Purpose",
      "offset": 37
    },
    {
      "val": "Communication and networking space for the future leaders scheme 2021-2022",
      "offset": 55
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iAddADescriptionToTheNewSiteSuchAs(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Purpose",
      "offset": 37
    },
    {
      "val": "Future leaders scheme 2021-2022",
      "offset": 55
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iAddDesiredTitleToTheNewSiteSuchAs(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Next Section",
      "offset": 9
    },
    {
      "val": "Purpose",
      "offset": 27
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iClickIn(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Activity",
      "offset": 12
    },
    {
      "val": "1",
      "offset": 32
    },
    {
      "val": "Is the site for core BEIS or another Public Body / Agency?",
      "offset": 44
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iValidatePageTextContains(String,int,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "BEIS",
      "offset": 17
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iHaveSelectedBEISAsThePublicBodyAgencyThatWillOwnTheSite(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Energy supply and security",
      "offset": 66
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iHaveSelectedThatTheSiteRelatesToTheBEISResponsibility(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Energy supply and security",
      "offset": 44
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.iClickOnTheActivityDropDownListFor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "IssueTaxonomyChangesStepdef.theListIsExpanded()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Energy Infrastructure Development",
      "offset": 23
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.thereIsAnEntryFor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Energy Infrastructure Resilience",
      "offset": 23
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.thereIsAnEntryFor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Energy Infrastructure Development and Resilience",
      "offset": 27
    }
  ],
  "location": "IssueTaxonomyChangesStepdef.thereIsNotAnEntryForEnergyInfrastructureDevelopmentAndResilience(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 6950021700,
  "status": "passed"
});
});