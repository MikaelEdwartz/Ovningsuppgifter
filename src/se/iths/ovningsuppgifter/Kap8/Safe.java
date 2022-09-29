package se.iths.ovningsuppgifter.Kap8;

public class Safe<T> {
    public T obj;

    public Safe() {
    }

    public void store(T object) {
        this.obj = object;
    }

    public void retrieve( ){
        System.out.println(this.obj);
        this.obj = null;

    }

    public void print() {
        System.out.println(this.obj);
    }

}

/*

1 Skriv en generisk klass med namnet Safe, som representerar ett kassaskåp
Klassen ska ha metoderna store och retrieve. Store ska kunna lägga till ett objekt i kassaskåpet.
Retrieve ska ta bort och returnera ett objekt som tidigare lagras i kassaskåpet.
*/
