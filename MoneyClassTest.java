

class Money {

    int money;

    void setMoney(int money) {
        this.money = money;
    }

    void show() {

        int m50000, m10000, m5000, m1000, m500, m100;
        int tMoney;

        m50000 = money / 50000;
        tMoney = money % 50000; // money - (m50000 * 50000)

        m10000 = tMoney / 10000;
        tMoney = tMoney % 10000;

        m5000 = tMoney / 5000;
        tMoney = tMoney % 5000;

        m1000 = tMoney / 1000;
        tMoney = tMoney % 1000;

        m500 = tMoney / 500;
        tMoney = tMoney % 500;

        m100 = tMoney / 100;
        tMoney = tMoney % 100;

        System.out.println("돈");

        System.out.println("오만원" + m50000 + "장");
        System.out.println("일만원" + m10000 + "장");
        System.out.println("오천운" + m5000 + "장");
        System.out.println("천원" + m1000 + "장");
        System.out.println("오백원" + m500 + "장");
        System.out.println("백원" + m100 + "장");
    }

}
