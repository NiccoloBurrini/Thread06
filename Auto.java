public class Auto extends Thread {
    public RisorsaParcheggio r;

    public Auto(String nome, RisorsaParcheggio r) {
        super(nome);
        this.r = r;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " arriva");
        r.park();
        System.out.println(Thread.currentThread().getName() + " esce dal parcheggio");
    }
}