# Restaurant App

This is a Java MVC application built using Spring Boot. It serves as a web application for displaying a menu of dishes.

## Folder Structure

### Model

- **models folder:**
  - `Dish.java`: Defines the data structure and business logic of the application.

### View

- **templates folder:**
  - `home.html` and `menu.html`: Screens displayed to the user.
  - **fragments folder:**
    - `header.html` and `footer.html`: Part of the view.

### Controller

- **controllers folder:**
  - `DishController.java`: Handles user requests and returns the appropriate model or view.

### Service (Manages Business Logic)

- **services folder:**
  - `DishService.java`: Implements the business logic related to data retrieval and manipulation.

### Repository (Manages Data Access)

- **repositories folder:**
  - `DishRepository.java`: Handles data retrieval and storage.

## Application Features

- **DishController**: Contains two GET API methods to return views `home.html` and `menu.html`.
  - The app starts with `home.html`, displaying the restaurant's name and a welcome message.
  - Users can click the "Go to Menu" button to navigate to the list of dishes.

- **Dish Model**:
  - Manages information about dishes, including ID, name, category, and price.
  - Utilizes Lombok to automatically generate constructors, getters, and setters.

- **Data Management**:
  - `DishRepository` manages dish data and returns a list of dishes via the `getDishes()` method.
  - `DishService` fetches data from the repository and passes it to the controller.

- **Thymeleaf Integration**:
  - In `DishController`, the `@Value` annotation retrieves the restaurant name from `application.properties` and passes it as a model to `home.html`.
  - In `menu.html`, Thymeleaf is used to dynamically display the list of dishes.

## Usage

To run the application, start the Spring Boot server. Access `home.html` as the initial page, then navigate to `menu.html` to view the list of dishes.

![homeImage](homeImage)


