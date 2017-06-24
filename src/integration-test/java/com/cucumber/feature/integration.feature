@calcIntegrationTest

Feature: calc Functionality Feature

In order to ensure calc Functionality works,
I want to run the cucumber test to verify it is working

Scenario Outline: calc Functionality

Given navigate to calchome page
When user logs in using numberA as "<NumberA>" and numberB as "<NumberB>" and Operator as "<Operator>"
Then Result as "<Result>" should be displayed

Examples:
|NumberA	|NumberB	|Operator	|Result	|
|90	|50	|add	|140	|
|20	|2	|sub	|18	|
|50	|3	|mul	|150	|
|100	|10	|div	|10	|