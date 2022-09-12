package se.iths.ovningsuppgifter.Kap6;

public class Semaphore {
    private int maxNumberOfObjects = 5;

    private Semaphore(){

        this.maxNumberOfObjects--;
    }

    public Semaphore request(){
        if(this.maxNumberOfObjects > 0) {
            return new Semaphore();

        }
        return null;
    }

    public Semaphore release(){

        return null;

    }


}


/*9 Skapa en klass med namnet Semaphore. Det är en klass som man kan skapa ett visst antal objekt av.
Konstruktorn ska vara privat.
I stället för att man skapar ett objekt genom att skriva new Semaphore() ska man anropa en statisk metod med namnet request.
Den ska returnera ett Semaphore-objekt om det finns något tillgängligt, annars returnera null.
Man ska kunna lämna tillbaka objekt med en icke-statisk funktion release.
 */
