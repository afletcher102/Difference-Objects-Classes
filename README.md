# Difference-Objects-Classes
A minimal Java project that demonstrates the conceptual and practical differences between classes and objects in object-oriented programming.

# Understanding Classes and Objects
What is a Class?
A class is a blueprint or template. It is a design specification that describes two things:

Attributes (fields) — the data each instance will carry.
Behaviors (methods) — the actions each instance can perform.

A class does not represent a concrete thing that exists in memory at runtime. It is a definition, written once by the programmer, that tells Java what shape future objects should take. You can think of a class the way you think of an architectural blueprint: the blueprint itself is not a house — it is the plan that makes building a house possible.
What is an Object?
An object is a concrete instance created from a class. When you write new Car("Toyota", "Corolla", 2021) in Java, the runtime reads the Car blueprint, allocates a block of memory, fills in the fields with the values you provided, and hands back a live, usable object. That object exists in memory, holds real data, and can perform the behaviors the class defined.
The same blueprint can be used to build as many objects as you need. Every object is independent — it has its own copy of the fields and its own state.

# Three key differences to remember
1. One blueprint, many instances.
A class is written once. From it you can create one object, a thousand objects, or none at all. Each object is a separate entity in memory with its own data.
2. Objects own their state independently.
Two objects built from the same class do not share field values. Changing a field on one object has no effect on another. The class never changes — only the objects change.
3. A class is static structure; an object is dynamic data.
The class defines what can exist. An object is what does exist, right now, in a running program.
