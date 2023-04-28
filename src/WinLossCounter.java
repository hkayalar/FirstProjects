public class WinLossCounter {
    public static void main(String[] args) {
        String[] record = {"win", "loss", "win", "win", "win", "win", "loss"};
        int wins = 0;
        int losses = 0;
        for (int i =0; i<record.length; i++){
            if(record[i].equals("win")){
                wins++;
            }
            else{
                losses++;
            }
        }
        System.out.println("His previous records are " +wins+" wins and "+losses+" losses. Good luck!");
    }
}
