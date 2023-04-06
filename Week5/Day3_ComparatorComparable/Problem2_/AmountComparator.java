package Problem2_;

import java.util.Comparator;

class AmountComparator implements Comparator<Transaction> {
    @Override
    public int compare(Transaction o1, Transaction o2) {
        if (o1.getAmount() < o2.getAmount()) {
            return -1;
        } else if (o1.getAmount() > o2.getAmount()) {
            return 1;
        } else {
            return 0;
        }
    }
}
