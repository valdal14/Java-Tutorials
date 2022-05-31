package com.valdal14.accessmodifiers;
/**
 * JAVA ACCESS MODIFIERS
 *
 * note: If we do not use private, protected or public by default will be package level access modifier
 *
 * -> Class can be only package or public. If we mark it as private it will not be useful at all
 *    and protected is only used with inheritance
 *
 * -> We cannot apply access modifiers to Blocks since they are used by the JVM when an object is
 *    created or called
 *
 * -> private int a; (A private instance variable will be only accessible inside its class)
 *
 * -> int a; (No access modifier specified it will be package level modifier accessible)
 *
 * -> protected int a; (It can be accessed at package level but also from a child class)
 *
 * -> public int a; (Access anywhere across packages)
 *
 * -> The final keyword is a non-access modifier used for classes, attributes and methods,
 *    which makes them non-changeable (impossible to inherit or override)
 */

public class AccessModifiers { }
