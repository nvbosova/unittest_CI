package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be greater than zero");
        }
<<<<<<< HEAD

=======
    
>>>>>>> eeaa0fd11bfd437120e44a0f67944bfaaec1cef4
        boolean isNeedMore = amount % boundary != 0;
        if (!isNeedMore) {
            return 0;
        }

        int remain = boundary - amount % boundary;
        return remain;
    }
}
