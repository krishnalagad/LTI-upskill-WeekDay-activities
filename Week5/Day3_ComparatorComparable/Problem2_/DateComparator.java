package Problem2_;

import java.util.Comparator;

class DateComparator implements Comparator<Transaction> {
    @Override
    public int compare(Transaction o1, Transaction o2) {
        return o1.getTransaction_date().compareTo(o2.getTransaction_date());
    }
}