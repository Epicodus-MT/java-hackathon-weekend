# _Startup Weekend Team Tracker_

#### _Brief Description: Program that allows a Startup Weekend or hack-a-thon coordinator to track teams and their members, July 7, 2017_

#### By _**Mara Timberlake**_

## Description
_Program has two classes: Team and Member. The homepage of the app lists all Teams, and allow users to click a Team to view its Members. User can add a Team, and when viewing a Team, be able to add one or more Members. Includes details about the Startup weekend event._

## Specifications

* _Program displays details of the hack-a-thon_
* _User can view all listed Team, and add a member to that team or create a new team._
* _Displays the updated information upon submission._
* _Example:_

|Behavior|Input|Output|
|---|---|---|
|Epicodus - Add New Member|Mara Timberlake|Epicodus Team Members: Mara Timberlake, Kristine Culala and Megan Jones|

## What's included
Within the repository you'll find the following directories and files:

```
java-hackathon-weekend/
├── src/
│    └── main/
│    │    └── java/
|    │    │     └── App.java
|    │    │     └── Member.java
|    │    │     └── Team.java
|    │    │     └── VelocityTemplateEngine.java
|    |    └── resources/
|    |          └──public/
|    |          |    └──app.css
|    |          └──templates/
|    |               └──delete.vtl
|    |               └──index.vtl
|    |               └──layout.vtl
|    |               └──member-form.vtl
|    |               └──member.vtl
|    |               └──members.vtl
|    |               └──team-delete.vtl
|    |               └──team-form.vtl
|    |               └──team-members-delete.vtl
|    |               └──team-members-form.vtl
|    |               └──team.vtl
|    |               └──teams.vtl
|    └── test/
│         └── java/
|               └── MemberTest.java
|               └── TeamTest.java
├── .gitignore
├── build.gradle
└── README.md
```

## Setup/Installation Requirements

* _Install gradle on your device_
* _LOCAL: Go to Terminal_
* _Clone this repository_
* _Terminal command - 'gradle run'_
* _Open browser and go to 'localhost:4567'_

## Known Bugs

_No known bugs at this time_

## Support and contact details

_For questions or feedback, please notify Mara Timberlake at maratimberlake@msn.com_

## Technologies Used

_Languages used include Java. IDE used - Atom_

### License

*This software runs under the MIT license*

Copyright (c) 2017 **_Mara Timberlake_**
