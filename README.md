# Wikipedia Automation

![Java](https://img.shields.io/badge/Java-21-orange) ![Selenium](https://img.shields.io/badge/Selenium-4.x-green) ![Cucumber](https://img.shields.io/badge/Cucumber-BDD-blue) ![TestNG](https://img.shields.io/badge/TestNG-7.x-red) ![Maven](https://img.shields.io/badge/Build-Maven-yellow)

A basic test automation project for Wikipedia using Selenium, Cucumber, and TestNG. This repository contains practice scripts for automating interactions with the Wikipedia website.

## Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **BDD Framework:** Cucumber
* **Test Runner:** TestNG
* **Build Tool:** Maven

# How to Setup & Run This Project in Eclipse

This guide provides step-by-step instructions on how to clone this repository, import it correctly into the Eclipse IDE, and run the automation tests.

## Prerequisites

* **Eclipse IDE:** [Download Eclipse for Java Developers](https://www.eclipse.org/downloads/packages/)
* **Java (JDK):** Ensure JDK is installed and configured in your system path.
* **Git:** [Download Git](https://www.google.com/search?q=https://git-scm.com/downloads)
* **TestNG Suite:** Ensure TestNG is configured on Eclipse. Refer to Troubleshooting for TestNG installation instructions.

## 1. Clone the Repository
Open your terminal or command prompt and run:

```bash
git clone https://github.com/ElementZ76/Wikipedia-Automation.git

```

## 2. Import into Eclipse

1. Open Eclipse.
2. Go to **File** > **Import...**
3. Expand the **Maven** folder and select **Existing Maven Projects**.
4. Click **Next**.
5. Click **Browse** and select the **root folder** of the project you just cloned (the folder containing the `pom.xml` file).
6. Ensure the `pom.xml` checkbox is ticked.
7. Click **Finish**.

*Note: Wait for the progress bar at the bottom right (Building Workspace) to finish. Eclipse is downloading dependencies.*

## 3. How to Run the Tests
### Run via TestNG

1. In the **Project Explorer**, locate the `TestRunner.java` file (`src/test/java/runners`).
2. Right-click `TestRunner.java`.
3. Select **Run As** > **TestNG Test**. (refer to Troubleshooting if you cannot find the TestNG option)

## Troubleshooting

### Red Exclamation Mark on Project
* Right-click the project > **Maven** > **Update Project...**
* Check **Force Update of Snapshots/Releases**.
* Click **OK**.

### Cannot see "TestNG Test" under "Run As" in TestRunner file:
*  Download "TestNG for Eclipse" from Eclipse Marketplace. (Help > Eclipse Marketplace > Search for "TestNG" and download)
*  After downloading, force update the project.
*  Right click on Wikipedia-Automation > Maven > Update Project > Select "Force update of Snapshots/Releases" > Click OK.

* `src/test/java`: Contains the Step Definitions and Test Runner files.
* `src/test/resources`: Contains the Cucumber Feature files (`.feature`).
* `pom.xml`: Manages project dependencies and build configuration.
