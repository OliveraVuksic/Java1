
package main;


public class Television {

    private int Volume = 0;
    private int CurrentProgram = 0;
    private boolean TvOntvOff = false;

    public Television (int Volume, int CurrentProgram, boolean TvOnTvOff) {
        this.Volume = Volume;
        this.CurrentProgram = CurrentProgram;
        this.TvOntvOff = TvOnTvOff;
    }

    public Television () {
        this.Volume = 50;
        this.CurrentProgram = 1;
        this.TvOntvOff = true;
    }

//privatni atribut ​ volume​ koji je ceo broj i označava trenutnu jačinu tona na televizoru,
    public void Volume (int currentVolumeSound) {
            this.Volume = currentVolumeSound;    
    }
//privatni atribut ​ currentProgram​ koji označava broj programa koji je trenutno na
//televizoru, početna vrednost je 0 (ton je utišan do kraja
        public void CurrentProgram (int CurrentProgramOnTV) {
            this.CurrentProgram = CurrentProgramOnTV;    
    }
//privatni atribut ​ turnOn ​ koji označava da li je televizor uključen (true/false)    
        public void turnOn (boolean TvOntvOff) {
            this.TvOntvOff = TvOntvOff;    
    }

//Za svaki od navedenih atributa napraviti javne get i set metode koje će služiti za uzimanje i
//postavljanje vrednosti nad atributima
        public int getVolume() {
            return this.Volume;
    }
        public void setVolume(int newVolume) {
            this.Volume = newVolume;
    }

        public int getCurrentProgram() {
            return this.CurrentProgram;
    }
        public void setCurrentProgram(int newCurrentProgram) {
            this.CurrentProgram = newCurrentProgram;
    }

        public boolean getTvOntvOff() {
            return this.TvOntvOff;
    }
        public void setTvOntvOff(boolean newTvOntvOff) {
            this.TvOntvOff = newTvOntvOff;
    }

    public void showChanell() {
        System.out.println("Volume: " + getVolume());
        System.out.println("Current chanell: " + getCurrentProgram());
        System.out.println("Is tv on or off: " + getTvOntvOff());
        System.out.println("\n");
    }
}
