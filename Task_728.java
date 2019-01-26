package Task_acmp;

import java.util.Scanner;

public class Task_728 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qualityPair = sc.nextInt();
        int qualityCompany = sc.nextInt();
        int minPrice = 0;
        int currentPrice;
        int numberOfPacks;
        int currentQualityPairCompany = 0;

        for (int i = 0; i < qualityCompany; i++) {
            int qualityPairCompany = sc.nextInt();
            int pricePairCompany = sc.nextInt();

            if (qualityPairCompany > qualityPair) {
                currentPrice = pricePairCompany;

            } else {
                numberOfPacks = qualityPair / qualityPairCompany;
                currentPrice = numberOfPacks * pricePairCompany;
            }
            if (i == 0) {
                minPrice = currentPrice;
                currentQualityPairCompany = qualityPairCompany;

            } else {

                if (currentPrice <= minPrice) {
                    if (currentQualityPairCompany < qualityPairCompany) {
                        minPrice = currentPrice;
                        currentQualityPairCompany = qualityPairCompany;
                    }
                }
            }
        }
        System.out.println(minPrice);
    }
}
