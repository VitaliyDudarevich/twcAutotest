$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/scenarios/SignInAndRegistrationPageTest.feature");
formatter.feature({
  "name": "Sign in and registration page5",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Sign in with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Try to sign in with valid \u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Successfully logged in",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "DV@test.test",
        "Test922922"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Sign in with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with valid DV@test.test and Test922922",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithValidEmailAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.successfullyLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Try to sign in with invalid \u003cemail\u003e or invalid \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "email@",
        "password"
      ]
    },
    {
      "cells": [
        "email@test",
        "password"
      ]
    },
    {
      "cells": [
        "",
        "password"
      ]
    },
    {
      "cells": [
        "DV@test.test",
        ""
      ]
    },
    {
      "cells": [
        "",
        ""
      ]
    },
    {
      "cells": [
        "email@test.",
        "password"
      ]
    },
    {
      "cells": [
        "email@@test.test",
        "password"
      ]
    },
    {
      "cells": [
        "email email@test.test",
        "password"
      ]
    },
    {
      "cells": [
        "DV@test.test",
        "incorrectpassword"
      ]
    },
    {
      "cells": [
        "DV@test.test",
        "\"\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with invalid email or invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithAnInvalidEmailOrInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.theValidationMessageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with invalid email@ or invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithAnInvalidEmailOrInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.theValidationMessageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with invalid email@test or invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithAnInvalidEmailOrInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.theValidationMessageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with invalid  or invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithAnInvalidEmailOrInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.theValidationMessageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with invalid DV@test.test or invalid ",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithAnInvalidEmailOrInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.theValidationMessageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with invalid  or invalid ",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithAnInvalidEmailOrInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.theValidationMessageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with invalid email@test. or invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithAnInvalidEmailOrInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.theValidationMessageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with invalid email@@test.test or invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithAnInvalidEmailOrInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.theValidationMessageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with invalid email email@test.test or invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithAnInvalidEmailOrInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.theValidationMessageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with invalid DV@test.test or invalid incorrectpassword",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithAnInvalidEmailOrInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.theValidationMessageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I\u0027m on the \"sign in and registration page\"",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenPage.iMOnThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to sign in with invalid DV@test.test or invalid \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.tryToSignInWithAnInvalidEmailOrInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The validation message \"We don\u0027t recognise your details. Please check your email and password and try again\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInWithValidCredentialsTest.theValidationMessageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});