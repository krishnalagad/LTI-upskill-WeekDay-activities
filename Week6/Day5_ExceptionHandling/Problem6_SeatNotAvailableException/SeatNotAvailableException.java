package Problem6_SeatNotAvailableException;

import java.util.Scanner;

class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(String message) {
        super(message);
    }
}