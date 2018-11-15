package progressBar;

public class SimpleProgressBar extends ProgressBar {

    public SimpleProgressBar(int full) {
        super(full);
    }

    public SimpleProgressBar(int pos, int full, int step) {
        super(pos, full, step);
    }

    @Override
    public void print() {
        final double PER = (double)pos / full * 100;	// %で進行状況を保持
        final int BAR = pos * step / full;
        
        System.out.print("\r|");

        for(int i = 0; i < BAR; i++) {
            System.out.print("*");
        }

        for(int i = BAR; i < step; i++) {
            System.out.print("-");
        }

        System.out.print(String.format("| %5.1f%%", PER));
        if(pos == full) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ProgressBar pb = new SimpleProgressBar(2,200, 10);
        pb.click();
        pb.print();
    }
}
