package com.scw.spring5;

public class Orders {

    private String name;

    public Orders(){
        System.out.println("第一步，执行无参构造器创建bean实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步，调用方法设置属性值");
    }

    public void initMethod(){
        System.out.println("第三步，执行初始化方法");
    }

    public void destroyMethod(){
        System.out.println("第五步，执行销毁方法");
    }
}
