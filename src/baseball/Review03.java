package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam No = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam No2 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam No3 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam No4 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam No5 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam No6 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        No.getRate();
        No2.getRate();
        No3.getRate();
        No4.getRate();
        No5.getRate();
        No6.getRate();

        No.report();
        No2.report();
        No3.report();
        No4.report();
        No5.report();
        No6.report();
    }
}

