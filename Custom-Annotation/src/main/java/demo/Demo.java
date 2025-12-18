package demo;

import interfaces.Info;

import java.lang.reflect.Method;

public class Demo {

    @Info(author = "Ishan", version = 1)
    public void show(){

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Demo demo = new Demo();

        Method getInfo = demo.getClass().getMethod("show");

        if (getInfo.isAnnotationPresent(Info.class)) {
            Info annotation = getInfo.getAnnotation(Info.class);

            System.out.println(annotation.author());
            System.out.println(annotation.version());
        }

    }
}
