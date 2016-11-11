package com.nothingoneday;

import java.lang.annotation.Annotation;

/**
 * package-info client
 */
public class Client {

    private static final String CURRENT_PACKAGE_NAME = "com.nothingoneday";

    public static Package getCurrentPackage(String name){
        Package p = null;
        if (name != null) {
            p = Package.getPackage(name);
        }
        return p;
    }

    public static Annotation[] getCurrentPackageAnnotations(Package p){
        Annotation[] annotations = null;
        if (p != null) {
            annotations = p.getAnnotations();
        }
        return annotations;
    }

    public static void printCurrentPackageAnnotations(Annotation[] annotations){
        if (annotations != null) {
            for(Annotation annotation : annotations){
                if ( annotation instanceof  PackageAnnotation) {
                    System.out.println("I'm the PackageAnnotation!");
                }
            }
        }
    }

    public static void main(String[] args) {

        // package-info.java作用
        // 1.为标注在包注解提供便利
        System.out.println("package-info.java作用: 1.为标注在包注解提供便利");
        Package p = getCurrentPackage(CURRENT_PACKAGE_NAME);
        Annotation[] annotations = getCurrentPackageAnnotations(p);
        printCurrentPackageAnnotations(annotations);

        //2.访问包内部定义类和常量
        System.out.println("package-info.java作用: 2.访问包内部定义类和常量");
        System.out.println("访问包内部类方法");
        PackageClass pc = new PackageClass();
        pc.showPackageClass();
        System.out.println("访问包内部常量");
        System.out.println("Package Constant: " + PackageConstant.PACKAGE_CONSTANT);

    }

}
