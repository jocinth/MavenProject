package org.sd;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pom.LoginPage;
import org.pom.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseClass {
	
	LoginPage login;
	//SearchPage search;
//
//@Given("User wants to open the Adactin application in chrome browser")
//public void user_wants_to_open_the_Adactin_application_in_chrome_browser() throws IOException {
//	
//	launchMethod("https://adactinhotelapp.com/");
//	maximizeMethod();
//	implicitlyWaitMethod(30);
//    
//}
//
//@Then("User wants to verify whether the login page appear or not")
//public void user_wants_to_verify_whether_the_login_page_appear_or_not() {
//    
//	login = new LoginPage();
//	login.loginPageVerification();
//}
//
//@When("User wants to give valid username and password, and click on the login button")
//public void user_wants_to_give_valid_username_and_password_and_click_on_the_login_button() throws IOException {
//    
//	login.loginPageData();
//}
//
//@Then("User wants to verify whether the search hotel page appear or not")
//public void user_wants_to_verify_whether_the_search_hotel_page_appear_or_not() {
//    
//	login.searchHotelPageVerification();
//}
//
//@When("User wansts to give valid data in the fields and click search")
//public void user_wansts_to_give_valid_data_in_the_fields_and_click_search() {
//    
//	search = new SearchPage();
//	search.searchPageData();
//}
//
//@Then("User wants to verify whether the select hotel page appears")
//public void user_wants_to_verify_whether_the_select_hotel_page_appears() throws IOException {
//    search.selectHotelPageVerification();
//}
//
//@Then("User wants to click on the radio button, and click continue")
//public void user_wants_to_click_on_the_radio_button_and_click_continue() {
//    
//}
//
//@Then("User wants to verify whether the book a hotel page appears")
//public void user_wants_to_verify_whether_the_book_a_hotel_page_appears() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}
//
//@When("User wants to give valid data in the fields and click on the book now button")
//public void user_wants_to_give_valid_data_in_the_fields_and_click_on_the_book_now_button() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}
//
//@Then("User wants to verify whether the booking confirmation page appears along with order number")
//public void user_wants_to_verify_whether_the_booking_confirmation_page_appears_along_with_order_number() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}

	@Given("User wants to verify whether the login page appears once the aactin application is launched")
	public void user_wants_to_verify_whether_the_login_page_appears_once_the_aactin_application_is_launched() {
	    login = new LoginPage();
	    login.loginPageVerification();
	}

//	@When("User wants to give valid username and password, and click on the login button")
//	public void user_wants_to_give_valid_username_and_password_and_click_on_the_login_button() {
//	    login.loginPageData();
//	}
	
//	@When("User wants to give valid {string} and {string}, and click on the login button")
//	public void user_wants_to_give_valid_and_and_click_on_the_login_button(String string, String string2) {
//	    login.loginPageData(string, string2);
//	}
	
//	@When("User wants to give valid username and password, and click on the login button")
//	public void user_wants_to_give_valid_username_and_password_and_click_on_the_login_button() {
//	    login.loginPageData();
//	}
	
//	@When("User wants to give valid username and password using DataTable without header one-D, and click on the login button")
//	public void user_wants_to_give_valid_username_and_password_using_DataTable_without_header_one_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) {
//	   List<String> list = dataTable.asList();
//	   String userName = list.get(0);
//	   String passWord = list.get(1);
//	   login.loginPageData(userName, passWord);
//	}
	
//	@When("User wants to give valid username and password using DataTable without header Two-D, and click on the login button")
//	public void user_wants_to_give_valid_username_and_password_using_DataTable_without_header_Two_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) {
//	    List<List<String>> lists = dataTable.asLists();
//	    String userName = lists.get(0).get(0);
//	    String passWord = lists.get(1).get(0);
//	    login.loginPageData(userName, passWord);
//	}
	
//	@When("User wants to give valid username and password using DataTable with header one-D, and click on the login button")
//	public void user_wants_to_give_valid_username_and_password_using_DataTable_with_header_one_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) {
//	    Map<String, String> asMap = dataTable.asMap(String.class, String.class);
//	    String userName = asMap.get("UserName");
//	    String passWord = asMap.get("PassWord");
//	    login.loginPageData(userName, passWord);
//	}
	
	@When("User wants to give valid username and password using DataTable with header Two-D, and click on the login button")
	public void user_wants_to_give_valid_username_and_password_using_DataTable_with_header_Two_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> asMaps = dataTable.asMaps();
	    String userName = asMaps.get(0).get("UserName");
	    String passWord = asMaps.get(0).get("PassWord");
	    login.loginPageData(userName, passWord);
	    
	}
	
	@When("User wants to give valid usernam and passwor using DataTable with header Two-D, and click on the login button")
	public void user_wants_to_give_valid_usernam_and_passwor_using_DataTable_with_header_Two_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps = dataTable.asMaps();
	    String userName = asMaps.get(0).get("UserName");
	    String passWord = asMaps.get(0).get("PassWord");
	    login.loginPageData(userName, passWord);
	}
	
	@Then("User wants to verify whether the search hotel page appear or not")
	public void user_wants_to_verify_whether_the_search_hotel_page_appear_or_not() {
	    login.searchHotelPageVerification();
	}
	
	

}
