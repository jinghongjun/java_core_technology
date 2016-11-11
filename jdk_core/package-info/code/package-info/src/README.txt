package-info.java作用

    1.为标注在包上注解提供便利

    2.声明友好类和包常量
        包中有很多的内部访问的类或常量,可以统一的放在package-info.java类中,方便管理.

    3.提供包的整体注释说明
        package-info可以更好的在代码中维护文档的完整性，并且可以实现代码与文档同步更新
        IntelliJ IDEA-->Tools-->Generate JavaDoc
        乱码处理方法＂Other command line arguments:"栏里输入＂-encoding utf-8 -charset utf-8＂,


package-info相关的问题

    1.在项目开发中，可以放置在包上的常用注解有：Struts的@namespace、Hibernate的@FilterDef和@TypeDef等等。在包下，随便一个类中的包名前加这些注解，
Eclipse会提示“Package annotations must be in file package-info.java”,在该包下建立package-info.java文件，把注解移到这里即可。

    2.使用Checkstyle插件做代码检查时，会报一个警告“Missing package-info.java file.”也是这个package-info文件惹的祸，在各个包下创建一个即可