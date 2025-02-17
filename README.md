# Study Planner App

## Description

The Study Planner App is a simple JavaFX-based application designed to help students organize their study schedule efficiently. The app analyzes learning habits, syllabus progress, and exam dates to generate a dynamic study plan. It also adapts based on the user's performance in mock tests. The app fetches mock study plans from a service and displays them in an interactive graphical interface, with the assistance of AI algorithms that personalize the study plan based on user data.

## Features

* Displays a list of study plans with subjects and time allocation.
* Simple, clean UI created using JavaFX.
* Fetches study plans data in JSON format and displays them.
* Ability to fetch and view study plans with dynamic interaction.
* AI-driven personalized study plan suggestions based on user inputs and past performance.

## Technologies Used

* **Java:** The core programming language used for the backend logic.
* **JavaFX:** A GUI framework used to build the graphical user interface.
* **JSON:** Used for managing and structuring study plans data.
* **AI:** Utilized for personalizing study plans and adapting based on user performance.
* **Maven:** Build automation tool used to manage dependencies.

## Setup and Installation

### Prerequisites

To run this project, you need the following installed on your local machine:

* **Java Development Kit (JDK) 11 or higher:** You can download it from [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
* **JavaFX SDK:** You can download it from [Gluon](https://gluonhq.com/products/javafx/).
* **IDE:** Any Java IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code.

### Steps to Set Up

1. **Clone the repository:**

   ```bash
   git clone [https://github.com/your-username/AI-Personalized-Study-Planner.git](https://github.com/your-username/AI-Personalized-Study-Planner.git)
   ```

2. **Install JavaFX SDK:**
   * Download JavaFX from the link provided above.
   * Set up your IDE to include JavaFX in the project configuration. Follow your IDE’s documentation for adding JavaFX libraries to your project.

3. **Set Up Project Dependencies:**
   If you're using Maven for dependency management, ensure the following is added to your `pom.xml`:

   ```xml
   <dependencies>
       <dependency>
           <groupId>org.openjfx</groupId>
           <artifactId>javafx-controls</artifactId>
           <version>17</version>
       </dependency>
   </dependencies>
   ```

4. **Compile and Run the Application:**
   After setting up the project, open it in your IDE and run the `StudyPlannerApp.java` file. The app should start and show a simple interface where you can fetch and display study plans.

## Usage

Once the app is running, you can interact with the following:

* **Button to fetch study plans:** Clicking the button will trigger the app to fetch mock study plans and display them. *(Where are they displayed?  Console? UI? Be specific.)*
* **Study plan details:** The study plans are displayed with subjects and study time. *(How are they displayed? Console? UI? Be specific.)*
* **AI-based personalized study plan generation and interaction:** *(Explain how the user interacts with the AI.  Are there specific input fields?  How are the AI-generated suggestions presented?)*

## Future Improvements

* Integration with a real backend or database to fetch personalized study plans.
* User authentication to store study plans for different users.
* A more sophisticated AI algorithm to generate study plans based on performance.
* Improved UI with more features such as charts and progress tracking.
