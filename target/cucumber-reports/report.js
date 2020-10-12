$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/StoryFile.feature");
formatter.feature({
  "name": "sample feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Google Search",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i launch google website",
  "keyword": "When "
});
formatter.match({
  "location": "TestingFramework.StepDef.MyStepdefs.launchGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i type \"Trijit\" inside search box",
  "keyword": "Then "
});
formatter.match({
  "location": "TestingFramework.StepDef.MyStepdefs.typeQueryString(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Flipkart launch",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i launch Flipkart.com",
  "keyword": "When "
});
formatter.match({
  "location": "TestingFramework.StepDef.MyStepdefs.iLaunchFlipkartCom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should see Flipkart logo",
  "keyword": "Then "
});
formatter.match({
  "location": "TestingFramework.StepDef.MyStepdefs.iShouldSeeFlipkartLogo()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});