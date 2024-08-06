package baseball;

public class BaseBallTeam {

        private String name;
        private int win;
        private int lose;
        private int draw;
        private double Rate;

        public BaseBallTeam(String name, int win, int lose, int draw) {
            this.name = name;
            this.win = win;
            this.lose = lose;
            this.draw = draw;
        }

        public double getRate() {

            return Rate = (double) win / (win + lose) ;

        }

        public void report() {

            System.out.println(name + " の " +"2022年の成績は " + win + " 勝 " + lose + " 負 " + draw + " 分 、勝率は" + getRate() + "です。");

        }
}




