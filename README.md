## SauceDemo AQA Project
### Project Description
This project contains automated UI tests for the login functionality of the website
https://www.saucedemo.com/

The goal of the project is to demonstrate basic skills in automated testing using Java, Selenium WebDriver, and the Page Object Model (POM) pattern.
The following login scenarios are covered:
- Successful login with valid credentials
- Login with invalid password
- Login with a locked out user
- Login with empty username and password
- Login with performance_glitch_user 

### Technologies
- Java 11 
- Selenium WebDriver 
- JUnit 5 
- Maven 
- Allure Reports 
- Page Object Model (POM)

### Requirements
- Java 11 or higher 
- Maven 3.8+ 
- Google Chrome browser 
- ChromeDriver compatible with installed Chrome version 
- Allure Commandline installed

## How to Run Tests
### Run tests from terminal
mvn clean test

## Generate Allure Report
### Generate and open report
allure serve allure-results

## Branching Strategy
The project uses two branches:
- master — stable version
- dev — development branch

All changes are developed in the dev branch and merged into master via Pull Request.

## Notes
- Each test is independent and can be run separately.
- Tests use explicit Page Object Model without overcomplication.
- The project is intended as a Junior AQA demonstration task.