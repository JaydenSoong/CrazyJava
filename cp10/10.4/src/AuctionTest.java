package classes;

public class AuctionTest {
    private double initPrice = 30.0;

    /**
     * 因为该方法中显示抛出了AuctionException异常，所以方法签名就声明抛出AuctionException异常
     */
    public void bid(String bidPrice) throws AuctionException {
        Double d = 0.0;
        try {
            d = Double.parseDouble(bidPrice);
        } catch(Exception e) {
            // 此处是本方法自己对异常的处理
            e.printStackTrace();
            // 抛出自定义异常
            throw new AuctionException("竞拍价必须是数值，不能包含其它字符");
        }

        if(initPrice > d) {
            throw new AuctionException("起拍价大于竞拍价，不能竞拍");
        }

        initPrice = d;
    }

    public static void main (String[] args) {
        AuctionTest at = new AuctionTest();
        try {
           at.bid("123f9"); 
        } catch(AuctionException ae) {
            // 捕获到bid()方法中的异常，并对异常进行处理
            System.out.println(ae.getMessage());
        }
    }
}
