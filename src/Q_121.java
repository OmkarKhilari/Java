public class Q_121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));

    }

//    class Solution {
        static int maxProfit(int[] prices) {
            int _maxProfit = 0;

            int buyPrice = prices[0];

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > buyPrice) {
                    if (_maxProfit < prices[i] - buyPrice) {
                        _maxProfit = prices[i] - buyPrice;
                    }
                } else {
                    buyPrice = prices[i];
                }
            }

            return _maxProfit;
        }


    }


//}
