package com.lanou3g.yesterday.toDay;

public class Hero {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void skill(){
        System.out.println("释放了一个技能---沉默 ----" + name);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }

    private void show(String what){
        System.out.println("show:" + what);
    }
}
