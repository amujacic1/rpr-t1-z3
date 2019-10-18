package ba.unsa.etf.rpr;


public class Sat {
    int sati, minute, sekunde;

    Sat(int sati, int minute, int sekunde) {
        postavi(sati, minute, sekunde);
    }

    void postavi(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }

    void  sljedeci() {
        sekunde++;
        if (sekunde == 60) {
            sekunde = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            sati++;
        }
        if (sati == 24) sati = 0;
    }

    public void prethodni() {
        sekunde--;
        if (sekunde == -1) {
            sekunde = 59;
            minute--;
        }
        if (minute == -1) {
            minute = 59;
            sati--;
        }
        if (sati == -1) sati = 23;
    }

    public void pomjeriZa(int pomak) {
        if (pomak > 0) for (int i = 0; i < pomak; i++) sljedeci();
        else for (int i = 0; i < -pomak; i++) prethodni();
    }

    int dajSate() {
        return this.sati;
    }

    int dajMinute() {
        return this.minute;
    }

    int dajSekunde() {
        return this.sekunde;
    }

    void ispisi() {
        System.out.println(this.sati + ":" + this.minute + ":" + this.sekunde);
    }



}
