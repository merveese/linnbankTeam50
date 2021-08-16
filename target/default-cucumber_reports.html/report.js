$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/gmibank.feature");
formatter.feature({
  "name": "sample",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@"
    }
  ]
});
formatter.scenario({
  "name": "sample",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@"
    }
  ]
});
formatter.step({
  "name": "user on home page\"url\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});