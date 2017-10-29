class threatOne extends Thread {
    @Override
    public void run()
    {
        threatTwo mAnotherOpinion2;
        mAnotherOpinion2 = new threatTwo();
        mAnotherOpinion2.start();
    }
}
class threatTwo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thraet number two!");
        }
        threatThree mAnotherOpinion3;
        mAnotherOpinion3 = new threatThree();
        mAnotherOpinion3.start();
    }
}
class threatThree extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thraet number three!");
        }
    }
}
public class SoftHome10t3 {
    public static void main(String[] args) {
        threatOne mAnotherOpinion;
        mAnotherOpinion = new threatOne();
        mAnotherOpinion.start();
    }
}
