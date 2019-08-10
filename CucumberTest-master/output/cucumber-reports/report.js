$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "This feature is used to verify login funcationality",
  "description": "",
  "id": "this-feature-is-used-to-verify-login-funcationality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 28807722514,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "login with valid username and password",
  "description": "",
  "id": "this-feature-is-used-to-verify-login-funcationality;login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters Username",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters Password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_open_application()"
});
formatter.result({
  "duration": 1794095992,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_username()"
});
formatter.result({
  "duration": 336047,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_password()"
});
formatter.result({
  "duration": 274502,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_onSignIn()"
});
formatter.result({
  "duration": 263551,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_is_displayed_login_screen()"
});
formatter.result({
  "duration": 137439,
  "status": "passed"
});
formatter.after({
  "duration": 1168759095,
  "status": "passed"
});
});