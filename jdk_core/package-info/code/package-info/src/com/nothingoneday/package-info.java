/**
 * package-info use method
 * 1.作用
 *      1)为标注在包注解提供便利
 *      2)访问包内部定义类和常量
 *      3)提供包的整体注释说明
 */
@PackageAnnotation
package com.nothingoneday;

/**
 * 包内部访问的类
 */
class PackageClass{
    public void showPackageClass(){
        System.out.println("package-info:PackageClass:showPackageClass");
    }
}

/**
 * 包内部访问的常量
 */
class PackageConstant{
    static final String PACKAGE_CONSTANT = "package-info:PackageConstant:PACKAGE_CONSTANT";
}