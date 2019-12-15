$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:mercury/mercurysite.feature");
formatter.feature({
  "name": "Mercury site",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "url is provided",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.url_is_provided()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login to mercury site",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "click on continue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.click_on_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get multiple elements size",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.get_multiple_elements_size()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});