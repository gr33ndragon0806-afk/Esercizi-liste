package org.example;

public class Nodo {

    private int info;
    private Nodo next;



    public Nodo() { //Nodo puntatore per l'inizio
        this.info = 0;
        this.next = null;
    }

    public Nodo(int info) { //Nodo finale
        this.info = info;
        this.next = null;
    }

    public Nodo(int info, Nodo next) {
        this.info = info;
        this.next = next;
    }

    public int getInfo() { return info; }

    public void setInfo(int num) {
        info = num;
    }

    public Nodo getNext() { return next; }

    public void setNext(Nodo link) {
        next = link;
    }



    @Override
    public String toString (){

        String q = "[";

        if (next != null) {

            return q + info + "]->" + next;
        }else {

            return q + info + "]->NULL" ;
        }
    }


}
