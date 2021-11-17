package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class Trajes {

    private int id;
    private String[] trajes = {"Huaso/a" ,"Salsa", "Tango","Samba"};
    private int  precios[] = {20000, 15000, 25000, 10000};
    private int stock;

    public  Trajes()
    {

    }

    public Trajes(int id, String[] trajes, int[] precios, int stock) {
        this.id = id;
        this.trajes = trajes;
        this.precios = precios;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getTrajes() {
        return trajes;
    }

    public void setTrajes(String[] trajes) {
        this.trajes = trajes;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trajes trajes1 = (Trajes) o;
        return id == trajes1.id && stock == trajes1.stock && Arrays.equals(trajes, trajes1.trajes) && Arrays.equals(precios, trajes1.precios);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, stock);
        result = 31 * result + Arrays.hashCode(trajes);
        result = 31 * result + Arrays.hashCode(precios);
        return result;
    }

    @Override
    public String toString() {
        return "Trajes{" +
                "id" + id +
                "trajes" + Arrays.toString(trajes) +
                "precios" + Arrays.toString(precios) +
                "stock" + stock +
                '}' ;
    }

    public int anadirAdicional(int valor, int adicional)
    {
        return valor + adicional;
    }

}

