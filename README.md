# DesignPattern_Java
Use java to implement 23 common design patterns.
* AbstractFactory 
抽象工厂模式，对于添加一个产品族的项目比较友好，对于添加新产品的项目不友好
* FactoryMethod
工厂方法模式，需要添加新的需求时对于核心工厂不会改动，满足面向对象的设计思想
* SimpleFactory
简单工厂模式，每次添加新的产品都要对核心类进行修改，没有实现面向对象封装的设计思想
* FactoryPatternExample
简单的计算器，工厂模式的一个应用。选择的是工厂方法模式，添加新的运算时只需要从核心工厂类继承即可，无需改变核心工厂类，而且用户不需要了解运算对象的实例化过程，只需要调用方法即可