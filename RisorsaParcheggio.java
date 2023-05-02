public class RisorsaParcheggio {

    public static int totPosti = 4;
    public int occupati = 0;
    public boolean is_Full = false;

    public void park() {
        
        try {
            while (is_Full) {
                int attesa = (int) (Math.random() * 10000) + 1;
                System.out.println(Thread.currentThread().getName() + " aspetta per " + attesa + " ms");
                wait(attesa);
            }
            occupati++;
            if (occupati >= totPosti) {
                System.out.println("PARCHEGGIO COMPLETO");
                is_Full = true;
            }
            int tempoParcheggio = (int) (Math.random() * 5000) + 1;
            System.out.println(Thread.currentThread().getName() + " rimarra parcheggiato per " + tempoParcheggio + " ms");
            Thread.sleep(tempoParcheggio);
            occupati--;
            if (occupati < totPosti) {
                is_Full = false;
                System.out.println("PARCHEGGIO LIBERO");
            }
            notify();
        } catch (Exception e) {
        }
    }
}