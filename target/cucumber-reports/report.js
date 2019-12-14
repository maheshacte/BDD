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
  "name": "scroll down",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.scroll_down()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});