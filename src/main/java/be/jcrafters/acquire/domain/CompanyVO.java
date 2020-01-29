package be.jcrafters.acquire.domain;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class CompanyVO {
    public static final int MAX_SHARES = 25;
    private final CompanyName companyName;
    private final int remainingShares;
    private final int size;

    public CompanyVO(CompanyName companyName, int remainingShares, int size) {
        checkNotNull(companyName);
        checkArgument(isCorrectRemainingShares(remainingShares));
        checkArgument(isCorrectSize(size));
        this.companyName = companyName;
        this.remainingShares = remainingShares;
        this.size = size;
    }

    private boolean isCorrectRemainingShares(int remainingShares) {
        return remainingShares >= 0 && remainingShares <= MAX_SHARES;
    }

    private boolean isCorrectSize(int size) {
        return size > 1;
    }

    public int getPrice() {
        return companyName.getPrice(size);
    }
}
