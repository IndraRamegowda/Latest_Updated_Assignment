$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("documentation.feature");
formatter.feature({
  "line": 1,
  "name": "Validate all internal links on the web page",
  "description": "",
  "id": "validate-all-internal-links-on-the-web-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "",
  "description": "For given URL validate all internal links on the page if accessible",
  "id": "validate-all-internal-links-on-the-web-page;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User should be able to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User should be able to navigate to the required URL \"\u003cUrl\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Get all the Links on the web page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "validate-all-internal-links-on-the-web-page;;",
  "rows": [
    {
      "cells": [
        "Url"
      ],
      "line": 11,
      "id": "validate-all-internal-links-on-the-web-page;;;1"
    },
    {
      "cells": [
        "https://developer.here.com/documentation"
      ],
      "line": 12,
      "id": "validate-all-internal-links-on-the-web-page;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "For given URL validate all internal links on the page if accessible",
  "id": "validate-all-internal-links-on-the-web-page;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User should be able to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User should be able to navigate to the required URL \"https://developer.here.com/documentation\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Get all the Links on the web page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DocumentationFeatureTest.user_should_be_able_to_launch_the_browser()"
});
formatter.result({
  "duration": 4861514350,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://developer.here.com/documentation",
      "offset": 53
    }
  ],
  "location": "DocumentationFeatureTest.user_should_be_able_to_navigate_to_the_required_URL(String)"
});
formatter.result({
  "duration": 3474801150,
  "status": "passed"
});
formatter.match({
  "location": "DocumentationFeatureTest.get_all_the_Links_on_the_web_page()"
});
formatter.result({
  "duration": 302066794255,
  "status": "passed"
});
formatter.match({
  "location": "DocumentationFeatureTest.close_the_browser()"
});
formatter.result({
  "duration": 310505448,
  "status": "passed"
});
});