
package main;

public class Radio {
    
    private double FmFrequency = 0;
    private double AmFrequency = 0;
    private char Band = 'A';
    
    public Radio (double FmFrequency, double AmFrequency, char Band) {
        this.FmFrequency = FmFrequency;
        this.AmFrequency = AmFrequency;
        this.Band = Band;
}
    
    public Radio () {
        this.FmFrequency = 33.4;
        this.AmFrequency = 55.6;
        this.Band = 'B';
}    
    
    public void FmFrequency (double currentFmFrequency) {
            this.FmFrequency = currentFmFrequency;    
    }

    public void AmFrequency (double currentAmFrequency) {
            this.AmFrequency = currentAmFrequency;    
    }
    
    public void Band (char currentBand) {
            this.Band = currentBand;   
    }

    public double getFmFrequency() {
            return this.FmFrequency;
    }
    
    public void setFmFrequency(int newFmFrequency) {
            this.FmFrequency = newFmFrequency;
    }

    public double getAmFrequency() {
            return this.AmFrequency;
    }
    
    public void setAmFrequency(int newAmFrequency) {
            this.AmFrequency = newAmFrequency;
    }
    public char getBand() {
            return this.Band;
    }
    
    public void setBand(char newBand) {
            this.Band = newBand;
    }
    
    public void chowRadioChanell() {
        System.out.println("Radio frekvenca je: " + FmFrequency);
        System.out.println("Radio frekvenca je: " + AmFrequency);
        System.out.println("Radio frekvenca je: " + Band);
    }
}
