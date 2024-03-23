Feature:Google search
Scenario Outline:perform a google search


Given I am on a google homepage
When I enter the search "<terms>"
And i click search button
Then I receive the result

Examples: 
|terms                 |
|Quality Assurance Jobs|
#|Software Testing Jobs |