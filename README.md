# Business Applications by jBPM - Riot League Stats Demo

This is a demo business application built with https://start.jbpm.org and expanded
to add riot games leage of legends game stats demo. 

## Getting Started

Clone this repository locally with 

```
git clone https://github.com/business-applications/sample-riot-league-stats.git
```

### Prerequisites

In order to run this demo you first must register and account with Riot Games
and get an API Key (this is free).

The URL to go to is https://developer.riotgames.com/ and follow instructions to
create an account (or log in if you already have one) and how to get/create an API key.

Once you have the API key, go to the sample-riot-league-stats-kjar module 
and edit the src/main/resources/META-INF/kie-deployment-descriptor.xml and replace all occurences of

```
YOUR_API_KEY
```

with your API key you received from Riot Games.

### Running your application

Go to the sample-riot-league-stats-service directory and run:

for Windows users:

```
launch.bat clean install
```

or for Unix/Linux users

```
chmod 755 launch.bat (only has to be done once)
./launch.sh clean install
```

## Accessing your application

Once the app has started you cann access the landing page at 

```
localhost:8090/riotdemo
```

### Sample summoner Name

One example Summoner name you can use is 

```
Hide on bush
```

with platform "KR" (default)

Notice that since this is just a demo app it does not nicely
handle summoner names which do not exist, but you can 
expand on this add add that to your app if you want :)


Have fun!
