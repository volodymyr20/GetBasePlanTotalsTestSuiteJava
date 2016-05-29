**Background**: getbase.com provides different plan types and time periods combinations to choose from, depending on that the total sum will be calculated.

**This is a test suite** to check that the total sum is calculated correctly for different plan type & time period combinations - the main file is **BasePlanTotalTests.java**.

**Pre-requisites - software:**
* Windows 7
* Firefox 46
* JRE 1.7, assuming it's added to PATH variable
* Eclipse Juno Release
* Selenium Java 2.53 (http://selenium-release.storage.googleapis.com/2.53/selenium-java-2.53.0.zip):
  - selenium-java-2.53.0.jar, selenium-java-2.53.0-srcs.jar, also jars from libs added to Project Properties -> Java Build Path -> Libraries -> Add External JARs
* Git client (either CMD, or UI) + the project repository is cloned locally, and imported into Eclipse

**Pre-requisites - web-site:**
* a user registered at getbase.com with the trial period expired (included)

**Ways to run it:** 
* Manually from IDE:
  - Run -> Run (Ctrl+F11)

**Disclaimer:** This is rather an educational sample than a real life example, not a complete suite neither. Its purpose it to illustrate how Selenium+Java 
can be used for test automation of web sites, provide a base and examples how to create further test cases, and also demonstrate use of Page Object design pattern 
which makes maintenance a lot easier. 