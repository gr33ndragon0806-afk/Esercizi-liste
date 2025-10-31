package org.example;

public class Lista {

    private Nodo testa;


    public Lista() {

        testa = null;
    }

    public Lista(Nodo h) {

        this.testa = h;
    }

    public Lista (int info) {

        testa = new Nodo(info, null);
    }



    public boolean isEmpty() {
        return testa == null;
    }

    @Override
    public String toString (){

        String q = "";

        if (testa == null){

            return "[]->NULL";
        }else{

            return "[]->" + testa + "";
        }
    }



    public void addTesta (int n) {

        Nodo nuovo = new Nodo(n);
        if (testa == null){
            testa = nuovo;
        }else {

            nuovo.next = testa;
            testa = nuovo;
        }
    }
}
