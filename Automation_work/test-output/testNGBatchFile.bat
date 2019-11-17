set projectLocation=C:\Users\Lenovo\eclipse-workspace\Automation_work
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause