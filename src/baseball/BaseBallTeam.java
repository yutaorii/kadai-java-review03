package baseball;

public class BaseBallTeam {

        private String name;
        private int win;
        private int lose;
        private int draw;
        private int Rate;
        private String result;

        public BaseBallTeam(String name, int win, int lose, int draw) {
            this.name = name;
            this.win = win;
            this.lose = lose;
            this.draw = draw;
        }

        public void getRate(BaseBallTeam No) {

            double Rate = (double) No.win / (No.win + No.lose) ;

            System.out.println (No.name + " の " +"2022年の成績は " + No.win + " 勝 " + No.lose + " 負 " + No.draw + " 分 、勝率は" + Rate + "です。");
        }
}




