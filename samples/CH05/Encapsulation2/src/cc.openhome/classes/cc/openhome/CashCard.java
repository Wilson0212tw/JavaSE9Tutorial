package cc.openhome;

class CashCard {
    String number;
    int balance;
    int bonus;
    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }
    
    void store(int money) {  // 儲值時呼叫的方法
        if(money > 0) {
            this.balance += money;
            if(money >= 1000) { 
                this.bonus++;
            }
        }
        else {
            System.out.println("儲值是負的？你是來亂的嗎？");
        }
    }
    
    void charge(int money) { // 扣款時呼叫的方法
        if(money > 0) {
            if(money <= this.balance) {
                this.balance -= money;
            }
            else {
                System.out.println("錢不夠啦！");
            }
        }
        else {
            System.out.println("扣負數？這不是叫我儲值嗎？");
        }
    }
    
    int exchange(int bonus) {  // 兌換紅利點數時呼叫的方法
        if(bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }
}
