# **WeatherTop**

This is a simple app to supplement weatherTop weather stations in Waterford Ireland. Users can add and delete weather readings for different stations and add and delete stations. The latest weather conditions are also displayed for each station.

## **Structure**

The controllers folder contains the java classes used in controlling the app.

*About.java:*
renders the about.html file and displays information about the app and contact details for the company

*Accounts.java:*
Contains methods for user signup (renders signup.html line 16), login (renders login.html line 22), registration (line 28-34), authentication for registered users (checks the user email and password match the member id line 37-line 50), 
logout (clears the session line 53-57) and a method to get the logged in user (determines if a user is logged in line 60-70).

*Dashboard.java:*
Contains a method for displaying the active stations for a user (renders dashboard.html line 23-29). 
Also contains methods to delete a station (line 32-41) and add a station (line 44-line 53).

*Start.java:*
Contains a method to display the start page (renders start.html line 14-17)

*StationCtrl.java:*
Contains methods for controlling the readings in each station. Index method display the most recent readings for the station by pulling information from the StationAnalytics class (line 19- line 42) and rendering station.html (line 41). the deleteReading method deletes a selected reading from the station by removing the information from the StationAnalytics class and re-rendering station.html (line 45- line 71). The deleteStation method allow the station and it's associated readings to be removed (lines 74-83). The addReading method allows the user to add a new reading for the station and requires the correct input from the user (lines 86- line 93).


The models folder contains the classes for modelling the Member, Reading and Station objects.
*Member.java:*
takes in strings for the first name, last name, email and password from the user (line 19- line 34). Also contains a method to find a user by their email (line 37)
and to check the users password is correct (line 42).

*Reading.java:*
takes in elements for the reading object (weather code, temperature, wind speed, wind direction and pressure, line 14- line 30)

*Station.java:*
takes in elements for the station object (name, latitude, longitude, arraylist of readings for the station (line 25-26) and the calculated elements for the 
latest reading from the StationAnalystics class (line 31- line 51)


The utils folder contains the classs for calculating the most recent weather conditions for the station
*StationAnaltics.java:*
Contains method to return the most recent reading for weather code (getCode: line 19-28), temperaure (getTemp: line 84-93), wind speed (getWindSpeed: line 136-145), 
wind direction (getWindDir: line 260-269) and pressure (getPressure: line 328-337). It also contains methods to determine the weather conditions 
(getWeather: line 30-54), the weather icon (getIcon line 56-82), the temperature in fahrenheit (getTempF: line 96-105), calculating the lowest and highest 
temperature (getMinTemp: line 108-119, getMaxTemp: line 122-133), the lowest and highest wind speed (getMinWind: line 148-159, getMaxWind: 162-173), the beaufort 
number (getBaufort: line 176-222), the beaufort label (getBeau: line 225-257), the wind compass (getWindComp: line 272-312), the wind chill (getWindChill: line 315-325),
and finally the highest and lowest pressure readings (getMaxPressure: line 354- 365, getMinPressure: line 340-351)


### **Design**

The views folder in the weatherTop project contains html files that control the display elements of the app. UI elements are employed in the app.
*main.html:*
Sets the main layout for the app (line 11) and is referenced in all other html documents

*login.html:*
A grid structue is diplayed to allow the user to login using email and password (line 5-line 21). UI elements for header (line 8), login button (line 15) and 
images (line 19) are employed.

*signup.html:*
A ui 2 column grid structure is employed for a segment in this page (line 5-line 33). A UI form is employed to allow user to enter their details to register on the app
(line 7-28). UI button (line 27) used to allow user to submit information. UI image element used to display the weathertop logo (line 31)

*start.html:*
displays the welcome menu once a user has logged in. UI segment employed to display general weather information (line 6-line 30)

*welcomemenu.html:*
Partial to display the menu bar on starting the app to direct the user to register or login

*menu.html:*
Partial to display the menu bar with dashboard, about and logout buttons to direct a user once logged in

*dashboard.html:*
Contains sections (line 7-15) for displaying the weather stations. UI buttons are employed for opening station folders (line 11-13) and deleting stations (line 14).

*addStation.html:*
Partial to add a new station to the dashboard, creates a form with boxes for the user to add all of the information required to create a new station (line 1-16)

*station.html:*
Contains a table displaying the latest readings for the station (line 10-line 43). Icons are used to display the lates weather conditions at the station (line 14). 
Under the table all of the readings are displayed in a seperate segment (line 45-51)

*listReadings.html:*
a partial to display a table of all of the readings for the station (line 1-40)

*addReading.html:*
Partial to add a reading within a station, creates a form with boxes for the user to add all of the information required for the reading (line 1-25)

*about.html:*
Contains sections explaining the app (line 6- line 11) and contact details for weathertop Inc. (line 12-line 26)



#### **Elements used**

As mentioned above object classes for Member, reading and station were used. Bespoke methods were employed in almost all classes e.g. deleteStation method in the 
Dashboard class for deleting the station (line 32-41) and the addReading method in the StationCtrl class (line 86-93). 
UI elements were employed for the display and interaction from the user e.g. the use of forms to enter readings in a station (addReading.html line 1-25), the use of 
buttons to open and delte stations on the dashboard (dashboard.html line 11 and line 12) and the use of fomantic icons to display the current weather conditions 
(station.html line 14). In the StationAnalytics class if and else statements were used (line 34-50 & line 182-218). for loops were also used (line 33-51 & line 61-75).
A hashmap was used to determine the weather icon based on the weather code (line 63-74).


#### **Deployment**

I have not deployed my App

##### **Sources**

[HTML] https://developer.mozilla.org/en-US/docs/Web/HTML

[CSS] https://www.w3schools.com/css/

[icons] https://fomantic-ui.com/elements/icon.html

[UI elements] https://semantic-ui.com/collections/table.html

[weather information for Waterford] https://www.climatestotravel.com/climate/ireland/waterford

[map] https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d9771.925642800465!2d-7.1500992!3d52.2437213!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xd97d82caf811c31e!2sWaterford%20Ind%20Est!5e0!3m2!1sen!2sie!4v1652716355462!5m2!1sen!2sie" 

[power element] https://www.geeksforgeeks.org/math-pow-method-in-java-with-example/


