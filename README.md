[![Board Status](https://dev.azure.com/amyrman/f35a6d19-203b-42f7-9147-0ba3bc7dd0f6/dc1fef45-6b8a-4f82-aac7-f338f1d0cbde/_apis/work/boardbadge/989c1e6b-ff89-41f3-8909-84c8706a336f?columnOptions=1)](https://dev.azure.com/amyrman/f35a6d19-203b-42f7-9147-0ba3bc7dd0f6/_boards/board/t/dc1fef45-6b8a-4f82-aac7-f338f1d0cbde/Microsoft.RequirementCategory/)
# PathForward
A Graduation project implementing everything from planning to programming and deployment

The plan is a web platform with the purpose to give meaning to those that need it most -- people who are unemployed, through matching their skills and interests with suitable social initiatives and companies.

## Setup (as of 23-01-31) a.k.a. "I guess actually deploying the app would have saved everyone some time, huh?"
### FIRST: For THE ULTIMATE FULLSTACK EXPERIENCE OF YOUR LIFE
#### Setup MySQL-database, preferably with Docker
**If you don't have it set up:**
* Download and install: https://www.docker.com/products/docker-desktop/
* In terminal: ```docker run --name mysql -e MYSQL_ROOT_PASSWORD=secretpw -e 'MYSQL_ROOT_HOST=%' -e MYSQL_DATABASE=pathforward -e MYSQL_USER=user -e MYSQL_PASSWORD=password -p 3306:3306 -d mysql:latest```

**If you already have it set up:**
* Create a database, e.g. through VS Code MySQL extension (https://marketplace.visualstudio.com/items?itemName=cweijan.vscode-mysql-client2
* Check that spring.datasource.* like port, username, password settings in <project-root-folder>\backend\src\main\resources\application.properties correspond with your MySQL settings.
  
### Then:
1. Clone the repo
2. Open terminal and from project root type in:
3. ```cd backend```
4. ```mvn spring-boot:run```
5. Open new terminal and type in:
6. ```cd ../frontend```
7. ```npm run start```
8. Bingo. React frontend should be opened automatically in browser.

**To demonstrate fullstack functionality:**
1. Login with username "test@test.nu", password "pass".
2. Nothing happens besides that you receive a token in dev-tools.
3. Open dev tools (ctrl + shift + i), and select console.
4. Click "object", then "data", and right-click "access_token".
5. "Copy string contents".
6. Search for "[AUTH TOKEN]" in project.
7. Replace "[AUTH TOKEN]" with the token you copied during step 5.
8. User info from MySQL should now be seen in the React app.
---
## Values
* Simplicity - focus on the important actions and call to actions when designing and implementing
* Speed - slick and responsive interface as well as organization
* Security - secure with encryption, hash etc
* Effective - evidence-based and systematically followed up

Put trust into peoples own capabilities
Empowering people
Subject-subject relationships
Face-to-face

Another planned function is to have a specific housing service implemented to also help and match people without adequate living conditions, with housing options that are registered in a database. The idea is to connect all kinds of housing-first kinda initiatives -- that is, providing housing first so that individuals *then* can take steps to get their life sorted. https://www.centreforpublicimpact.org/case-study/eradicating-homelessness-finland-housing-first-programme

## Tools
* Frontend: React + Axios
* Backend: Spring Boot
* Database: MySQL
* Planning: Azure DevOps
* Design: Figma and Lucidchart

A report is being written that documents the process of planning and building the web platform.

## Further Improvement Ideas
More creative ideas regarding platform functions:
* Messaging e.g. from case workers -> applying users about possible matches
* Integrated calendar view, e.g. for booked video meetings with meeting links
* The ability for users and admins to plan meet-ups (mainly focused on building peer-to-peer support)
* AI that can help with providing matches
* Blog platform for promotion, success stories, articles about evidence-based methods
* Gamification

