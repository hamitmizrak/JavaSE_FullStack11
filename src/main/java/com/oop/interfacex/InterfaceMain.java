package com.oop.interfacex;

public class InterfaceMain implements ICrud{

    // CRUD
    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void list() {
        System.out.println("list");
    }
}
