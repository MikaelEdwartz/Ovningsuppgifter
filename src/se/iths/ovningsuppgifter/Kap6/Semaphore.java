package se.iths.ovningsuppgifter.Kap6;

import java.lang.management.GarbageCollectorMXBean;

public class Semaphore {
    private static int maxNumberOfObjects = 5;
    private static String number;

    private Semaphore(){
        this.number = "Ett objekt";
    }

    public static Semaphore request(){
        if(0 < maxNumberOfObjects) {
            return new Semaphore();
        }
        return null;
    }

    public void release(){

        maxNumberOfObjects++;
        setNull();
    }

    public void setNull(){
        this.number = null;
    }

    public String toString(){
        return this.number;
    }


}


/*9 Skapa en klass med namnet Semaphore. Det är en klass som man kan skapa ett visst antal objekt av.
Konstruktorn ska vara privat.
I stället för att man skapar ett objekt genom att skriva new Semaphore() ska man anropa en statisk metod med namnet request.
Den ska returnera ett Semaphore-objekt om det finns något tillgängligt, annars returnera null.
Man ska kunna lämna tillbaka objekt med en icke-statisk funktion release.
 */
