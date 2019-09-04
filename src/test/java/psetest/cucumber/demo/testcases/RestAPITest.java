package psetest.cucumber.demo.testcases;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.aventstack.extentreports.GherkinKeyword;
import com.jayway.jsonpath.JsonPath;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import psetest.cucumber.demo.test.base.TestBase;

public class RestAPITest {
	/** Log4j Logger. */
	private static final Logger LOG = LogManager.getLogger(RestAPITest.class);

	/** TestBase reference **/
	private TestBase testBase;

	/**
	 * Adding the picco container cucumber dependency injection so that i can access
	 * the test base object and reference variables.
	 * 
	 * @param <strong>TestBase</strong>
	 */
	public RestAPITest(TestBase testBase) {
		this.testBase = testBase;
	}

	Response getResponse = null;

	@Given("Headers are given")
	public void creatingTheHeaders() throws ClassNotFoundException {
		LOG.info("Creating the headers");
		this.testBase.extentScenario.createNode(new GherkinKeyword("Given"), "Given the headers");

	}

	@When("I send the GET request to URI with product ID")
	public void sendGetRequest(DataTable dataTable) throws ClassNotFoundException {

		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		this.testBase.extentScenario.createNode(new GherkinKeyword("When"),
				"I send the GET request to " + dataMap.get("URI") + " with product ID " + dataMap.get("productID"));

		getResponse = RestAssured.given().relaxedHTTPSValidation().body("")
				.get(dataMap.get("URI") + dataMap.get("productID")).then().extract().response();
	}

	@Then("I verify the status code")
	public void verifyStatusCode(DataTable dataTable) throws ClassNotFoundException {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);

		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"),
				"I verify the status code " + dataMap.get("statusCode"));
		Assert.assertEquals(dataMap.get("statusCode"), String.valueOf(getResponse.getStatusCode()));

	}

	@Then("I verify the status Line")
	public void verifyStatusLine(DataTable dataTable) throws ClassNotFoundException {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"),
				"I verify the status Line " + dataMap.get("statusLine"));
		Assert.assertEquals(dataMap.get("statusLine"), getResponse.getStatusLine());

	}

	@Then("I verfiy product name product number product price")
	public void verifyResponse(DataTable dataTable) throws ClassNotFoundException {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		this.testBase.extentScenario.createNode(new GherkinKeyword("Then"), "I verify " + dataMap.get("productName")
				+ " " + dataMap.get("productNumber") + " " + dataMap.get("productPrice"));
		Assert.assertEquals(dataMap.get("productName"),
				JsonPath.parse(getResponse.asString()).read("$.getProductResponse.productName").toString());
		LOG.info("Verfiying the Product Number :"
				+ JsonPath.parse(getResponse.asString()).read("$.getProductResponse.productId").toString());
		Assert.assertEquals(dataMap.get("productNumber"),
				JsonPath.parse(getResponse.asString()).read("$.getProductResponse.productId").toString());
		Assert.assertEquals(dataMap.get("productPrice"),
				JsonPath.parse(getResponse.asString()).read("$.getProductResponse.productPrice").toString());

	}

}
