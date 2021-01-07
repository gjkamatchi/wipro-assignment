# wipro-assignment

1.Download code from https://github.com/gjkamatchi/wipro-assignment.git of wipro-app branch

2.Update maven of an above project

3.Start the spring boot tomcat server project

4.Use below API end point to test

  1. http://localhost:9000/api/palindromic/HelloWelcomeemoclewHelloolle
   
     Response : welcomeemoclew
  
  2.http://localhost:9000/api/phonedirectory/vij
  
     Response : ["Rajkumar","Vijay","Ajay"]
     
  3.http://localhost:9000/api/phonedirectory/zzzzzzzzzzzz
  
     Response : {"errorCode":"B-110","description":"zzzzzzzzzzzz | Record not found","contextPath":"/api/phonedirectory/zzzzzzzzzzzz","status":"FAILED"}
   
   

