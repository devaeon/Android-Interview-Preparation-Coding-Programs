package com.android.interview.preparation.javaCode;

import com.android.interview.preparation.kotlinCode.KotlinClass;
import com.android.interview.preparation.kotlinCode.KotlinClassKt;
import com.android.interview.preparation.kotlinCode.User;
import com.android.interview.preparation.kotlinCode.extensions.StringKt;

//To run java class main() right click> Run with coverage...
public class JavaCallingKotlin {
    public static void main(String[] args) {
        System.out.println("Hello java class");

        //Calling kotlin method
        int sum = KotlinClassKt.sum(32, 12);
        System.out.println("sum is " + sum);

        //Creating kotlin class object in Java
        KotlinClass kotlinClassObj = new KotlinClass();

        //Call kotlin class property getter/setter
        System.out.println(kotlinClassObj.getName() + "getter");
        kotlinClassObj.setName(kotlinClassObj.getName() + "setter");
        System.out.println(kotlinClassObj.getName());

        //Calling Kotlin’s Default Parameters in Java
        kotlinClassObj.greet("Muzammil Hussain");
//        you cannot directly call a Kotlin function with a default parameter value. Instead,
//        Kotlin generates overloads for Java interoperability. Here’s how you can call it from Java:
        kotlinClassObj.greet();

        //Kotlin Nullability in Java
        kotlinClassObj.greetNullable("Kotlin");
        kotlinClassObj.greetNullable(null); // Calls greet with null

        // Calling Kotlin function without default arguments
        kotlinClassObj.greet("Kotlin", 25);  // Output: Hello, Kotlin. You are 25 years old.

        // Calling Kotlin function with default 'age' argument
        kotlinClassObj.greet("Java", 30);    // Output: Hello, Java. You are 30 years old.

        // Calling Kotlin function with default arguments
        kotlinClassObj.greet("Java");        // Output: Hello, Java. You are 18 years old.


        //Kotlin Extensions in Java
        String result = StringKt.addPrefix("Kotlin");
        System.out.println(result); // Output: Prefix_Kotlin

        // Java code calling Kotlin companion object
        User user = User.Factory.create("John");  // Accessing companion object's create method
        System.out.println(user.getName());  // Output: John
        System.out.println(User.VERSION);  // Output: 1
        System.out.println(User.Factory.getNEW_VERSION());
    }
}
