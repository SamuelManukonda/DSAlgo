**SOLID Design Principals**

S - Single Responsibility Principle

O- Open/Close Principle

L- Liskov's Substitution Principle

I- Interface Segregation Principle

D- Dependency Inversion Principle 

---

**S - Single Responsibility Principle**

Every class/Interface/method/package should have exactly 1 responsibility
Every code unit, there should have exactly one reason to change code of that code unit


**How to identify SRP** 
1. **Multiple if else statements.**
- Not always true
- If if-else is part of business logic then its fine. 
- You need to identify subjectively


  **Problems with if-else**
- Understandability
- Very difficult to test
- Merge conflicts
- Code duplication
- Less code reuse
- It violates SRP
2. **Monster methods** 
- If a function is usually doing more that what is being intended.
3. **Commons/Utils**
- These are usually a place where a engineer cannot think where to put the code and ends up being a garbage.
- Utils/DateUtils
- Utils/CalenderUtils
- Utils/TimeUtils

**Above of these are still better when segregated.**

**O - Open Close Principle**

The code should be open for extension/extensible and closed for modification.
- easy to add new features
- but by adding new features, something should changed which is already written.

Interference and Abstraction can help here.
When solving this kind of problem, can sometimes lead to class explosion, we can solve that using Liskov's principle.
