package be.jcrafters.acquire.domain;

public enum CompanyName {
    SACKSON(0),
    ZETA(0),
    HYDRA(1),
    FUSION(1),
    AMERICA(1),
    PHOENIX(2),
    QUANTUM(2);

    public static final int MAX_FACTOR = 10;
    private int priceFactorDifference;

    CompanyName(int priceFactorDifference) {
        this.priceFactorDifference = priceFactorDifference;
    }

    public int getPrice(int size) {
        int priceFactor = getFactor(size, MAX_FACTOR);
        return (priceFactorDifference + priceFactor) * 100;
    }

    private int getFactor(int size, int maxFactor) {
        if (size <= 6) {
            return size;
        }
        return Math.min(6 + (size - 1) / 10, maxFactor);
    }
}
