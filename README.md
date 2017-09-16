# WeatherApi

Wellcome to REST WeatherApi Micro Service Project

This Project is for giving some information about weather of any city you want.

Given details:
1. Average of daily temperature
2. Average of nightly temperature
3. Average of pressure
4. Humidity


In this Project Spark Java Libraries (http://sparkjava.com/) and Open Weather Api Forcest Services (https://openweathermap.org/ Free) was used.

The Project is running with an embeded Jetty Http Server Engine. App uses default port 4567.

# getWeather

This service method is GET.

To get detail information about the weather, you can use the method on local like this below:
http://localhost:4567/weather/:cityname

For example: Istanbul
http://localhost:4567/weather/istanbul 

Response:
{"name":"istanbul","dailyTemp":24.95,"nightlyTemp":22.88,"pressure":1021.82,"humidity":87.0,"errorCode":0}

