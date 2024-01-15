### Project Evaluation for Terssa's Warehouse Project Submission

#### 1. Complete on time (speed vs accuracy) - 20%
- **Grade:  16%%**
- The project appears to be complete, but there are several issues with the code that suggest it may have been rushed. For example, the `Warehouse` class has a static `stock` list, which is not correct as each warehouse should manage its own stock.

#### 2. Effectiveness (teamwork - planning - running system’s features) - 50%
- **Grade: 32%%**
- The system's features are partially implemented. However, there are significant issues with the implementation that affect the effectiveness of the system. For example, the `Warehouse` class should not have a static `stock` list, and the `User` and `Employee` classes do not follow the inheritance structure as described in the README. The `authenticate` method in the `User` class should always return false, but it is accepting a password, which is not necessary.

#### 3. Efficiency (clean code - well documented - complexity) - 25%
- **Grade: 17%**
- The code is not efficiently structured. The use of static where it is not appropriate, such as in the `Warehouse` class's `stock` list, indicates a misunderstanding of instance management in OOP. There is also a lack of documentation and comments explaining the code, which makes it harder to understand and maintain.

#### 4. Awareness (understanding of tools and technologies as well as classes and methods that are used in your code) - 25%
- **Grade: 13%%%**
- The submission shows a lack of awareness of OOP principles, particularly in the management of class instances and the use of inheritance. The `Warehouse` class should not have a static `stock` list, and the `User` and `Employee` classes do not properly demonstrate inheritance. The `authenticate` method in the `User` class should not accept a password, as it should always return false.

### Overall Grade: 65%
The project has significant issues that need to be addressed. The code does not follow the OOP principles outlined in the README, and there are several critical mistakes that affect the functionality of the system. The use of static where it is not appropriate and the incorrect implementation of inheritance are the most notable problems. The code also lacks documentation, which affects its maintainability.
