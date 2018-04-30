$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Application.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "Testing Goibibo high level functionality",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "To test the feature of total amount and payment button in the payment page",
  "description": "",
  "id": ";to-test-the-feature-of-total-amount-and-payment-button-in-the-payment-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am in Goibibo website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter flight from \"Bangalore\" to \"Mumbai\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Departure day for the next day",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Return day for after 2 days",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on Get Set Go button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select earliest departure for both days",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Book button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to see the Total Amount",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see the Payment button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Application should get closed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsClass.i_am_in_Goibibo_website()"
});
formatter.result({
  "duration": 12585591350,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bangalore",
      "offset": 21
    },
    {
      "val": "Mumbai",
      "offset": 36
    }
  ],
  "location": "StepsClass.i_enter_flight_from_to(String,String)"
});
formatter.result({
  "duration": 18519007580,
  "status": "passed"
});
formatter.match({
  "location": "StepsClass.i_click_on_Departure_day_for_the_next_day()"
});
formatter.result({
  "duration": 200624119,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 32
    }
  ],
  "location": "StepsClass.i_click_on_Return_day_for_after_days(int)"
});
formatter.result({
  "duration": 455764910,
  "status": "passed"
});
formatter.match({
  "location": "StepsClass.i_click_on_Get_Set_Go_button()"
});
formatter.result({
  "duration": 6386898220,
  "status": "passed"
});
formatter.match({
  "location": "StepsClass.i_select_earliest_departure_for_both_days()"
});
formatter.result({
  "duration": 31126630610,
  "error_message": "org.openqa.selenium.remote.UnreachableBrowserException: Error communicating with the remote browser. It may have died.\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027Priyanka\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.16.0-38-generic\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:589)\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:504)\n\tat Testgoibibo.pageObjects.FlightSearch.selectEarliestDeparture(FlightSearch.java:68)\n\tat stepsDefinition.StepsClass.i_select_earliest_departure_for_both_days(StepsClass.java:67)\n\tat ✽.And I select earliest departure for both days(Application.feature:12)\nCaused by: org.apache.http.conn.HttpHostConnectException: Connect to 127.0.0.1:7055 [/127.0.0.1] failed: Connection refused (Connection refused)\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:151)\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:380)\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:71)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:55)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:143)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:89)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:134)\n\tat org.openqa.selenium.firefox.internal.NewProfileExtensionConnection.execute(NewProfileExtensionConnection.java:170)\n\tat org.openqa.selenium.firefox.FirefoxDriver$LazyCommandExecutor.execute(FirefoxDriver.java:393)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:568)\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:504)\n\tat Testgoibibo.pageObjects.FlightSearch.selectEarliestDeparture(FlightSearch.java:68)\n\tat stepsDefinition.StepsClass.i_select_earliest_departure_for_both_days(StepsClass.java:67)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\nCaused by: java.net.ConnectException: Connection refused (Connection refused)\n\tat java.net.PlainSocketImpl.socketConnect(Native Method)\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)\n\tat java.net.Socket.connect(Socket.java:589)\n\tat org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:134)\n\t... 56 more\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsClass.i_click_on_Book_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsClass.i_should_be_able_to_see_the_Total_Amount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsClass.i_should_be_able_to_see_the_Payment_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsClass.application_should_get_closed()"
});
formatter.result({
  "status": "skipped"
});
});