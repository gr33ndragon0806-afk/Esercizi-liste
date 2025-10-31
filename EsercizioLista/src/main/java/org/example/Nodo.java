package org.example;

public class Nodo {

    public int info;
    public Nodo next;



    public Nodo() {
        this.info = 0;
        this.next = null;
    }

    public Nodo(int info) {
        this.info = info;
        this.next = null;
    }

    public Nodo(int info, Nodo next) {
        this.info = info;
        this.next = next;
    }


    public int getInfo() { return info; }

    public Nodo getNext() { return info; }

    public void setNext(Nodo link) {
        next = link;
    }

}
