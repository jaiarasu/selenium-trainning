@Feature1
Feature:To validate the account creationof fb app.
@Sanity
Scenario:To create new account.
Given To launch the browser and maximise the window.
When To launch url of fb app.
And To click the create new account button.
@Registeration 
# One dimensional map data
And To pass firstname in firstname text box.
#key     value
|firstname1|jai|
|firstname2|arasu|
|firstname3|mani|
And To pass secondname in secondname text box.
#Two dimensional map data
And To pass mobile number or email in email text box.
|password1|password2|password3|
|563523522|56527486749|68693898|
|bbnlskblse|2324225632|kbnglj54hth|
|hh.,lrhk|r3agty4533t|ear2452415141|
And  To create the new password using new password text box.
Then to closse the chrome browser.  

