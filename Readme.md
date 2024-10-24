**What is design pattern ?**
**Ans:** ![img.png](img.png)

![img_1.png](img_1.png)

## Singleton design pattern
<a href="https://www.youtube.com/watch?v=fs6ZUcF-nuc&list=PL0zysOflRCek8kmc_jYl_6C7tpud7U2V_&index=2&ab_channel=LearnCodeWithDurgesh">Youtube Demo!</a>

<ol>
    <li>Constructor will always be private. This way, we prevent creating objects of the class.</li>
    <li>To create a Singleton class:
        <ol>
            <li><b>Static member:</b> It gets memory only once because of static. It contains the instance of the Singleton class.</li>
            <li><b>Private constructor:</b> It prevents the instantiation of the Singleton class from outside the class.</li>
            <li><b>Static factory method:</b> This provides the global point of access to the Singleton object and returns the instance to the caller.</li>
        </ol>
    </li>
</ol>

**Types of singleton classes :**
<ol>
    <li><code>Lazy initialization</code>: Creating the instance of the class when required</li>
    <li><code>Eager initialization</code>: Creating the object when application started</li>
</ol>

**How to make Singleton classes thread safety?** 
**ANS** : By using synchronization

**Different ways of breaking of singleton classes :** 

1. Using Reflections API.
2. Using enum instead of Class.
3. Using Deserialization

## Factory Design pattern

![img_2.png](img_2.png)

## Abstract design pattern
![img_3.png](img_3.png)

## Builder design pattern
![img_4.png](img_4.png)

## Proxy Design pattern
![img_5.png](img_5.png)