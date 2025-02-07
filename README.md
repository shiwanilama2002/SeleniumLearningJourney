# Selenium Learning Journey 🚀

## 📅 Day 1: Browser Automation
- Open Google in Chrome & Edge using Selenium.
- Print page titles.

## 📅 Day 2: Locators (Finding Elements)
- Used ID, Name, Class, XPath.
- Searched for "Selenium (software)" on Wikipedia.
- Printed the search result heading.

  ## 📅 Day 3: On this day, I added Selenium test cases for the Google homepage validation. The test cases include:

Verify Browser Launch: Ensures the Chrome browser opens successfully.
Search Google: Verifies that the Google homepage loads properly.
Validate Page Title: Confirms that the title of the Google homepage is "Google".

## Day 4: On this day,Login Test Automation - Selenium with TestNG
In this project, I have implemented automated tests for login functionality on the PracticeTestAutomation website using Selenium WebDriver and TestNG. The script performs the following actions:

Features Tested:
Navigation to the Practice Page:

The first test, Navigation(), ensures that the user is able to successfully navigate to the "Practice" page by clicking the corresponding link.
The navigation is validated by checking the current URL and comparing it to the expected value.
Valid Login Credentials:

In the loginValidCredentials() test, the script performs a login using valid credentials (username: student, password: Password123).
The test then verifies whether the user is successfully logged in by checking the current URL.
Invalid Login Credentials:

The loginInValidCredentials() test simulates a failed login using invalid credentials (username: students, password: Password1234).
After submitting the login form, it checks whether the login failed by verifying the current URL.
