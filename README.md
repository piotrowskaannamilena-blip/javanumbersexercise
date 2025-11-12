Java, Maven 

“Print numbers 1–50, but multiples of 3 say Fizz, multiples of 5 say Buzz, 3 & 5 say FizzBuzz.”

Code can be found below, firstly my function will check for the numbers that are both - multiplied by 3 & 5, and then are checking by divided by 5 and 3 and print out the result.  

../hello/src/main/java/com/example/NumbersPrint.java

mvn exec:java -Dexec.mainClass=com.example.NumbersPrint


<img width="457" height="812" alt="image" src="https://github.com/user-attachments/assets/d11aeb0e-4d90-4d16-9364-b1b1932f0e0d" />



Installation: 
Needs installation of Java and Maven

java -version 
mvn -v 

<img width="485" height="144" alt="image" src="https://github.com/user-attachments/assets/01504f85-e2c0-42af-b4d1-a07fc575ea53" />

Maven Project Structure
<img width="230" height="400" alt="image" src="https://github.com/user-attachments/assets/c6c40251-8dc5-4b20-9000-a8a28e3fa813" />

To build a .jar file:
mvn package

mvn clean compile
mvn compile
mvn exec:java -Dexec.mainClass="com.example.NumbersPrint"

On package.json 
"java.jdt.ls.java.home": "${env:JAVA_HOME}",
